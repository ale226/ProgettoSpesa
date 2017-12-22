package it.progetto.view;

import it.progetto.business.SessionManager;
import it.progetto.model.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyClienteFrame extends JFrame{

    public MyClienteFrame(){

        super("Finestra Cliente");
        getContentPane().setLayout(new BorderLayout());

        Cliente c = (Cliente) SessionManager.getInstance().getSESSION().get("Utente");

        ListaProdottiTableModel prdtm = new ListaProdottiTableModel(c.getListaprodotti());

        JTable listaprodotti = new JTable(prdtm);
        getContentPane().add(listaprodotti, BorderLayout.CENTER);

        getContentPane().add(new JLabel("Benvenuto"+c.getNome()+" "+c.getCognome()), BorderLayout.NORTH);

        JButton btnLogout = new JButton("Logout");
        getContentPane().add(btnLogout, BorderLayout.SOUTH);

        MyClienteFrame _this = this;
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int[] selez = listaprodotti.getSelectedRows();

                _this.setVisible(false);
                MyLoginFrame finestraLogin = (MyLoginFrame) SessionManager.getInstance().getSESSION().get("finestra_login");
                finestraLogin.setVisible(true);
                //Cancellare Username e Password dopo il logout
                //SessionManager.getInstance().getSession().put("studente", null); questo non va
                finestraLogin.getTxtEmail().setText("");
                finestraLogin.getTxtPassword().setText("");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1024,768);
        setVisible(true);
    }
}

