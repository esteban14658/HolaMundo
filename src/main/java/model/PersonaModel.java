/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import main.Persona;

/**
 *
 * @author Jimmy Alexander Paez Moreno & Esteban Rodrigo Beltran Abello
 */
public class PersonaModel {
    private final static List<Persona> listaPersona = new ArrayList();

    /**
     * 
     * @return Devuelve una arreglo de personas simulando un select * a base de
     * datos.
     */    
    public DefaultTableModel getListaPersona(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        
        for(Persona pers: listaPersona){
            Object[] fila = new Object[2];
            fila[0] = pers.getNombre();
            fila[1] = pers.getApellido();
            
            modelo.addRow(fila);
        }
        
        return modelo;
    }

    /**
     * 
     * @param persona Agrega una persona al arreglo de personas simulando un
     * insert into en base de datos.
     */
    public void agregarPersona(Persona persona) {
        PersonaModel.listaPersona.add(persona);
    }
}
