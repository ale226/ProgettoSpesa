package it.progetto.view;

import it.progetto.actionlisteners.LoginListener;
import it.progetto.business.SessionManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyLoginFrame extends JFrame {

    private JTextField txtUsername = new JTextField();
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
        centro.add(txtUsername);

        centro.add(lblPassword);
        centro.add(txtPassword);
        txtUsername.addActionListener(listener);
        txtPassword.addActionListener(listener);


        JPanel sud = new JPanel();
        sud.setLayout(new GridLayout(3,2));


        sud.add(new JLabel("Effettua il Login"));

        JButton btnLogin = new JButton("LOGIN");
        btnLogin.addActionListener(listener);
        sud.add(btnLogin);



        sud.add(new JLabel("Non sei ancora registrato?"));
        JButton btnReg = new JButton("REGISTRATI");

        btnReg.addActionListener(listener);
        sud.add(btnReg);


        sud.add(new JLabel("Oppure puoi accedere come ospite"));
        JButton btnGuest = new JButton("ACCEDI COME OSPITE");
        btnGuest.addActionListener(listener);
        sud.add(btnGuest);


        c.add(centro, BorderLayout.CENTER);
        c.add(sud, BorderLayout.SOUTH);



        MyLoginFrame this1= this;

        btnReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Evento catturato!");

                if(e.getActionCommand()== "REGISTRATI"){
                    this1.setVisible(false);
                    MyRegFrame regFrame = new MyRegFrame();
                    SessionManager.getInstance().getSESSION().put("finestra_registrazione", regFrame);

                }

            }
        });




        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }




}
