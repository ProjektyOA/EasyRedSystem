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
public class Admin extends RegUzivatel{
 private int plat;

    public Admin(String jmeno)
    {
     super(jmeno);
     this.plat = 0;
    }      
 
    public Admin(String jmeno, int plat) {
        super(jmeno);
        this.plat = plat;
    }
    
    public Redaktor pridejRedaktora(String jm)
    {
     return new Redaktor(jm);   
    } 
    
    public void smazUzivatele(RegUzivatel u)
    {
     System.out.println("Smazal jsem "+u.getJmeno());
    }       
 
}
