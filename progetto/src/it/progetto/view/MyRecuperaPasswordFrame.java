package it.progetto.view;

import it.progetto.actionlisteners.RegListener;

import javax.swing.*;
import java.awt.*;

public class MyRecuperaPasswordFrame extends JFrame {

    private JTextField txtMail = new JTextField();


    public MyRecuperaPasswordFrame(){

        super("Pagina di Recupero Credenziali");
        Container c = getContentPane();

        c.setLayout(new BorderLayout());

        JPanel centro = new JPanel();
        JPanel sud = new JPanel();
        sud.setLayout(new FlowLayout());
        centro.setLayout(new GridLayout(1,2));
        JLabel lblMail = new JLabel("E-Mail");
        JButton btnRecupera = new JButton("SPEDISCI LA MAIL CONTENTE LA PASSWORD");
        centro.add(lblMail);
        centro.add(txtMail);
        sud.add(btnRecupera);



        c.add(centro, BorderLayout.CENTER);
        c.add(sud, BorderLayout.SOUTH);


        setSize(500,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
