package POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ligne_List L=new Ligne_List();
        String k;
        int p;
        int j;
        boolean Retour=true;
        Scanner f=new Scanner(System.in);
        L.Remplissage_auto();
        //----------------------------interface------------------------

        System.out.println("                                       __________________________________________    ");
        System.out.println("                                                        BIEVENUE                     ");
        System.out.println("                                       ------------------------------------------    ");
        System.out.println("                                                ");
        System.out.println("--------------------------------------------");
        System.out.println("");
        //------------------------------Menu---------------------
        while (Retour) {
        System.out.println("REQUETE SUR LES DONNEES:");
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("Choisissez la requete:");
        System.out.println("");
        System.out.println("1- Requete de Mise à jour:");
        System.out.println();
        System.out.println("2-Requete d'interrogation:");
        int x;
        int y;
        int z;
        int m;
        Scanner e=new Scanner(System.in);
        x=e.nextInt() ;



            switch (x) {
                case 1:
                    System.out.println("Sur quel partie voulais vous faire la mise à jour:");
                    System.out.println();
                    System.out.println("1- Ligne");
                    System.out.println("2-Station");
                    System.out.println("3-Tronçon");
                    System.out.println("4-Navette");
                    y = e.nextInt();
                    switch (y) {
                        case 1:
                            System.out.println("1- Ajout");
                            System.out.println("2-Modification:");
                            System.out.println("3-Suppression");
                            z = e.nextInt();
                            switch (z) {
                                case 1:
                                    System.out.println("saisie des donnes de la ligne:");
                                    L.Ajout_LN(L.getLN().size());
                                    System.out.println("--l'Ajout a été fait avec succes !!--");
                                    System.out.println("Voulez-vous Sortir Du programme ??\n");
                                    System.out.println("1- OUI\n");
                                    System.out.println("2- NON\n");
                                    j = e.nextInt();
                                    if (j==1){ Retour = false ;}
                                    break;
                                case 2:
                                    System.out.println("Quel ligne voulez vous modifier : (4 lignes deja introduites  )");
                                    p = e.nextInt();
                                    L.Modifier_LN(p);
                                    System.out.println("--La modification est un Succès !!--");
                                    System.out.println("Voulez-vous Sortir Du programme ??\n");
                                    System.out.println("1- OUI\n");
                                    System.out.println("2- NON\n");
                                    j = e.nextInt();
                                    if (j==1){ Retour = false; }
                                    break;
                                case 3:
                                    System.out.println("Quel ligne voulez vous supprimer : (4 lignes deja introduites  )");
                                    p = e.nextInt();
                                    L.Supprimer_LN(p);
                                    System.out.println(" ----LA LIGNE A ETE SUPPRIMER---");
                                    System.out.println("Voulez-vous Sortir Du programme ??\n");
                                    System.out.println("1- OUI\n");
                                    System.out.println("2- NON\n");
                                    j = e.nextInt();
                                    if (j==1){ Retour = false ;}
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("1- Ajout");
                            System.out.println("2-Modification:");
                            System.out.println("3-Suppression");
                            z = e.nextInt();
                            switch (z) {
                                case 1:
                                    System.out.println("Saisissez Ligne dans laquelle la station sera ajouter:");
                                    k = f.nextLine();
                                    System.out.println("a quel position parmis les " + L.getLN().get(L.Recherche_LN(k)).getST().size() + " Station vous levous ajouter:");
                                    p = e.nextInt();
                                    L.getLN().get(L.Recherche_LN(k)).Ajout_ST(p, k);
                                    System.out.println("--l'Ajout a été fait avec succes !!--");
                                    System.out.println("Voulez-vous Sortir Du programme ??\n");
                                    System.out.println("1- OUI\n");
                                    System.out.println("2- NON\n");
                                    j = e.nextInt();
                                    if (j==1){ Retour = false ;}
                                    break;
                                case 2:
                                    System.out.println(" Dans quel ligne voulez vous modifier la station: (4 lignes deja introduites  )");
                                    k = f.nextLine();
                                    System.out.println(" Quel station parmis les" + L.getLN().get(L.Recherche_LN(k)).getST().size() + " Station ");
                                    p = e.nextInt();
                                    L.getLN().get(L.Recherche_LN(k)).Modifier_ST(p, k);
                                    System.out.println("--La modification est un Succès !!--");
                                    System.out.println("Voulez-vous Sortir Du programme ??\n");
                                    System.out.println("1- OUI\n");
                                    System.out.println("2- NON\n");
                                    j = e.nextInt();
                                    if (j==1){ Retour = false ;}
                                    break;
                                case 3:
                                    System.out.println("Dans quel ligne voulez vous supprimer la Station:");
                                    k = f.nextLine();
                                    System.out.println("Quel station parmis les " + L.getLN().get(L.Recherche_LN(k)).getST().size() + " Station");
                                    p = e.nextInt();
                                    L.getLN().get(L.Recherche_LN(k)).Supprimer_ST(p);
                                    System.out.println(" ----LA STATION A ETE SUPPRIMER---");
                                    System.out.println("Voulez-vous Sortir Du programme ??\n");
                                    System.out.println("1- OUI\n");
                                    System.out.println("2- NON\n");
                                    j = e.nextInt();
                                    if (j==1){ Retour = false ;}
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("1- Ajout");
                            System.out.println("2-Modification:");
                            System.out.println("3-Suppression");
                            z = e.nextInt();
                            switch (z) {
                                case 1:
                                    System.out.println("Saisissez Ligne dans laquelle le Tronçon sera ajouter:");
                                    k = f.nextLine();
                                    System.out.println("a quel position parmis les " + L.getLN().get(L.Recherche_LN(k)).getTR().size() + " Tronçon vous levous ajouter:");
                                    p = e.nextInt();
                                    L.getLN().get(L.Recherche_LN(k)).Ajout_ST(p + 1, k);
                                    System.out.println("--l'Ajout a été fait avec succes !!--");
                                    System.out.println("Voulez-vous Sortir Du programme ??\n");
                                    System.out.println("1- OUI\n");
                                    System.out.println("2- NON\n");
                                    j = e.nextInt();
                                    if (j==1){ Retour = false ;}
                                    break;
                                case 2:
                                    System.out.println(" Dans quel ligne voulez vous modifier le Tronçon : (4 lignes deja introduites  )");
                                    k = f.nextLine();
                                    System.out.println(" Quel Tronçon parmis les " + L.getLN().get(L.Recherche_LN(k)).getTR().size() + " Troncon ");
                                    p = e.nextInt();
                                    L.getLN().get(L.Recherche_LN(k)).Modifier_TR(p);
                                    System.out.println("--La modification est un Succès !!--");
                                    System.out.println("Voulez-vous Sortir Du programme ??\n");
                                    System.out.println("1- OUI\n");
                                    System.out.println("2- NON\n");
                                    j = e.nextInt();
                                    if (j==1){ Retour = false ;}
                                    break;
                                case 3:
                                    System.out.println("Dans quel ligne voulez vous supprimer le Tronçon:");
                                    k = f.nextLine();
                                    System.out.println("Quel Tronçon parmis les" + L.getLN().get(L.Recherche_LN(k)).getTR().size() + " Troncon");
                                    p = e.nextInt();
                                    L.getLN().get(L.Recherche_LN(k)).Supprimer_ST(p + 1);
                                    System.out.println(" ----LA STATION TRONCON A ETE SUPPRIMER---");
                                    System.out.println("Voulez-vous Sortir Du programme ??\n");
                                    System.out.println("1- OUI\n");
                                    System.out.println("2- NON\n");
                                    j = e.nextInt();
                                    if (j==1){ Retour = false ;}
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("1- Ajout");
                            System.out.println("2-Modification:");
                            System.out.println("3-Suppression");
                            z = e.nextInt();
                            switch (z) {
                                case 1:
                                    System.out.println("Saisissez Ligne dans laquelle la Navette sera ajouter:");
                                    k = f.nextLine();
                                    L.getLN().get(L.Recherche_LN(k)).Ajout_NA(L.getLN().get(L.Recherche_LN(k)).getNA().size());
                                    System.out.println("--l'Ajout a été fait avec succes !!--");
                                    System.out.println("Voulez-vous Sortir Du programme ??\n");
                                    System.out.println("1- OUI\n");
                                    System.out.println("2- NON\n");
                                    j = e.nextInt();
                                    if (j==1){ Retour = false ;}
                                    break;
                                case 2:
                                    System.out.println(" Dans quel ligne voulez vous modifier la Navette : (4 lignes deja introduites  )");
                                    k = f.nextLine();
                                    System.out.println(" Quel Navette parmis les" + L.getLN().get(L.Recherche_LN(k)).getNA().size() + " Troncon ");
                                    p = e.nextInt();
                                    L.getLN().get(L.Recherche_LN(k)).Modifier_NA(p);
                                    System.out.println("--La modification est un Succès !!--");
                                    System.out.println("Voulez-vous Sortir Du programme ??\n");
                                    System.out.println("1- OUI\n");
                                    System.out.println("2- NON\n");
                                    j = e.nextInt();
                                    if (j==1){ Retour = false ;}
                                    break;
                                case 3:
                                    System.out.println("Dans quel ligne voulez vous supprimer la Navette:");
                                    k = f.nextLine();
                                    System.out.println("Quel Navette parmis les" + L.getLN().get(L.Recherche_LN(k)).getTR().size() + " Navette");
                                    p = e.nextInt();
                                    L.getLN().get(L.Recherche_LN(k)).Supprimer_NA(p);
                                    System.out.println(" ----LA NAVETTE A ETE SUPPRIMER---");
                                    System.out.println("Voulez-vous Sortir Du programme ??\n");
                                    System.out.println("1- OUI\n");
                                    System.out.println("2- NON\n");
                                    j = e.nextInt();
                                    if (j==1){ Retour = false ;}
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Error");
                    }
                    break;
                case 2:
                    System.out.println("1- Affichage de toutes les lignes .\n" +
                            "2- Affichage du chemin sur une ligne donnée \n" +
                            "3- Chercher toutes les lignes qui passent par une station donnée \n" +
                            "4- Affichage des stations de correspondance \n" +
                            "5- La ligne empruntée par le plus grand nombre de voyageurs et par le minimum de voyageurs\n" +
                            "6-La durée estimée pour aller d’un point A à un point B,\n");
                    y = e.nextInt();
                    switch (y) {
                        case 1:
                            System.out.println("------LES LIGNES SONT:-----------");
                            L.Affichage();
                            System.out.println("Voulez-vous Sortir Du programme ??\n");
                            System.out.println("1- OUI\n");
                            System.out.println("2- NON\n");
                            j = e.nextInt();
                            if (j==1){ Retour = false ;}
                            break;
                        case 2:
                            System.out.println("Donnez la ligne à afficher:");
                            System.out.println("Ligne deja existante : T004,M001,B005,TR007");
                            k = f.nextLine();
                            L.Affiche_Axe(k);
                            System.out.println("\n Voulez-vous Sortir Du programme ??\n");
                            System.out.println("1- OUI\n");
                            System.out.println("2- NON\n");
                            j = e.nextInt();
                            if (j==1){ Retour = false ;}
                            break;
                        case 3:
                            System.out.println("Donnez le numero de la Station:");
                            System.out.println("Station deja existante : 504,704,104,801,,647,814,109");
                            p = e.nextInt();
                            L.Recherche(p);
                            System.out.println("Voulez-vous Sortir Du programme ??\n");
                            System.out.println("1- OUI\n");
                            System.out.println("2- NON\n");
                            j = e.nextInt();
                            if (j==1){ Retour = false ;}
                            break;
                        case 4:
                            System.out.println("Les stations de correspondance sont:\n");
                            L.Station_Correspondance();
                            System.out.println("Voulez-vous Sortir Du programme ??\n");
                            System.out.println("1- OUI\n");
                            System.out.println("2- NON\n");
                            j = e.nextInt();
                            if (j==1){ Retour = false ;}
                            break;
                        case 5:
                            System.out.println("La ligne avec le plus grand nombre de voyageur est:\n");
                            L.Grand_nb_Voyageur();
                            System.out.println("La ligne avec le plus petit nombre de voyageur est :\n");
                            L.Petit_nb_Voyageur();
                            System.out.println("Voulez-vous Sortir Du programme ??\n");
                            System.out.println("1- OUI\n");
                            System.out.println("2- NON\n");
                            j = e.nextInt();
                            if (j==1){ Retour = false ;}
                            break;
                        case 6:
                            System.out.println("Donnez la ligne:");
                            k = f.nextLine();
                            System.out.println("Donnez les deux positions des 2 stations A et B parmis les" + L.getLN().get(L.Recherche_LN(k)).getST().size() + " Station");
                            p = e.nextInt();
                            m = e.nextInt();
                            System.out.println(" \n la Durée est: " + L.Calcul_Durée());
                            System.out.println("Voulez-vous Sortir Du programme ??\n");
                            System.out.println("1- OUI\n");
                            System.out.println("2- NON\n");
                            j = e.nextInt();
                            if (j==1){ Retour = false ;}
                            break;
                    }
                default:
                    System.out.println("ERROR");
            }
        }



    }
}
