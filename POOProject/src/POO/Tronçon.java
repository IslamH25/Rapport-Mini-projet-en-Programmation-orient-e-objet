package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Tronçon {
    //----------------Attributs-------------------------

    private int numero ;
    private Station station_de_debut  = new Station();
    private Station station_de_fin  = new Station();
    private double kilometrage ;
    private EtatTronçon Etat_Troncon ;

    //--------------Constructeur -----------------------

    public Tronçon(){}

    public Tronçon(int numero,Station station_de_debut,Station station_de_fin,double km, EtatTronçon Etat_Troncon){
        this.numero=numero; this.station_de_debut=station_de_debut;
        this.station_de_fin=station_de_fin; kilometrage=km;
        this.Etat_Troncon=Etat_Troncon;
    }
    //----------------------Accessuers--------------------

    public int getNumero() { return numero; }

    public void setNumero(int numero) { this.numero = numero; }

    public Station getStation_de_debut() { return station_de_debut; }

    public void setStation_de_debut(Station station_de_debut) { this.station_de_debut = station_de_debut; }

    public Station getStation_de_fin() { return station_de_fin; }

    public void setStation_de_fin(Station station_de_fin) { this.station_de_fin = station_de_fin; }

    public double getKilometrage() { return kilometrage; }

    public void setKilometrage(double kilometrage) { this.kilometrage = kilometrage; }

    public EtatTronçon getEtat_Troncon() { return Etat_Troncon; }

    public void setEtat_Troncon(EtatTronçon etat_Troncon) { Etat_Troncon = etat_Troncon; }

    //-------------------------Methodes------------------------

    public Tronçon Saisie(Station station_de_debut,Station station_de_fin){

        Scanner e=new Scanner(System.in);
        System.out.println("Donnez le numero  du Tronçon:");
        this.numero=e.nextInt();
        Scanner f= new Scanner(System.in);
        this.station_de_debut=station_de_debut;
        this.station_de_fin=station_de_fin;
        System.out.println("Donnez la longueure du Troncon en kilometre :");
        this.kilometrage=e.nextDouble();
        System.out.println("Donnez l'etat du Troncon :( Bon ,Moyen, Dégradé)");
        String E=f.nextLine();
        this.Etat_Troncon=EtatTronçon.valueOf(E);
        Tronçon T=new Tronçon(this.numero,this.station_de_debut,this.station_de_fin,this.kilometrage,this.Etat_Troncon);
        return T;
    }
    //---------------------------------------------------------------


    public void Creation(int nbr,Station station_de_debut,Station station_de_fin,ArrayList<Tronçon>TR){
        Tronçon P=new Tronçon();
        P=P.Saisie(station_de_debut,station_de_fin);
        TR.add(nbr-1,P);

    }

    //-----------------------------------------------------------------

    public Tronçon Fusion_Tronçon(Tronçon T){
        Scanner e=new Scanner(System.in);
        EtatTronçon E;
        Station S1=new Station();
        Station S2=new Station();
        int num=e.nextInt();
        double kilm=this.kilometrage+T.kilometrage;
        if(this.Etat_Troncon.ordinal()<T.Etat_Troncon.ordinal())
            E=this.Etat_Troncon;
        else
            E=T.Etat_Troncon;
        S1=this.station_de_debut;
        S2=T.station_de_fin;
        Tronçon P=new Tronçon(num,S1,S2,kilm,E);
        return P;

    }
}
