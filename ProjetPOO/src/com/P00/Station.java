package com.P00;

import java.util.ArrayList;
import java.util.Scanner;

public class Station {

    //----------------Attributs-------------------------

    private int numero ;
    private String nom;
    private String type;
    private String Ligne_Appartenance;


    //--------------Constructeur -----------------------


    public Station (){}
    public Station(int numero,String nom,String type,String Ligne_Appartenance){
        this.numero=numero;
        this.nom=nom;
        this.type=type;
        this.Ligne_Appartenance=Ligne_Appartenance;

    }

    //----------------------Accessuers--------------------

    public String getNom(){ return nom; }

    public String getType(){ return type; }

    public int getNumero() { return numero; }

    public String getLigne_Appartenance() { return Ligne_Appartenance; }

    public void setNumero(int numero) { this.numero = numero; }

    public void setNom(String nom) { this.nom = nom; }

    public void setType(String type) { this.type = type; }




    //-------------------------Methodes------------------------

    public Station Saisie(String Ligne_Appartenance,int nums,String noms, String types){
        //Scanner e=new Scanner(System.in);
       // this.numero=
        this.numero=nums;
       // Scanner f= new Scanner(System.in);
        //this.nom=f.nextLine();
        this.nom=noms;
       // this.type=f.nextLine();
        this.type=types;
        this.Ligne_Appartenance=Ligne_Appartenance;
        Station S=new Station(this.numero,this.nom,this.type,this.Ligne_Appartenance);
        return S;
    }

    //----------------------------------------------------------

    public ArrayList<Station> Creation(int nbr,String Ligne_Appartenance,int nums,String noms, String types){
        ArrayList<Station>ST=new ArrayList<>();
        //Scanner e=new Scanner(System.in);
        //nbr=e.nextInt();
        for (int i=0;i<nbr;i++){
            Station P=new Station();
            P=P.Saisie(Ligne_Appartenance,nums,noms,types);
            ST.add(i,P);

        }
        return ST;
    }

    //-----------------------------------------------------------

    public String toString() {


        return "station "+ numero +nom
                +"est de type" +type;

    }


     //---------------------------------------------------------




    public void afficher () {

        System.out.print (this.toString());

    }



}
