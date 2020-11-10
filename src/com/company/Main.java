package com.company;

public class Main {

    public static void main(String[] args) {

        //Cream 3 objectes de la classe obra amb el metode constructor
        Obra cruels = new Obra(122,"Cruels","terror");
        Obra elCampio = new Obra(99, "El Campio","Aventura");
        Obra relats = new Obra(298, "relats", "Misteri");

        //Array de objectes de la classe obra
        Obra [] llistaObres = {cruels, elCampio, relats};

        Obra obraMesLlarga = new Obra();

        //Aqui cream un objecte de la classe autor
        Autor mFont = new Autor("Miquel Font", llistaObres);

        //Aqui relacionam el metode obreMesLlarga amb l'objecte mFont
        obraMesLlarga = mFont.obraMésLlarga();

        System.out.println("Les dades de l'obra més llarga de l'autor " + mFont.getNom() + " són:");
        System.out.println("    - Títol: "+ obraMesLlarga.getTitol());
        System.out.println("    - Num.Pàgines: "+ obraMesLlarga.getNpag());
        System.out.println("    - Temàtica: "+ obraMesLlarga.getTematica());

    }
}
