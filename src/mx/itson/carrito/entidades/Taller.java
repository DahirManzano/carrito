/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

/**
 *
 * @author alumnog
 */
public class Taller {

    /**
     * @return the nombreTaller
     */
    public String getNombreTaller() {
        return nombreTaller;
    }

    /**
     * @param nombreTaller the nombreTaller to set
     */
    public void setNombreTaller(String nombreTaller) {
        this.nombreTaller = nombreTaller;
    }

    /**
     * @return the direccionTaller
     */
    public String getDireccionTaller() {
        return direccionTaller;
    }

    /**
     * @param direccionTaller the direccionTaller to set
     */
    public void setDireccionTaller(String direccionTaller) {
        this.direccionTaller = direccionTaller;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    private String nombreTaller;
    private String direccionTaller;
    private String telefono;
    
}
