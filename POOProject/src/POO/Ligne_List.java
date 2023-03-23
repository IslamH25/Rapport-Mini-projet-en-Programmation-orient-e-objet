package POO;

import java.util.ArrayList;
import java.util.Random;

public class Ligne_List {
    // ------------------- Attributs --------------------

    private ArrayList<Ligne> LN = new ArrayList<>();

    //--------------Constructeur -----------------------

    public Ligne_List() { }

    public Ligne_List(ArrayList<Ligne> LN) {
        this.LN = LN;
    }


    //----------------------Accessuers------------------------

    public ArrayList<Ligne> getLN() {
        return LN;
    }

    //-------------------------Methodes------------------------

    public int Recherche_LN(String numero) {
        for(int i=0;i<this.LN.size();i++){
            if(this.LN.get(i).getNumero().toUpperCase().equals(numero))
                return i;
        }
        return -1;
    }

    //----------------------------------------------------------
    public void Modifier_LN(int i) {
        Ligne L = new Ligne();
        L = L.Saisie();
        this.LN.set(i, L);
    }


    //----------------------------------------------------------

    public void Ajout_LN(int i) {
        Ligne L = new Ligne();
        L = L.Saisie();
        this.LN.add(i, L);
    }

    //----------------------------------------------------------

    public void Supprimer_LN(int i) {
        this.LN.remove(i);
    }

    //------------------------------------------------------------

    public void Affichage() {
        for (int i = 0; i < this.LN.size(); i++) {
            this.LN.get(i).afficher();
            System.out.println("");
        }
    }

    //-------------------------------------------------------------

    public void Affiche_Axe(String num) {
        int i = 0;
        while (!num.equals(this.LN.get(i).getNumero()) && i < this.LN.size()) {
            i++;
        }
        String p = "principale";
        for (int j = 0; j < this.LN.get(i).getST().size(); j++) {
            if (this.LN.get(i).getST().get(j).getType().equals(p)) {
                System.out.print(this.LN.get(i).getST().get(j).getNom() + '(' + this.LN.get(i).getST().get(j).getType() + ')' + "------");
            } else
                System.out.print(this.LN.get(i).getST().get(j).getNom() + "-----");
        }

    }

    //-----------------------------------------------------------------

    public void Recherche(int numero) {
        for (Ligne L : this.LN) {
            for (Station S : L.getST()) {
                if (S.getNumero() == numero){
                    L.afficher();
                    System.out.println("");}
            }
        }
    }

    //-------------------------------------------------------------------

    public  void Station_Correspondance(){
        String k="principale";
        for(Ligne L:this.LN){
            for (Station S:L.getST()){
                if (S.getType().equals(k)){
                    S.afficher();
                    System.out.println("");
                }
            }
        }
    }
    //-----------------------------------------------------------------


    public void Grand_nb_Voyageur() {
        int[] V = new int[this.LN.size()];
        int i = 0;
        for (Ligne L : this.LN) {
            int x = 0;
            x = L.getNA().size() * L.getM().nbr_moyen_voyageur;
            V[i] = x;
            i++;
        }
        int max = V[0];
        int k = 0;
        for (int j = 1; j < this.LN.size(); j++) {
            if (V[k] < V[j]) {
                max = V[j];
                k = j;
            }

        }
        Ligne L=new Ligne();
        L=this.LN.get(k);
        L.afficher();
    }

    //------------------------------------------------------------------

    public void Petit_nb_Voyageur() {
        int[] V = new int[this.LN.size()];
        int i = 0;
        for (Ligne L : this.LN) {
            int x = 0;
            x = L.getNA().size() * L.getM().nbr_moyen_voyageur;
            V[i] = x;
            i++;
        }
        int min = V[0];
        int k = 0;
        for (int j = 1; j < this.LN.size(); j++) {
            if (V[k] > V[j]) {
                min = V[j];
                k = j;
            }

        }
        Ligne L=new Ligne();
        L=this.LN.get(k);
        L.afficher();
    }
    //--------------------------------------------------------------

