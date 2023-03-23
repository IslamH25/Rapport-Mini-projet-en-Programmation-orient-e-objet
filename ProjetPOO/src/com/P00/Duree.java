package com.P00;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Duree extends JFrame {
    // ------------------- Attributs --------------------
    private  String d;
    private JLabel l1=new JLabel(" ");
    private JButton box = new JButton("Afficher");
    private JButton box2 = new JButton("Retour");
    private JLabel l2=new JLabel("Posistion point A");
    private JLabel l3=new JLabel("Posistion point B");
    private JTextField text2= new JTextField();
    private JTextField text3= new JTextField();
    // -------------------constructeur-------------------
    public Duree(){
        super("My Smart City");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("usthb.jpg").getImage());
        JPanel contentPane =(JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,350,20) );
        contentPane.setBackground(Color.LIGHT_GRAY);

    //-------------------implimentation des elements----------------
        box2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                RechercheBoutton2 n=new RechercheBoutton2();
                n.setVisible(true);
                dispose();
            }
        } );

        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Ligne_List L=new Ligne_List();
                L.Remplissage_auto();
                d=L.Calcul_Durée();
                l1.setText(d);

            }
        } );
        //-----------------size des element ---------------------------


        text2.setPreferredSize(new Dimension(100, 30));
        text3.setPreferredSize(new Dimension(100, 30));

        //---------------- coloration des elements----------------------


        box.setBackground(Color.getHSBColor(1.71f,0.15f,0.01f));
        box.setForeground(Color.lightGray);

        //--------------Ajout des elements -----------------------------

        contentPane.add(l2);
        contentPane.add(text2);
        contentPane.add(l3);
        contentPane.add(text3);
        contentPane.add(l1);
        contentPane.add(box);
        contentPane.add(box2);


    }
}

