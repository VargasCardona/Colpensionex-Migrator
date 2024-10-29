/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ejercicioingenieria.Persona;
import java.util.List;

/**
 *
 * @author nicolasolayarincon
 */
public class DaoPersona extends DaoGenerico<Persona>  {

    public DaoPersona(String ruta) {
        super(ruta);
    }

    @Override
    public List<Persona> getAll() {
        return entityManager.cargarDesdeCSV(ruta, Persona.class);
    }
}
