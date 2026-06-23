
package com.LlanquihueTourapp.model;

/**
 * Representa a un guía turístico asociado a un tour.
 * Esta clase será utilizada para aplicar composición.
 * 
 * @author debian12
 */



public class GuiaTuristico {
    
    private String nombre;
    private String especialidad;

    public GuiaTuristico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
     @Override
    public String toString() {
        return "Guía: " + nombre + " | Especialidad: " + especialidad;   
    
 }

}