package com.P00;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        Window window = new Window();

        window.setVisible(true);

        Ligne_List L=new Ligne_List();
        L.Remplissage_auto();
        L.getLN().get(0).afficher();







    }
}
