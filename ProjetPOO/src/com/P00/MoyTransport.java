package com.P00;

public enum MoyTransport {
    B(6,20,50),
    T(6,21,40),
    TR(7,20,70),
    M(7,20,50);

    //----------------Attributs-------------------------

    final int heure_debut,heure_fin,nbr_moyen_voyageur;


    //--------------Constructeur -----------------------


    MoyTransport(int heure_debut ,int heure_fin,int nbr_moyen_voyageur ){
        this.heure_fin=heure_fin;
        this.heure_debut=heure_debut;
        this.nbr_moyen_voyageur=nbr_moyen_voyageur;

    }
    //-------------------------Methodes------------------------
    public String Mtrasport(){
        if (MoyTransport.B.equals(this))
            return "bus";
        if (MoyTransport.T.equals(this))
            return"Tramway";
        if (MoyTransport.TR.equals(this))
            return "Train";
        if (MoyTransport.M.equals(this))
            return "Metro";
        return null;
    }
}
