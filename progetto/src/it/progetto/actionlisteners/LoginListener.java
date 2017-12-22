package it.progetto.actionlisteners;

import it.progetto.business.GuestBusiness;
import it.progetto.business.SessionManager;
import it.progetto.model.Amministratore;
import it.progetto.model.Cliente;
import it.progetto.model.Gestore;
import it.progetto.model.Guest;
import it.progetto.view.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener{



    private MyLoginFrame finestra;


    public LoginListener(MyLoginFrame finestra) {
        this.finestra = finestra;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento catturato!");
        if (e.getActionCommand()== "LOGIN"){
            String email= finestra.getTxtEmail().getText();
            byte[] password = new String(finestra.getTxtPassword().getPassword()).getBytes();
            Guest guest = GuestBusiness.getInstance().login(email, password);

            if (guest != null) {
                System.out.println("LOGIN OK!");

                if (guest instanceof Cliente) {
                    //apriremo la view del cliente
                    System.out.println("Benvenuto clinete " + guest.getNome() + " " + guest.getCognome() + "!");
                    Cliente cliente = (Cliente) guest;
                    JOptionPane.showMessageDialog(null,"Benvenuto cliente " + guest.getNome() + " " + guest.getCognome() + "!");

                    SessionManager.getInstance().getSESSION().put("studente", cliente);
                    new MyClienteFrame();
                    finestra.setVisible(false);
                } else if (guest instanceof Amministratore) {
                    //apriremo la view dell'amministratore
                    System.out.println("Benvenuto amministratore " + guest.getNome() + " " + guest.getCognome() + "!");
                    Amministratore amministratore = (Amministratore) guest;
                    JOptionPane.showMessageDialog(null,"Benvenuto amministratore " + guest.getNome() + " " + guest.getCognome() + "!");

                    SessionManager.getInstance().getSESSION().put("amministratore", amministratore);
                    new MyAmministratoreFrame();
                    finestra.setVisible(false);
                }
                else if (guest instanceof Gestore) {
                    //apriremo la view dell'amministratore
                    System.out.println("Benvenuto gestore " + guest.getNome() + " " + guest.getCognome() + "!");
                    Gestore gestore = (Gestore) guest;
                    JOptionPane.showMessageDialog(null,"Benvenuto gestore " + guest.getNome() + " " + guest.getCognome() + "!");

                    SessionManager.getInstance().getSESSION().put("amministratore", gestore);
                    new MyGestoreFrame();
                    finestra.setVisible(false);
                }

            } else {
                System.out.println("Il login non è andato a buon fine...");
                JOptionPane.showMessageDialog(null,"Il login non è andato a buon fine...");
            }

        }
        if(e.getActionCommand()== "REGISTRATI"){
            finestra.setVisible(false);
            MyRegFrame regFrame = new MyRegFrame();
            SessionManager.getInstance().getSESSION().put("finestra_registrazione", regFrame);

        }
        if(e.getActionCommand()=="RECUPERA PASSWORD"){
            finestra.setVisible(false);
            MyRecuperaPasswordFrame RecuperaPasswordFrame = new MyRecuperaPasswordFrame();
            SessionManager.getInstance().getSESSION().put("finestra recupero password", RecuperaPasswordFrame);
        }

        if (e.getActionCommand()=="ACCEDI COME OSPITE"){
            finestra.setVisible(false);
            MyOspiteFrame OspiteFrame = new MyOspiteFrame() ;
            SessionManager.getInstance().getSESSION().put("finestra recupero password", OspiteFrame);


        }

    }
}
