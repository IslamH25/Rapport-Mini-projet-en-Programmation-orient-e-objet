package com.P00;

import java.util.ArrayList;
import java.util.Scanner;

public class Navette {
    //----------------Attributs-------------------------

    private int num_unique;
    private String marque;
    private int année;

    //--------------Constructeur -----------------------

    public Navette(){}

    public Navette (int num_unique,String marque,int année){
        this.num_unique=num_unique; this.marque=marque; this.année=année;
    }

    //----------------------Accessuers--------------------

    public int getNum_unique(){
        return num_unique;
    }

    public void setNum_unique(int num_unique) { this.num_unique = num_unique; }

    public String getMarque(){ return marque; }

    public void setMarque(String marque) { this.marque = marque; }

    public int getAnnée(){
        return année;
    }

    public void setAnnée(int année) { this.année = année; }

    //-------------------------Methodes------------------------

    public String toString(){
        return "navette  :"+num_unique + marque + année;
    }

    //----------------------------------------------------------

    public void afficher(){

        System.out.println(this.toString());
    }

    //-----------------------------------------------------------

    public Navette Saisie(int num,String marq,int ann){
        //Scanner e=new Scanner(System.in);
       // Scanner f=new Scanner(System.in);
        //this.num_unique=e.nextInt();
        this.num_unique=num;
        //this.marque=f.nextLine();
        this.marque=marq;
        //this.année=e.nextInt();
        this.année=ann;
        Navette N=new Navette(this.num_unique,this.marque,this.année);
        return N;
    }

    //------------------------------------------------------------

    public ArrayList<Navette> Creation(int n, String marq,int ann){
        ArrayList<Navette> NA=new ArrayList<>();
        Scanner e=new Scanner(System.in);
        int nb=e.nextInt();
        for (int i=0;i<nb;i++){
            Navette P=new Navette();
            P=P.Saisie(n,marq,ann);
            NA.add(i,P);

        }
        return NA;
    }

}
