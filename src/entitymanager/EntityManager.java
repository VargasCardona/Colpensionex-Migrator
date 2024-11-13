package entitymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;
import java.time.LocalDate;

public class EntityManager {

    /**
     * Carga desde un archivo csv
     * @param <T>
     * @param rutaArchivo
     * @param tipoEntidad
     * @return lista de entidades
     */
    public <T> List<T> cargarDesdeCSV(String rutaArchivo, Class<T> tipoEntidad) {
        List<T> entidades = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            boolean esPrimeraLinea = true;

            while ((linea = br.readLine()) != null) {
                if (esPrimeraLinea) {
                    esPrimeraLinea = false; // Omitir cabecera si existe
                    continue;
                }
                String[] valores = linea.split(",");
                T entidad = crearEntidadConValores(valores, tipoEntidad);
                if (entidad != null) {
                    entidades.add(entidad);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entidades;
    }

    /**
     * Crea segun la entidad dada
     * @param <T>
     * @param valores
     * @param tipoEntidad
     * @return entidad con los valores del csv
     */
    public <T> T crearEntidadConValores(String[] valores, Class<T> tipoEntidad) {
        try {
            T entidad = tipoEntidad.getDeclaredConstructor().newInstance();
            Field[] campos = tipoEntidad.getDeclaredFields();

            for (int i = 0; i < campos.length; i++) {
                Field campo = campos[i];
                campo.setAccessible(true); // Permitir acceso a campos privados

                // Asignar valor en función del tipo de campo
                if (i < valores.length) {
                    String valor = valores[i];
                    if (campo.getType() == int.class) {
                        campo.setInt(entidad, Integer.parseInt(valor));
                    } else if (campo.getType() == boolean.class) {
                        campo.setBoolean(entidad, valor.equals("true"));
                    } else if (campo.getType() == double.class) {
                        campo.setDouble(entidad, Double.parseDouble(valor));
                    } else if (campo.getType() == String.class) {
                        campo.set(entidad, valor);
                    } else if (campo.getType() == LocalDate.class) {
                        campo.set(entidad, LocalDate.parse(valor));
                    }
                }
            }
            return entidad;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
     public void createCSV(String ruta, List<String> cabecera, List<List<String>> lista) throws IOException{
        List<List<String>> datos = new ArrayList<>();
        datos.add(cabecera);
        datos.addAll(lista);

        try (FileWriter writer = new FileWriter(ruta)) {
            for (List<String> fila : datos) {
                // Escribir cada fila en el archivo
                writer.append(String.join(",", fila));
                writer.append("\n"); // Salto de línea para cada fila
            }
            System.out.println("Archivo CSV creado con éxito.");
        } catch (IOException e) {
            System.err.println("Error al crear el archivo CSV: " + e.getMessage());
        }
        
        
    }
}
