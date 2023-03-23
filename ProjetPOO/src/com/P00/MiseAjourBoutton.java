package com.P00;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MiseAjourBoutton extends JFrame {
    // ------------------- Attributs --------------------

    private JButton box1 = new JButton("Modification");
    private JButton box2 = new JButton("Ajout");
    private JButton box3 = new JButton("suppression");
    private JButton box4 = new JButton("Retour");


    // -------------------constructeur-------------------

    public MiseAjourBoutton(){
        super("My Smart City");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("usthb.jpg").getImage());
        JPanel contentPane =(JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,350,30) );
        contentPane.setBackground(Color.LIGHT_GRAY);
        //--------------implementation des boutton-----------------------

        box1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Modification b1 = new Modification();
                b1.setVisible(true);
                dispose();
            }
        } );

        box2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Ajout window = new Ajout();
                window.setVisible(true);
                dispose();
            }
        } );
        box3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Suppression window = new Suppression();
                window.setVisible(true);
                dispose();
            }
        } );
        box4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                WindowPrincipale window = new WindowPrincipale();
                window.setVisible(true);
                dispose();
            }
        } );

        //--------------coloration des bouttons ----------------------

        box1.setBackground(Color.getHSBColor(1.71f,0.15f,0.01f));
        box2.setBackground(Color.getHSBColor(1.71f,0.15f,0.01f));
        box3.setBackground(Color.getHSBColor(1.71f,0.15f,0.01f));
        box4.setBackground(Color.getHSBColor(1.71f,0.15f,0.01f));
        box1.setForeground(Color.lightGray);
        box2.setForeground(Color.lightGray);
        box3.setForeground(Color.lightGray);
        box4.setForeground(Color.lightGray);

        //------------------retailler les boutton---------------------

        box2.setSize(160,30);

        //--------------------Ajout des boutton -----------------------
        contentPane.add(box1);
        contentPane.add(box2);
        contentPane.add(box3);
        contentPane.add(box4);


    }
}
