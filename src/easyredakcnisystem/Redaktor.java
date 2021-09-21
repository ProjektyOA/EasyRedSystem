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
  
    @Override
     public void smazClanek(Clanek c)
      {
       if(this.equals(c.getAutor()))
       {
        System.out.println("Smazal jsem článek, protože jsem jeho autor");
       } else {
               System.out.println("Nemůžu smazat cizí článek");
              }
      }       
}
