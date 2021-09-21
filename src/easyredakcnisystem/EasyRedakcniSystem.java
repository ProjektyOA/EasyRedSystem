/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyredakcnisystem;

/**
 *
 * @author hodl
 */
public class EasyRedakcniSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Admin vlada = new Admin("Vlada");
      Redaktor lukas = new Redaktor("Lukas");
      RegUzivatel tomas = new Admin("Tomáš", 5);
     // Admin marek = new RegUzivatel("Marek");
    }
    
}
