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
public class Redaktor extends RegUzivBezPlatu {
  
    public Redaktor(String jmeno) {
      super(jmeno);
    }
    
    public Clanek pridejClanek(String nadpis, String text)
    {
     return new Clanek(nadpis, text);   
    }       
  
    
}
