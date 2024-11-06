package dao;

import models.Solicitud;

public class DaoSolicitud extends DaoGenerico<Solicitud> {
    
    public DaoSolicitud(String ruta) {
        super(ruta);
    }
    
    @Override
    protected Class<Solicitud> getEntityClass() {
        return Solicitud.class;
    }
    
}
