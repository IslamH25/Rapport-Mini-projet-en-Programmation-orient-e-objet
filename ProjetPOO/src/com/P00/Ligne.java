package com.P00;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Ligne {

    //----------------Attributs-------------------------

    private String numero;
    private MoyTransport M;

    private Station station_de_depart  = new Station();
    private Station station_d_arrivee  = new Station();

    private int nbr;
    private ArrayList<Station> ST=new ArrayList<>(); //station
    private ArrayList<Tronçon>TR=new ArrayList<>();  //troncon
    private ArrayList<Navette>NA=new ArrayList<>();  //navette


    //--------------Constructeur -----------------------

    public Ligne(){ }

    public Ligne(String numero, ArrayList<Station> ST ,int nbr,
                 ArrayList<Tronçon>TR, MoyTransport M,ArrayList<Navette> NA){

        this.nbr=nbr; this.numero=M.toString()+numero; station_de_depart=ST.get(0);
        station_d_arrivee=ST.get(nbr-1); this.ST=ST; this.TR=TR; this.NA=NA; this.M=M;


    }
   //----------------------Accessuers--------------------


    public String getNumero() {
        return numero;
    }

    public MoyTransport getM(){ return M;}

    public Station getStation_d_arrivee() {
        return station_d_arrivee;
    }

    public Station getStation_de_depart() {
        return station_de_depart;
    }

    public int getNbr() {
        return nbr;
    }

    public ArrayList<Station> getST(){return ST;}

    public ArrayList<Navette> getNA() { return NA; }

    public ArrayList<Tronçon> getTR() { return TR; }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNbr(int nbr) { this.nbr = nbr; }



    //-------------------------Methodes------------------------


    public String toString() {


        return "Ligne numero "+ numero+
                " /n moyen de transport" +M.Mtrasport()+
                "depart " +station_de_depart.toString() +
                " arrivee "+ station_d_arrivee.toString();

    }

    //--------------------------------------

    public void afficher () {

        System.out.print (this.toString());

    }

    //----------------------------------------

    public Ligne Saisie(String num, String m,int nbrs){
        Navette N=new Navette();
        Station S=new Station();
        Tronçon T=new Tronçon();
       // Scanner e=new Scanner(System.in);
       // Scanner f=new Scanner(System.in);
        //this.numero=e.nextLine();
        this.numero= num;
       // String t=e.nextLine();
        this.M=MoyTransport.valueOf(m);
       // this.nbr=f.nextInt();
        this.nbr= nbrs;
        Ajout_Navette nav = new Ajout_Navette();
        nav.setVisible(true);
        this.NA=N.Creation(nav.getN(),nav.getMrq(),nav.getAnn());
        Ajout_Station stat = new Ajout_Station();
        stat.setVisible(true);

        this.ST=S.Creation(this.nbr,this.numero,stat.getNums(),stat.getNoms(),stat.getTypes());
        for(int i=1;i<nbr;i++){
            Ajout_Troncon tron = new Ajout_Troncon();
            tron.setVisible(true);

            T.Creation(i,this.ST.get(i-1),this.ST.get(i),this.TR,tron.getNumt(), tron.getKilo(), tron.getEtat() );}
        Ligne L=new Ligne(this.numero,this.ST,this.nbr,this.TR,this.M,this.NA);
        return L;

    }

    //--------------------------------------------

    public ArrayList<Ligne> Creation(int nbl){
        ArrayList<Ligne>LN=new ArrayList<>();
       // Scanner e=new Scanner(System.in);
       // int nbl=e.nextInt();

        for(int i=0;i<nbl;i++){
            Ligne L=new Ligne();
            Ajout_Ligne l = new Ajout_Ligne();
            l.setVisible(true);
            L=L.Saisie(l.getNum(),l.getM(),l.getNbrs());
            LN.add(i,L);
        }
        return LN;
    }



    //----------------------Recherche d'une navette---------------------

    public int Recherche_NA(Navette N){
        return this.NA.indexOf(N);
    }

    //------------------Modification d'une navette-----------------------

    public void Modifier_NA(int i,int n, String marq,int ann){
        Navette N=new Navette();
        N=N.Saisie(n,marq,ann);
        this.NA.set(i,N);

    }

    //----------------suppression d'une navette--------------------

    public void Supprimer_NA(int i){
        this.NA.remove(i);
    }

    //-------------------Ajout d'une navette---------------------

    public void Ajout_NA(int i,int n, String marq,int ann){
        Navette N=new Navette();
        N=N.Saisie(n,marq,ann);
        this.NA.add(i,N);
    }

    //------------------Ajout d'un troncon-----------------------

    public void Ajout_TR(Station station_de_depart,Station station_d_arrivee,int i,int numt, float kilo, String etat){
        Tronçon T=new Tronçon();
        T= T.Saisie(this.ST.get(i),this.ST.get(i+1),numt,kilo,etat);
        this.TR.add(i,T);
    }

    //------------------suppression d'un troncon--------------------

    public void Supprimer_TR(int i){this.TR.remove(i);}
    public int Recherche_ST(Station S){
        return this.ST.indexOf(S);
    }

    //---------------Modification d'une station--------------------

    public void Modifier_ST(int i,String Ligne_Appartenance,int nums,String noms, String types){
        Station S=new Station();
        S=S.Saisie(Ligne_Appartenance,nums,noms,types);
        this.ST.set(i,S);
    }

    //--------------------Ajout d'une station---------------------

    public  void Ajout_ST(int i,String Ligne_Appartenance,int nums,String noms, String types,
                          int numt, float kilo, String etat){
        Station S=new Station();
        S=S.Saisie(Ligne_Appartenance,nums,noms,types);
        if(i==0){
            this.ST.add(i,S);
            this.Ajout_TR(S,this.ST.get(i+1),i,numt,kilo,etat);
        }
        if(i>0&&i<this.ST.size()-1){
            this.ST.add(i,S);
            this.Supprimer_TR(i-1);
            this.Ajout_TR(this.ST.get(i-1),S,i-1,numt,kilo,etat);
        }
        if (i==this.ST.size()){
            this.ST.add(i,S);
            this.Ajout_TR(this.ST.get(i-1),S,i-1,numt,kilo,etat);
        }
    }

    //-----------------Suppression d'une station-----------------

    public void Supprimer_ST(int i){
        Tronçon T=new Tronçon();
        if (i==0){
            this.ST.remove(i);
            this.Supprimer_TR(i);
        }
        if(i>0&&i<this.ST.size()-1){
            this.ST.remove(i);
            T=this.TR.get(i-1).Fusion_Tronçon(this.TR.get(i));
            this.Supprimer_TR(i-1);
            this.Supprimer_TR(i);
            this.TR.add(i-1,T);
        }
        if (i==this.ST.size()-1){
            this.ST.remove(i);
            this.Supprimer_TR(i-1);
        }
}}
