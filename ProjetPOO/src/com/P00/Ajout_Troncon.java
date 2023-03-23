package com.P00;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ajout_Troncon extends JFrame{
    // ------------------- Attributs --------------------

    private JLabel l1=new JLabel("Numéro de Tronçon ");
    private JLabel l2=new JLabel("longueur en Kilometre");
    private JLabel l3=new JLabel("Etat du tronçon");
    private JTextField text1= new JTextField("");
    private JTextField text2= new JTextField("");
    private JTextField text3= new JTextField("");
    private JButton box = new JButton("OK");
    private int numt;
    private int kilo;
    private String etat;


    // -------------------constructeur-------------------
    public Ajout_Troncon(){
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

                Ajout n=new Ajout();
                n.setVisible(true);
                dispose();
            }
        } );


    //-----------------size des element ---------------------------

        text1.setPreferredSize(new Dimension(100, 30));
        text2.setPreferredSize(new Dimension(100, 30));
        text3.setPreferredSize(new Dimension(100, 30));


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
        contentPane.add(box);

    }
    //-------------------------Accesseurs----------------------------

    public int getNumt() { return numt; }

    public int getKilo() { return kilo; }

    public String getEtat() { return etat; }
}
