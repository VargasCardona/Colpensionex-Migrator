package models;

public class Persona {
    private int idPersona;
    private String cedula;
    private String nombre;

    //Constructor sin parametros para Reflection
    public Persona() {}
    
    public Persona(int idPersona, String cedula, String nombre) {
        this.idPersona = idPersona;
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
