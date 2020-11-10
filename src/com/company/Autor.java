package com.company;

public class Autor {

    //Declaram els atributs de la classe autor
    private String nom;
    private Obra [] obres;

    //Metode constructor de la classe autor
    public Autor (String nom, Obra [] obres){
        this.nom = nom;
        this.obres = obres;
    }

    public int getNumeroObres(){
        return this.obres.length;
    }

    public String getNom() {
        return nom;
    }

    //Metodes per tal d'accedir a l'obra més llarga de cada autor.
    public Obra obraMésLlarga(){

        //Variables necessaries
        //NumPag son el numero de pagines de cada obra
        int numPag;
        //numPagMax i guardarem el valor del numPag mes alt
        int numPagMax = 0;
        //Variable necessaria per relacionar l'index de l'array amb les obres
        int indexObra = 0;

        //Bucle que recorr l'array d'obres
        for (int i=0; i <= this.obres.length - 1; i++){


            numPag = this.obres[i].getNpag();

            //Aqui es on miram quina es l'obra més llarga y guardam el seu index a la variable indexObra
            if (numPag > numPagMax){
                numPagMax = numPag;
                indexObra = i;
            }

        }

        //Aquest metode ens retornara l'index de lobra més llarga
        return this.obres[indexObra];
    }

}
