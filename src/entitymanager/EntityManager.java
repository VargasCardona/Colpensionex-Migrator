package entitymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;

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
    private <T> T crearEntidadConValores(String[] valores, Class<T> tipoEntidad) {
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
                    } else if (campo.getType() == String.class) {
                        campo.set(entidad, valor);
                    }
                    // Agrega más tipos según lo necesites
                }
            }
            return entidad;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
