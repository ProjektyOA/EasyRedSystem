package easyredakcnisystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hodl
 */
public class Clanek {
  private String nadpis;
  private String text;
  private  Redaktor  autor;

    public Clanek(String nadpis, String text) {
        this.nadpis = nadpis;
        this.text = text;
        this.autor = new Redaktor("Default");
    }

    public Redaktor getAutor() {
        return autor;
    }

    public void setAutor(Redaktor autor) {
        this.autor = autor;
    }

    
    
    public Clanek(String nadpis, String text, Redaktor autor) {
        this.nadpis = nadpis;
        this.text = text;
        this.autor = autor;
    }
    
    

    public String getNadpis() {
        return nadpis;
    }

    public void setNadpis(String nadpis) {
        this.nadpis = nadpis;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

  
}
