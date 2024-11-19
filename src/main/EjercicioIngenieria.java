package main;

import workflows.ProcesadorCsv;
import dao.DaoPersona;
import entitymanager.EntityManager;
import java.util.ArrayList;
import java.util.List;
import models.Persona;

public class EjercicioIngenieria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String rutaPersona = "csv/Persona.csv";
//        DaoPersona personaDAO = new DaoPersona(rutaPersona);
//
//        List<Persona> personas = personaDAO.getAll();
//        personas.forEach(persona -> 
//                System.out.println(persona.getNombre() + " " + persona.getCedula())
//        );
//
//        String rutaCiudad = "csv/Ciudad.csv";
//        DaoCiudad ciudadDAO = new DaoCiudad(rutaCiudad);
//
//        List<Ciudad> ciudades = ciudadDAO.getAll();
//        ciudades.forEach(ciudad ->
//                System.out.println(ciudad.getNombre() + " " + ciudad.getPoblacion())
//        );
//        try{
//            EntityManager em = new EntityManager();
//            em.createCSV();
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }

         ProcesadorCsv procesador = new ProcesadorCsv();
          procesador.processAllCsvFiles();
          
       
//        String rutaDatos = "datos.csv";
//        Persona[] personasSo = {
//            new Persona(978, "1090272917", "Mateo Loaiza García"),
//            new Persona(666, "987654321", "Jhon Doe"),   
//            new Persona(123, "234", "Keyzer Soze"),   
//            new Persona(987, "567", "Pedro Rodriguez"),   
//            new Persona(777, "777", "Si"),
//        };
//        List<List<String>> datos = new ArrayList<>();
//        for (Persona persona : personasSo) {
//            datos.add(persona.toStringList());
//        }
//        
//        try{
//            EntityManager em = new EntityManager();
//            em.createCSV(rutaDatos, personasSo[0].getCabecera(), datos);
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//        
//        DaoPersona personaDAOSo = new DaoPersona(rutaDatos);
//        List<Persona> respuesta = personaDAOSo.getAll();
//        respuesta.forEach(persona -> 
//                System.out.println(persona.toString())
//        );
    }

}
