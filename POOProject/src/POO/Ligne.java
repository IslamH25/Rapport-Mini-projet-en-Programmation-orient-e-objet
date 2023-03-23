package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Ligne {
    // ------------------- Attributs --------------------

    private MoyTransport M;
    private String numero;

    private Station station_de_depart  = new Station();
    private Station station_d_arrivee  = new Station();
    private int nbr;

    private ArrayList<Station> ST=new ArrayList<>();
    private ArrayList<Tronçon>TR=new ArrayList<>();
    private ArrayList<Navette>NA=new ArrayList<>();

    // -------------------constructeur-------------------

    public Ligne(){

    }
    public Ligne(String numero, ArrayList<Station> ST ,int nbr,
                 ArrayList<Tronçon>TR, MoyTransport M,ArrayList<Navette> NA){

        this.nbr=nbr;
        this.numero=M.toString()+numero;
        station_de_depart=ST.get(0);
        station_d_arrivee=ST.get(nbr-1);
        this.ST=ST; this.TR=TR; this.NA=NA; this.M=M;


    }
    //----------------------Accessuers--------------------

    public String getNumero() {
        return numero;
    }

    public MoyTransport getM() { return M; }

    public Station getStation_d_arrivee() {
        return station_d_arrivee;
    }

    public Station getStation_de_depart() {
        return station_de_depart;
    }

    public int getNbr() {
        return nbr;
    }

    public ArrayList<Station> getST() { return ST; }

    public ArrayList<Navette> getNA() { return NA; }

    public ArrayList<Tronçon> getTR() { return TR; }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNbr(int nbr) { this.nbr = nbr; }

    //-------------------------Methodes------------------------

    public String toString() {


        return " ligne numero  "+ numero+
                "  \n moyen de transport "
                +M.Mtrasport()+" \n station :  \n Depart   "
                +station_de_depart.toString()  +
                "\n Arrivee  "+ station_d_arrivee.toString()
                +"\n \n --------------------------\n";

    }

    //-----------------------------------------------------------

    public void afficher() {

        System.out.print(this.toString());

    }

    //-----------------------------------------------------------

    public Ligne Saisie(){
        Navette N=new Navette();
        Station S=new Station();
        Tronçon T=new Tronçon();
        Scanner e=new Scanner(System.in);
        Scanner f=new Scanner(System.in);
        System.out.println("Donnez le numero de la ligne:");
        this.numero=e.nextLine();
        System.out.println("Donnez le moyen de transport: ");
        System.out.println("En introduisant: B ( bus) , TR( Train) ,T (Tramway) , M (Metro) /n");
        String t=e.nextLine();
        this.M=MoyTransport.valueOf(t);
        System.out.println("Donnez le nombre de Station");
        this.nbr=f.nextInt();
        this.NA=N.Creation();
        this.ST=S.Creation(this.nbr,this.numero);
        for(int i=1;i<nbr;i++){
            T.Creation(i,this.ST.get(i-1),this.ST.get(i),this.TR);}
        Ligne L=new Ligne(this.numero,this.ST,this.nbr,this.TR,this.M,this.NA);
        return L;

    }

    //-------------------------------------------------------------

    public ArrayList<Ligne> Creation(){
        ArrayList<Ligne>LN=new ArrayList<>();
        Scanner e=new Scanner(System.in);
        int nbl=e.nextInt();
        for(int i=0;i<nbl;i++){
            Ligne L=new Ligne();
            L=L.Saisie();
            LN.add(i,L);
        }
        return LN;
    }


    //----------------------Recherche d'une navette---------------------

    public int Recherche_NA(Navette N){
        return this.NA.indexOf(N);
    }

    //------------------Modification d'une navette-----------------------

    public void Modifier_NA(int i){
        Navette N=new Navette();
        N=N.Saisie();
        this.NA.set(i,N);

    }

    //----------------suppression d'une navette--------------------

    public void Supprimer_NA(int i){

        this.NA.remove(i);
    }

    //-------------------Ajout d'une navette---------------------
    public void Ajout_NA(int i){
        Navette N=new Navette();
        N=N.Saisie();
        this.NA.add(i,N);
    }

    //------------------Ajout d'un troncon-----------------------

    public void Ajout_TR(Station station_de_depart,Station station_d_arrivee,int i){
        Tronçon T=new Tronçon();
        T= T.Saisie(this.ST.get(i),this.ST.get(i+1));
        this.TR.add(i,T);
    }

    //------------------suppression d'un troncon--------------------

    public void Supprimer_TR(int i){
        this.TR.remove(i);
    }


    //--------------------Modification d'un trocon--------------------
    public  void Modifier_TR(int i){
        Tronçon T=new Tronçon();
        this.TR.set(i,T);}

    //------------------Recherche d'une station-----------------------
    public int Recherche_ST(Station S){

        return this.ST.indexOf(S);
    }

    //---------------Modification d'une station--------------------

    public void Modifier_ST(int i,String Ligne_Appartenance){
        Station S=new Station();
        S=S.Saisie(Ligne_Appartenance);
        this.ST.set(i,S);
    }

    //--------------------Ajout d'une station---------------------

    public  void Ajout_ST(int i,String Ligne_Appartenance){
        Station S=new Station();
        S=S.Saisie(Ligne_Appartenance);
        if(i==0){
            this.ST.add(i,S);
            this.Ajout_TR(S,this.ST.get(i+1),i);
        }
        if(i>0&&i<this.ST.size()-1){
            this.ST.add(i,S);
            this.Supprimer_TR(i-1);
            this.Ajout_TR(this.ST.get(i-1),S,i-1);
        }
        if (i==this.ST.size()){
            this.ST.add(i,S);
            this.Ajout_TR(this.ST.get(i-1),S,i-1);
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
    }
}
