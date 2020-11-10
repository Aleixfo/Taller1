package com.company;

public class Obra {

    //Atributs de la classe obra
    private int npag;
    private String titol;
    private String tematica;

    //Metode constructor de la classe obra buit
    public Obra(){
    }

    //Metode constructor de la classe obra
    public Obra (int npag, String titol, String tematica){

        this.npag = npag;
        this.tematica = tematica;
        this.titol = titol;

    }

    //Metodes get del titol i el numero de pagines de les obres
    public String getTitol(){
        return this.titol;
    }
    public int getNpag(){
        return this.npag;
    }

    public String getTematica(){
        return this.tematica;
    }



}
