package workflows;

import entitymanager.EntityManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import models.Persona;
import models.Solicitud;

public class ProcesadorCsv {

    EntityManager em = new EntityManager();

    public void processAllCsvFiles() {
        try (Stream<Path> paths = Files.walk(Paths.get("resources/SolicitudesRecibidas"))) {
            paths.filter(Files::isRegularFile) // Only regular files
                    .filter(path -> path.toString().endsWith(".csv")) // Only CSV files
                    .forEach(this::processSingleCsvFile); // Process each file one by one
        } catch (IOException e) {
            System.out.println("Error accessing files: " + e.getMessage());
        }
    }

    public void processSingleCsvFile(Path csvFile) {
        List<Solicitud> listaSolicitudes = em.cargarDesdeCSV(csvFile.toString(), Solicitud.class);
        System.out.println(listaSolicitudes);
    }

   

}
