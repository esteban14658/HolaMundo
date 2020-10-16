/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.PersonaController;
import model.PersonaModel;
import view.PersonaView;

/**
 *
 * @author Jimmy Alexander Paez Moreno & Esteban Rodrigo Beltran Abello
 */
public class main {
    public static void main(String args[]) {
        PersonaModel modelo = new PersonaModel();
        PersonaView vista = new PersonaView();
        
        PersonaController controlador = new PersonaController(modelo, vista);
        
        vista.setVisible(true);
    }
}
