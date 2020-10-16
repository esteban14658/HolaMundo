/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Jimmy Alexander Paez Moreno & Esteban Rodrigo Beltran Abello
 */
public class Persona {
    private String nombre;
    private String apellido;

    /**
     * Construcvtor de la clase persona.
     * @param nombre Hace referencia al nombre de la persona.
     * @param apellido Hace referencia al apellidio de la persona.
     */
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * 
     * @return Devuelve el nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre Establece el nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return Devuelve el apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * 
     * @param apellido Establece el apellido de la persona.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
