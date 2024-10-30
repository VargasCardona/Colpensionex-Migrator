/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioingenieria;

/**
 *
 * @author nicolasolayarincon
 */
public class Ciudad {
    private int idCiudad;
    private String nombre;
    private int poblacion;

    public Ciudad(int idCiudad, String nombre, int poblacion) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "idCiudad=" + idCiudad +
                ", nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }
}
