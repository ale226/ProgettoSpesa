package it.progetto.actionlisteners;

import it.progetto.business.SessionManager;
import it.progetto.view.MyHomeFrame;
import it.progetto.view.MyLoginFrame;
import it.progetto.view.MyRecuperaPasswordFrame;
import it.progetto.view.MyRegFrame;

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
        if(e.getActionCommand()== "REGISTRATI"){
            finestra.setVisible(false);
            MyRegFrame regFrame = new MyRegFrame();
            SessionManager.getInstance().getSESSION().put("finestra_registrazione", regFrame);

        }
        if(e.getActionCommand()=="RECUPERA PASSWORD"){
            finestra.setVisible(false);
            MyRecuperaPasswordFrame RecuperaPasswordFrame = new MyRecuperaPasswordFrame();
        }

    }
}
