package dao;

import entitymanager.EntityManager;
import java.util.List;

public abstract class DaoGenerico<T> {
    protected String ruta;
    protected EntityManager entityManager;

    public DaoGenerico(String ruta) {
        this.ruta = ruta;
        this.entityManager = new EntityManager();
    }

    public List<T> getAll() {
        return entityManager.cargarDesdeCSV(ruta, getEntityClass());
    }

    protected abstract Class<T> getEntityClass();
}
