package it.progetto.view;

import it.progetto.actionlisteners.RegListener;

import javax.swing.*;
import java.awt.*;

public class MyRegFrame extends JFrame {

    private JTextField txtMail = new JTextField();
    private JPasswordField txtPassword = new JPasswordField();
    private JPasswordField txtVerificaPassword = new JPasswordField();


    public MyRegFrame(){

        super("Pagina di Registrazione");
        Container c = getContentPane();

        c.setLayout(new BorderLayout());

        JPanel centro = new JPanel();
        JPanel sud = new JPanel();
        sud.setLayout(new FlowLayout());
        centro.setLayout(new GridLayout(4,2));
        JLabel lblMail = new JLabel("E-Mail");
        JLabel lblPassword = new JLabel("Password");
        JLabel lblVerificaPassword = new JLabel("Verifica Password");
        JButton btnRegistrati = new JButton("CONFERMA LA REGISTRAZIONE");
        centro.add(lblMail);
        centro.add(txtMail);
        centro.add(lblPassword);
        centro.add(txtPassword);
        centro.add(lblVerificaPassword);
        centro.add(txtVerificaPassword);
        sud.add(btnRegistrati);



        c.add(centro, BorderLayout.CENTER);
        c.add(sud, BorderLayout.SOUTH);


        setSize(500,200);
        setVisible(true);
    }
}
