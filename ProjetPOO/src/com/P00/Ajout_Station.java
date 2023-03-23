package com.P00;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ajout_Station extends JFrame {
    // ------------------- Attributs --------------------
    private JLabel l1=new JLabel("Numéro de Station ");
    private JLabel l2=new JLabel("Nom de Station");
    private JLabel l3=new JLabel("Type de station");
    private JTextField text1= new JTextField("");
    private JTextField text2= new JTextField("");
    private JTextField text3= new JTextField("");
    private JButton box = new JButton("Suivant");
    private int nums;
    private String noms;
    private String types;
    // -------------------constructeur-------------------
    public Ajout_Station(){
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
                Ajout_Navette n=new Ajout_Navette();
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

    public int getNums() { return nums; }

    public String getNoms() { return noms; }

    public String getTypes() { return types; }
}
