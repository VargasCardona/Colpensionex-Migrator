/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioingenieria;

import dao.DaoCiudad;
import dao.DaoPersona;
import java.util.List;

/**
 *
 * @author nicolasolayarincon
 */
public class EjercicioIngenieria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rutaPersona = "csv/Persona.csv";
        DaoPersona personaDAO = new DaoPersona(rutaPersona);

        List<Persona> personas = personaDAO.getAll();
        personas.forEach(persona
                -> System.out.println(persona.getNombre() + " " + persona.getCedula())
        );

        String rutaCiudad = "csv/Ciudad.csv";
        DaoCiudad ciudadDAO = new DaoCiudad(rutaCiudad);

        List<Ciudad> ciudades = ciudadDAO.getAll();
        ciudades.forEach(ciudad
                -> System.out.println(ciudad.getNombre() + " " + ciudad.getPoblacion())
        );

    }

}