    public String Calcul_Durée(){
        Random n=new Random();
        int heure=n.nextInt(23-0);
        int min= n.nextInt(59-0);
        int sec=n.nextInt(59-0);
        return "la durée est: "+heure+"h"+min+"m"+sec+"s";
    }
    //----------------------------------------------------------------
    public void Remplissage_auto(){
        Ligne L=new Ligne();
        ArrayList<Station>ST1=new ArrayList<>();
        ArrayList<Navette>NA1=new ArrayList<>();
        ArrayList<Tronçon>TR1=new ArrayList<>();
        Station S1=new Station(104,"Alexandre Dumas","principale","M001");
        ST1.add(0,S1);
        Station S2=new Station(108,"Argentine","secondaire","M001");
        ST1.add(1,S2);
        Station S3= new Station(206,"Eglise de Pantin","secondaire","M001");
        ST1.add(2,S3);
        Station S4=new Station(435,"Courounes","secondaire","M001");
        ST1.add(3,S4);
        Station S5=new Station(647,"Croix de Chavaux","principale","M001");
        ST1.add(4,S5);
        Station S6=new Station(801,"Jasmin","secondaire","M001");
        ST1.add(5,S6);
        EtatTronçon A=EtatTronçon.Bon;
        Tronçon T1=new Tronçon(01,ST1.get(0),ST1.get(1),54.65,A);
        TR1.add(0,T1);
        A=EtatTronçon.Dégradé;
        Tronçon T2=new Tronçon(06,ST1.get(1),ST1.get(2),69.47,A);
        TR1.add(1,T2);
        A=EtatTronçon.Bon;
        Tronçon T3=new Tronçon(03,ST1.get(2),ST1.get(3),24.13,A);
        TR1.add(2,T3);
        A=EtatTronçon.Moyen;
        Tronçon T4=new Tronçon(07,ST1.get(3),ST1.get(4),25.56,A);
        TR1.add(3,T4);
        A=EtatTronçon.Moyen;
        Tronçon T5=new Tronçon(12,ST1.get(4),ST1.get(5),36.59,A);
        TR1.add(4,T5);
        Navette N1=new Navette(1,"RATP",1999);
        NA1.add(0,N1);
        Navette N2=new Navette(2,"RATP",2001);
        NA1.add(1,N2);
        Ligne L1=new Ligne("001",ST1,6,TR1,MoyTransport.M,NA1);
        this.LN.add(0,L1);//ligne 1

        ArrayList<Station>ST2=new ArrayList<>();
        ArrayList<Navette>NA2=new ArrayList<>();
        ArrayList<Tronçon>TR2=new ArrayList<>();
        Station S7=new Station(504,"Portes des Lilas","principale","B005");
        ST2.add(0,S7);
        Station S8=new Station(687,"Panthéon","secondaire","B005");
        ST2.add(1,S8);
        Station S9= new Station(469,"Gare de l'Est","secondaire","B005");
        ST2.add(2,S9);
        Station S10=new Station(704,"Opéra","secondaire","B005");
        ST2.add(3,S10);
        A=EtatTronçon.Moyen;
        Tronçon T6=new Tronçon(15,ST2.get(0),ST2.get(1),74.65,A);
        TR2.add(0,T6);
        A=EtatTronçon.Bon;
        Tronçon T7=new Tronçon(21,ST2.get(1),ST2.get(2),39.47,A);
        TR2.add(1,T7);
        A=EtatTronçon.Bon;
        Tronçon T8=new Tronçon(03,ST1.get(2),ST1.get(3),14.13,A);
        TR2.add(2,T8);
        Navette N3=new Navette(8,"MAN",2005);
        NA2.add(0,N3);
        Navette N4=new Navette(6,"SETRA",2010);
        NA2.add(1,N4);
        Navette N5=new Navette(5,"Iveco Bus",2004);
        NA2.add(2,N5);
        Ligne L2=new Ligne("005",ST2,4,TR2,MoyTransport.B,NA2);
        this.LN.add(1,L2);//ligne 2

        ArrayList<Station>ST3=new ArrayList<>();
        ArrayList<Navette>NA3=new ArrayList<>();
        ArrayList<Tronçon>TR3=new ArrayList<>();
        Station S11=new Station(119,"La Noue","principale","T004");
        ST3.add(0,S11);
        Station S12=new Station(222,"Danton","secondaire","T004");
        ST3.add(1,S12);
        Station S13= new Station(328,"Drancy-Avenir","secondaire","T004");
        ST3.add(2,S13);
        Station S14=new Station(806,"La Ferme","secondaire","T004");
        ST3.add(3,S14);
        Station S15=new Station(274,"Henri Farman","principale","T004");
        ST3.add(4,S15);
        A=EtatTronçon.Dégradé;
        Tronçon T9=new Tronçon(41,ST3.get(0),ST3.get(1),43.65,A);
        TR3.add(0,T9);
        A=EtatTronçon.Dégradé;
        Tronçon T10=new Tronçon(16,ST3.get(1),ST3.get(2),58.47,A);
        TR3.add(1,T10);
        A=EtatTronçon.Bon;
        Tronçon T11=new Tronçon(26,ST3.get(2),ST3.get(3),73.13,A);
        TR3.add(2,T11);
        A=EtatTronçon.Moyen;
        Tronçon T12=new Tronçon(52,ST3.get(3),ST3.get(4),11.56,A);
        TR3.add(3,T12);
        Navette N6=new Navette(1,"Alstom",1994);
        NA2.add(0,N6);
        Ligne L3=new Ligne("004",ST1,5,TR3,MoyTransport.T,NA3);
        this.LN.add(0,L3);//ligne 4

        ArrayList<Station>ST4=new ArrayList<>();
        ArrayList<Navette>NA4=new ArrayList<>();
        ArrayList<Tronçon>TR4=new ArrayList<>();
        Station S16=new Station(109,"Gare de l'est","principale","TR007");
        ST4.add(0,S16);
        Station S17=new Station(486,"Gare de Bercy","secondaire","TR007");
        ST4.add(1,S17);
        Station S18= new Station(901,"Gare de Lyon","secondaire","TR007");
        ST4.add(2,S18);
        Station S19=new Station(705,"Gard du Nord","secondaire","TR007");
        ST4.add(3,S19);
        Station S20=new Station(602,"Gare Montparnasse","principale","TR007");
        ST4.add(4,S20);
        Station S21=new Station(298,"Gare d'Austerlitz","secondaire","TR007");
        ST4.add(5,S21);
        Station S22=new Station(173,"Gare Saint-Lazare","secondaire","TR007");
        ST4.add(6,S22);
        Station S23=new Station(814,"Lille Europe","secondaire","TR007");
        ST4.add(7,S23);
        A=EtatTronçon.Bon;
        Tronçon T13=new Tronçon(20,ST4.get(0),ST4.get(1),24.65,A);
        TR4.add(0,T13);
        A=EtatTronçon.Bon;
        Tronçon T14=new Tronçon(37,ST4.get(1),ST4.get(2),36.47,A);
        TR4.add(1,T14);
        A=EtatTronçon.Moyen;
        Tronçon T15=new Tronçon(30,ST4.get(2),ST4.get(3),96.13,A);
        TR4.add(2,T15);
        A=EtatTronçon.Moyen;
        Tronçon T16=new Tronçon(61,ST4.get(3),ST4.get(4),16.56,A);
        TR4.add(3,T16);
        A=EtatTronçon.Dégradé;
        Tronçon T17=new Tronçon(19,ST4.get(4),ST4.get(5),42.59,A);
        TR4.add(4,T17);
        A=EtatTronçon.Dégradé;
        Tronçon T18=new Tronçon(40,ST4.get(5), ST4.get(6),67.43,A);
        TR4.add(5,T18);
        A=EtatTronçon.Bon;
        Tronçon T19=new Tronçon(73,ST4.get(6),ST4.get(7),99.28,A);
        TR4.add(6,T19);
        Navette N7=new Navette(3,"Alstom",1998);
        NA4.add(0,N7);
        Navette N8=new Navette(10,"Alstom",2002);
        NA4.add(1,N8);
        Navette N9=new Navette(11,"Athearn",2018);
        NA4.add(2,N9);
        Navette N10=new Navette(14,"Athearn",2007);
        Ligne L4=new Ligne("007",ST4,8,TR4,MoyTransport.TR,NA4);
        this.LN.add(0,L4);//ligne 4



    }


}
