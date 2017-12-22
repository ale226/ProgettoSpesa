package it.progetto.view;

import it.progetto.actionlisteners.LoginListener;
import it.progetto.business.SessionManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyLoginFrame extends JFrame {

    private JTextField txtEmail= new JTextField();
    private JPasswordField txtPassword = new JPasswordField();

    public MyLoginFrame() {


        super("Finestra di Login");
        Container c = getContentPane();



        c.setLayout(new BorderLayout());

        LoginListener listener = new LoginListener(this);


        JPanel centro = new JPanel();
        centro.setLayout(new GridLayout(2, 2));
        JLabel lblUsername = new JLabel("E-mail");
        JLabel lblPassword = new JLabel("Password");

        centro.add(lblUsername);
        centro.add(txtEmail);

        centro.add(lblPassword);
        centro.add(txtPassword);
        txtEmail.addActionListener(listener);
        txtPassword.addActionListener(listener);


        JPanel sud = new JPanel();
        sud.setLayout(new GridLayout(4,2));


        sud.add(new JLabel("Effettua il Login"));

        JButton btnLogin = new JButton("LOGIN");
        btnLogin.addActionListener(listener);
        sud.add(btnLogin);



        sud.add(new JLabel("Non sei ancora registrato?"));
        JButton btnReg = new JButton("REGISTRATI");

        btnReg.addActionListener(listener);
        sud.add(btnReg);


        sud.add(new JLabel("Hai dimenticato la password?"));
        JButton btnRecuperaPassword = new JButton("RECUPERA PASSWORD");

        btnRecuperaPassword.addActionListener(listener);
        sud.add(btnRecuperaPassword);


        sud.add(new JLabel("Oppure puoi accedere come ospite"));
        JButton btnGuest = new JButton("ACCEDI COME OSPITE");
        btnGuest.addActionListener(listener);
        sud.add(btnGuest);


        c.add(centro, BorderLayout.CENTER);
        c.add(sud, BorderLayout.SOUTH);

        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }




}
