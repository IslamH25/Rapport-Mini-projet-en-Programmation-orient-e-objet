package com.P00;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ajout_Ligne extends JFrame {
    // ------------------- Attributs --------------------

    private JLabel l1=new JLabel("Nombre de ligne");
    private JLabel l2=new JLabel("Numéro de ligne ");
    private JLabel l3=new JLabel("moyen de transport");
    private JLabel l4=new JLabel("Nombre de station");
    private JTextField text1= new JTextField("");
    private JTextField text2= new JTextField("");
    private JTextField text3= new JTextField("");
    private JTextField text4= new JTextField("");
    private JButton box = new JButton("Suivant");


    private String  num; // num de ligne
    private String m; // moyen de transport
    private int nbrs; // nbr de station
    private int n ;   // nbr de navette
    // -------------------constructeur-------------------
    public Ajout_Ligne(){
        super("My Smart City");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("usthb.jpg").getImage());
        JPanel contentPane =(JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,350,10) );
        contentPane.setBackground(Color.LIGHT_GRAY);




    //-------------------implimentation des elements----------------
        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //------------------recuperation des valeurs---------------

                num=text2.getText();
                m=text3.getText();
                nbrs= Integer.parseInt(text4.getText());

                Ajout_Station n=new Ajout_Station();
                n.setVisible(true);
                dispose();




            }
        } );


    //-----------------size des element ---------------------------

        text1.setPreferredSize(new Dimension(100, 30));
        text2.setPreferredSize(new Dimension(100, 30));
        text3.setPreferredSize(new Dimension(100, 30));
        text4.setPreferredSize(new Dimension(100, 30));

    //---------------- coloration des elements----------------------


        box.setBackground(Color.getHSBColor(1.71f,0.15f,0.01f));
        box.setForeground(Color.lightGray);

    //--------------Ajout des elements -----------------------------


        contentPane.add(l1);
        contentPane.add(text1);
        contentPane.add(l2);
        contentPane.add(text2);
        contentPane.add(l3);
        contentPane.add(text3);
        contentPane.add(l4);
        contentPane.add(text4);
        contentPane.add(box);


    }
    //-------------------------Accesseurs----------------------------


    public String getNum() { return num; }

    public String getM() { return m; }

    public int getNbrs() { return nbrs; }

    public int getN() { return n; }
}
