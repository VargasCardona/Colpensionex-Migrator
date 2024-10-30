package dao;

import models.Persona;

public class DaoPersona extends DaoGenerico<Persona>  {

    public DaoPersona(String ruta) {
        super(ruta);
    }

    @Override
    protected Class<Persona> getEntityClass() {
        return Persona.class;
    }
}
