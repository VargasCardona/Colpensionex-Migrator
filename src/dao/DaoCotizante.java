package dao;

import models.Cotizante;

public class DaoCotizante extends DaoGenerico<Cotizante> {
    
    public DaoCotizante(String ruta) {
        super(ruta);
    }
    
    @Override
    protected Class<Cotizante> getEntityClass() {
        return Cotizante.class;
    }
    
}
