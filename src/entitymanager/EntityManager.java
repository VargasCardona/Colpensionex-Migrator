/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitymanager;

import ejercicioingenieria.Ciudad;
import ejercicioingenieria.Persona;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nicolasolayarincon
 */
public class EntityManager {

    public <T> List<T> cargarDesdeCSV(String rutaArchivo, Class<T> tipoEntidad) {
        List<T> entidades = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            boolean esPrimeraLinea = true;

            while ((linea = br.readLine()) != null) {
                if (esPrimeraLinea) {
                    esPrimeraLinea = false; // omitir cabecera
                    continue;
                }
                String[] valores = linea.split(",");
                T entidad = convertirALaEntidad(valores, tipoEntidad);
                if (entidad != null) {
                    entidades.add(entidad);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entidades;
    }

    private <T> T convertirALaEntidad(String[] valores, Class<T> tipoEntidad) {
        try {
            if (tipoEntidad == Persona.class) {
                Persona persona = new Persona(
                    Integer.parseInt(valores[0]),
                    valores[1],
                    valores[2]
                );
                return tipoEntidad.cast(persona);
            }else if (tipoEntidad == Ciudad.class) {
                Ciudad ciudad = new Ciudad(
                    Integer.parseInt(valores[0]),
                    valores[1],
                    Integer.parseInt(valores[2])
                );
                return tipoEntidad.cast(ciudad);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
