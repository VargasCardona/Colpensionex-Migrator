package models;

import java.time.LocalDate;

public class Solicitud {
    private int idSolicitud; 
    private LocalDate fechaCreacion; 
    private LocalDate fechaUltimaActualizacion; 
    private String estado; 


    // parte del cotizante
    private String idCotizante;
    private String nombre;
    private String fondoOrigen;
    private String fondoDestino;
    private boolean sexo;
    private LocalDate fechaNacimiento;
    private String ciudadNacimiento;
    private String ciudadResidencia;
    private String institucionPublica;

    private boolean prePensionado;
    private boolean condecoracion;
    private int numHijos;
    private boolean verificadoPorProcuraduria;
    private boolean verificadoPorFiscalia;
    private boolean verificadoPorContraloria;

    private boolean enListaNegra;
    private LocalDate fechaIngresoListaNegra;
    private boolean observacionDisciplinaria;
    private String tieneFamiliaEnPolicia;
    private int semanasCotizadas;

    // Constructor sin parámetros para Reflection
    public Solicitud() {}

    // Constructor con parámetros
    public Solicitud(int idSolicitud, String idCotizante, LocalDate fechaCreacion, String estado, String nombre, 
                    String fondoOrigen, String fondoDestino, boolean sexo, 
                    LocalDate fechaNacimiento, boolean verificadoPorProcuraduria, boolean verificadoPorFiscalia, 
                    boolean verificadoPorContraloria,String ciudadNacimiento, String ciudadResidencia,
                    String institucionPublica, boolean prePensionado, boolean condecoracion, int numHijos,
                    boolean enListaNegra, LocalDate fechaIngresoListaNegra, boolean observacionDisciplinaria,
                    String tieneFamiliaEnPolicia,int semanasCotizadas) {
        this.idSolicitud = idSolicitud;
        this.fechaCreacion = fechaCreacion;
        this.fechaUltimaActualizacion = fechaCreacion; 
        this.estado = estado;
        this.idCotizante = idCotizante;
        this.nombre = nombre;
        this.fondoOrigen = fondoOrigen;
        this.fondoDestino = fondoDestino;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.verificadoPorProcuraduria = verificadoPorProcuraduria;
        this.verificadoPorFiscalia = verificadoPorFiscalia;
        this.verificadoPorContraloria = verificadoPorContraloria;
        this.ciudadNacimiento = ciudadNacimiento;
        this.ciudadResidencia = ciudadResidencia;
        this.institucionPublica = institucionPublica;
        this.prePensionado = prePensionado;
        this.condecoracion = condecoracion;
        this.numHijos = numHijos;
        this.enListaNegra = enListaNegra;
        this.fechaIngresoListaNegra = fechaIngresoListaNegra;
        this.observacionDisciplinaria = observacionDisciplinaria;
        this.tieneFamiliaEnPolicia = tieneFamiliaEnPolicia;
        this.semanasCotizadas = semanasCotizadas;
    }

    // Getters y Setters
    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
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
    

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getInstitucionPublica() {
        return institucionPublica;
    }

    public void setInstitucionPublica(String institucionPublica) {
        this.institucionPublica = institucionPublica;
    }

    public boolean isPrePensionado() {
        return prePensionado;
    }

    public void setPrePensionado(boolean prePensionado) {
        this.prePensionado = prePensionado;
    }

    public boolean isCondecoracion() {
        return condecoracion;
    }

    public void setCondecoracion(boolean condecoracion) {
        this.condecoracion = condecoracion;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
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

    public boolean isEnListaNegra() {
        return enListaNegra;
    }

    public void setEnListaNegra(boolean enListaNegra) {
        this.enListaNegra = enListaNegra;
    }

    public LocalDate getFechaIngresoListaNegra() {
        return fechaIngresoListaNegra;
    }

    public void setFechaIngresoListaNegra(LocalDate fechaIngresoListaNegra) {
        this.fechaIngresoListaNegra = fechaIngresoListaNegra;
    }

    public boolean isObservacionDisciplinaria() {
        return observacionDisciplinaria;
    }

    public void setObservacionDisciplinaria(boolean observacionDisciplinaria) {
        this.observacionDisciplinaria = observacionDisciplinaria;
    }

    public int getSemanasCotizadas() {
        return semanasCotizadas;
    }

    public void setSemanasCotizadas(int semanasCotizadas) {
        this.semanasCotizadas = semanasCotizadas;
    }
    
    public boolean getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String isTieneFamiliaEnPolicia() {
        return tieneFamiliaEnPolicia;
    }

    public void setTieneFamiliaEnPolicia(String tieneFamiliaEnPolicia) {
        this.tieneFamiliaEnPolicia = tieneFamiliaEnPolicia;
    }
    

    public int calcularEdad() {
        return LocalDate.now().getYear() - this.fechaNacimiento.getYear();
    }
    @Override
    public String toString() {
        return "Solicitud{" +
                "idSolicitud=" + idSolicitud +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaUltimaActualizacion=" + fechaUltimaActualizacion +
                ", estado='" + estado + '\'' +
                "idCotizante=" + idCotizante +
                ", nombre='" + nombre + '\'' +
                ", fondoOrigen='" + fondoOrigen + '\'' +
                ", fondoDestino='" + fondoDestino + '\'' +
                ", sexo=" + sexo +
                ", fechaNacimiento=" + fechaNacimiento +
                ", ciudadNacimiento='" + ciudadNacimiento + '\'' +
                ", ciudadResidencia='" + ciudadResidencia + '\'' +
                ", institucionPublica='" + institucionPublica + '\'' +
                ", prePensionado=" + prePensionado +
                ", condecoracion=" + condecoracion +
                ", numHijos=" + numHijos +
                ", verificadoPorProcuraduria=" + verificadoPorProcuraduria +
                ", verificadoPorFiscalia=" + verificadoPorFiscalia +
                ", verificadoPorContraloria=" + verificadoPorContraloria +
                ", enListaNegra=" + enListaNegra +
                ", fechaIngresoListaNegra=" + fechaIngresoListaNegra +
                ", observacionDisciplinaria=" + observacionDisciplinaria +
                ", tieneFamiliaEnPolicia=" + tieneFamiliaEnPolicia +
                ", semanasCotizadas=" + semanasCotizadas +
                '}';
    }
    
}