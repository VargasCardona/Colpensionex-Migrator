package models;

import java.time.LocalDate;

public class Cotizante {
    private String idCotizante;
    private String nombre;
    private String identificacion;
    private String fondoOrigen;
    private String fondoDestino;
    private boolean embargoPensiones;
    private LocalDate fechaNacimiento;
    private boolean verificadoPorProcuraduria;
    private boolean verificadoPorFiscalia;
    private boolean verificadoPorContraloria;

    // Constructor sin parámetros para Reflection
    public Cotizante() {}

    public Cotizante(String idCotizante, String nombre, String identificacion, String fondoOrigen, 
                     String fondoDestino, boolean embargoPensiones, LocalDate fechaNacimiento,
                     boolean verificadoPorProcuraduria, boolean verificadoPorFiscalia, boolean verificadoPorContraloria) {
        this.idCotizante = idCotizante;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fondoOrigen = fondoOrigen;
        this.fondoDestino = fondoDestino;
        this.embargoPensiones = embargoPensiones;
        this.fechaNacimiento = fechaNacimiento;
        this.verificadoPorProcuraduria = verificadoPorProcuraduria;
        this.verificadoPorFiscalia = verificadoPorFiscalia;
        this.verificadoPorContraloria = verificadoPorContraloria;
    }

    public String getIdCotizante() {
        return idCotizante;
    }

    public void setIdCotizante(String idCotizante) {
        this.idCotizante = idCotizante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFondoOrigen() {
        return fondoOrigen;
    }

    public void setFondoOrigen(String fondoOrigen) {
        this.fondoOrigen = fondoOrigen;
    }

    public String getFondoDestino() {
        return fondoDestino;
    }

    public void setFondoDestino(String fondoDestino) {
        this.fondoDestino = fondoDestino;
    }

    public boolean isEmbargoPensiones() {
        return embargoPensiones;
    }

    public void setEmbargoPensiones(boolean embargoPensiones) {
        this.embargoPensiones = embargoPensiones;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isVerificadoPorProcuraduria() {
        return verificadoPorProcuraduria;
    }

    public void setVerificadoPorProcuraduria(boolean verificadoPorProcuraduria) {
        this.verificadoPorProcuraduria = verificadoPorProcuraduria;
    }

    public boolean isVerificadoPorFiscalia() {
        return verificadoPorFiscalia;
    }

    public void setVerificadoPorFiscalia(boolean verificadoPorFiscalia) {
        this.verificadoPorFiscalia = verificadoPorFiscalia;
    }

    public boolean isVerificadoPorContraloria() {
        return verificadoPorContraloria;
    }

    public void setVerificadoPorContraloria(boolean verificadoPorContraloria) {
        this.verificadoPorContraloria = verificadoPorContraloria;
    }

    @Override
    public String toString() {
        return "Cotizante{" +
                "idCotizante=" + idCotizante +
                ", nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", fondoOrigen='" + fondoOrigen + '\'' +
                ", fondoDestino='" + fondoDestino + '\'' +
                ", embargoPensiones=" + embargoPensiones +
                ", fechaNacimiento=" + fechaNacimiento +
                ", verificadoPorProcuraduria=" + verificadoPorProcuraduria +
                ", verificadoPorFiscalia=" + verificadoPorFiscalia +
                ", verificadoPorContraloria=" + verificadoPorContraloria +
                '}';
    }
}
