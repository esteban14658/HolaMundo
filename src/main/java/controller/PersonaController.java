/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.Persona;
import model.PersonaModel;
import view.PersonaView;

/**
 *
 * @author Jimmy Alexander Paez Moreno & Esteban Rodrigo Beltran Abello
 */
public class PersonaController {
    private PersonaModel personaModel;
    private PersonaView personaView;

    public PersonaController(PersonaModel personaModel, PersonaView personaView) {
        this.personaModel = personaModel;
        this.personaView = personaView;
        
        this.personaView.agregarBotonListener(new AgregarBotonListener());
    }
    
    class AgregarBotonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre, apellido;
            
            try{
                nombre = personaView.getTFNombre();
                apellido = personaView.getTFApellido();
                
                Persona persona = new Persona(nombre,apellido);
                
                personaModel.agregarPersona(persona);
                
                personaView.setTableModelPersonas(personaModel.getListaPersona());
            }catch(Exception ex){
                personaView.mostrarError("Ambos campos deben estar llenos.");
                System.out.println(ex.getMessage());
            }
        }
        
    }
}
