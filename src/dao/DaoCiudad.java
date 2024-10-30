package dao;

import models.Ciudad;

public class DaoCiudad extends DaoGenerico<Ciudad>  {

    public DaoCiudad(String ruta) {
        super(ruta);
    }

    @Override
    protected Class<Ciudad> getEntityClass() {
        return Ciudad.class;
    }
}
