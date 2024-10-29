/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ejercicioingenieria.Ciudad;
import java.util.List;

/**
 *
 * @author nicolasolayarincon
 */
public class DaoCiudad extends DaoGenerico<Ciudad>  {

    public DaoCiudad(String ruta) {
        super(ruta);
    }

    @Override
    public List<Ciudad> getAll() {
        return entityManager.cargarDesdeCSV(ruta, Ciudad.class);
    }
}
