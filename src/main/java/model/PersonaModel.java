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
 * @author Jimmy Alexander Paez Moreno & Esteban Rodrigo Beltran Abello
 */
public class PersonaModel {
    private final static List<PersonaModel> listaPersona = new ArrayList();
    private String nombre;
    private String apellido;

    /**
     * 
     * @param nombre Hace referencia al nombre de la persona.
     * @param apellido Hace referencia al apellido de la persona.
     */
    public PersonaModel(String nombre, String apellido) {
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

    /**
     * 
     * @return Devuelve una arreglo de personas simulando un select * a base de
     * datos.
     */
    public static List<PersonaModel> getListaPersona() {
        return listaPersona;
    }

    /**
     * 
     * @param persona Agrega una persona al arreglo de personas simulando un
     * insert into en base de datos.
     */
    public void agregarPersona(PersonaModel persona) {
        PersonaModel.listaPersona.add(persona);
    }
}
