/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entitymanager.EntityManager;
import java.util.List;

/**
 *
 * @author nicolasolayarincon
 */
public abstract class DaoGenerico<T> {
    protected String ruta;
    protected EntityManager entityManager;

    public DaoGenerico(String ruta) {
        this.ruta = ruta;
        this.entityManager = new EntityManager();
    }

    public abstract List<T> getAll();
}
