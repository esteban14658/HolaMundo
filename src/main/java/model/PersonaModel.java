/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jimmy Alexander Paez Moreno
 */
public class Persona {
    private final static List<Persona> listaPersona = new ArrayList();
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static List<Persona> getListaPersona() {
        return listaPersona;
    }

    public void agregarPersona(Persona persona) {
        Persona.listaPersona.add(persona);
    }
}
