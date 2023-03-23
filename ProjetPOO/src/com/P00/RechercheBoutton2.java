package com.P00;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RechercheBoutton2 extends JFrame {
    // ------------------- Attributs --------------------

    private JButton box1 = new JButton("ligne au plus grand nombre de voyageurs");
    private JButton box2 = new JButton("Durée estimée");
    private JButton box3 = new JButton("Construction de chemin");
    private JButton box4 = new JButton("chemin optimal");
    private JButton box5 = new JButton("Retour");

    // -------------------constructeur-------------------
    public RechercheBoutton2()  {
        super("My Smart City");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("usthb.jpg").getImage());
        JPanel contentPane =(JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,350,30) );
        contentPane.setBackground(Color.LIGHT_GRAY);

        //--------------implementation des bouttons -----------------------

        box1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MiseAjourBoutton b1 = new MiseAjourBoutton();
                b1.setVisible(true);
                dispose();
            }
        } );

        box2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Duree b1=new Duree();
                b1.setVisible(true);
                dispose();
            }
        } );

        box3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MiseAjourBoutton b1 = new MiseAjourBoutton();
                b1.setVisible(true);
                dispose();
            }
        } );

        box4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MiseAjourBoutton b1 = new MiseAjourBoutton();
                b1.setVisible(true);
                dispose();
            }
        } );

        box5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RechercheBoutton b1=new RechercheBoutton();
                b1.setVisible(true);
                dispose();
            }
        } );

        //--------------coloration des bouttons ---------------------

        box1.setBackground(Color.getHSBColor(1.71f,0.15f,0.01f));
        box2.setBackground(Color.getHSBColor(1.71f,0.15f,0.01f));
        box3.setBackground(Color.getHSBColor(1.71f,0.15f,0.01f));
        box4.setBackground(Color.getHSBColor(1.71f,0.15f,0.01f));
        box5.setBackground(Color.getHSBColor(1.71f,0.15f,0.01f));
        box1.setForeground(Color.lightGray);
        box2.setForeground(Color.lightGray);
        box3.setForeground(Color.lightGray);
        box4.setForeground(Color.lightGray);
        box5.setForeground(Color.lightGray);


        //--------------Ajout des boutton -----------------------------
        contentPane.add(box1);
        contentPane.add(box2);
        contentPane.add(box3);
        contentPane.add(box4);
        contentPane.add(box5);


}
}
