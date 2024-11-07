package main;

import dao.DaoCiudad;
import dao.DaoPersona;
import entitymanager.EntityManager;
import java.util.List;
import models.Ciudad;
import models.Persona;

public class EjercicioIngenieria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rutaPersona = "csv/Persona.csv";
        DaoPersona personaDAO = new DaoPersona(rutaPersona);

        List<Persona> personas = personaDAO.getAll();
        personas.forEach(persona -> 
                System.out.println(persona.getNombre() + " " + persona.getCedula())
        );

        String rutaCiudad = "csv/Ciudad.csv";
        DaoCiudad ciudadDAO = new DaoCiudad(rutaCiudad);

        List<Ciudad> ciudades = ciudadDAO.getAll();
        ciudades.forEach(ciudad ->
                System.out.println(ciudad.getNombre() + " " + ciudad.getPoblacion())
        );
        try{
            EntityManager em = new EntityManager();
            em.createCSV();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
           
    }

}
