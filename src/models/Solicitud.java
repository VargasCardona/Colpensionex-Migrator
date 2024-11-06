package models;

import java.time.LocalDate;

public class Solicitud {
    private int idSolicitud; // Identificador único de la solicitud
    private String idCotizante; // Referencia al cotizante que realiza la solicitud
    private LocalDate fechaCreacion; // Fecha en la que se crea la solicitud
    private LocalDate fechaUltimaActualizacion; // Fecha de la última actualización de estado de la solicitud
    private String estado; // Estado actual de la solicitud como cadena de texto

    // Constructor sin parámetros para Reflection
    public Solicitud() {}

    // Constructor con parámetros
    public Solicitud(int idSolicitud, String idCotizante, LocalDate fechaCreacion, String estado) {
        this.idSolicitud = idSolicitud;
        this.idCotizante = idCotizante;
        this.fechaCreacion = fechaCreacion;
        this.fechaUltimaActualizacion = fechaCreacion; // Inicialmente igual a la fecha de creación
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getIdCotizante() {
        return idCotizante;
    }

    public void setIdCotizante(String idCotizante) {
        this.idCotizante = idCotizante;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(LocalDate fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "idSolicitud=" + idSolicitud +
                ", idCotizante=" + idCotizante +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaUltimaActualizacion=" + fechaUltimaActualizacion +
                ", estado='" + estado + '\'' +
                '}';
    }
    
}
