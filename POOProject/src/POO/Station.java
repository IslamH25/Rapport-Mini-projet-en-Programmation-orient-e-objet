package POO;

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

    public Station Saisie(String Ligne_Appartenance){
        Scanner e=new Scanner(System.in);
        System.out.println("Donnez le numero  de la Station :");
        this.numero=e.nextInt();
        Scanner f= new Scanner(System.in);
        System.out.println("Donnez le nom de la Station :");
        this.nom=f.nextLine();
        System.out.println("Donnez le type de la station :(Principale , secondaire)");
        this.type=f.nextLine();
        this.Ligne_Appartenance=Ligne_Appartenance;
        Station S=new Station(this.numero,this.nom,this.type,this.Ligne_Appartenance);
        return S;
    }

    //----------------------------------------------------------

    public ArrayList<Station> Creation(int nbr,String Ligne_Appartenance){
        ArrayList<Station>ST=new ArrayList<>();
        Scanner e=new Scanner(System.in);
        for (int i=0;i<nbr;i++){
            Station P=new Station();
            P=P.Saisie(Ligne_Appartenance);
            ST.add(i,P);

        }
        return ST;
    }

    //-----------------------------------------------------------

    public String toString() {


        return nom +" numero "+ numero
                +" de type " +type
                +"\n ------";

    }


    //---------------------------------------------------------


    public void afficher () {

        System.out.print (this.toString());

    }



}
