package it.progetto.view;

import it.progetto.actionlisteners.HomeListenerLogin;
import it.progetto.actionlisteners.HomeListenerReg;
import it.progetto.actionlisteners.LoginListener;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyHomeFrame extends JFrame {

    public MyHomeFrame(){

        super("Benvenuto");
        Container c = getContentPane();

        HomeListenerLogin framelog = new HomeListenerLogin(this);
        HomeListenerReg framereg = new HomeListenerReg(this);

        c.setLayout(new BorderLayout());
        JPanel centro = new JPanel();
        JPanel nord = new JPanel();
        nord.setLayout(new GridLayout(1,10));
        JButton btnLogin = new JButton("LOGIN");
        JButton btnRegistrati  = new JButton("REGISTRATI");
        btnLogin.addActionListener(framelog);
        btnRegistrati.addActionListener(framereg);
        nord.add(btnLogin);
        nord.add(btnRegistrati);
        c.add(nord, BorderLayout.NORTH);
        c.add(centro, BorderLayout.CENTER);



        setSize(1080,720);

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
