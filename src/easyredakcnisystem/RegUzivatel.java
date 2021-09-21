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
public class RegUzivatel {
  private String jmeno;

    public RegUzivatel(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void prihlasSe()
    {
    
    }
    
    public void odhlasSe()
    {
    
    }
    
    public void smazClanek(Clanek c)
    {
     System.out.println("Nemáte oprávnění smazat článek");
    }       
}
