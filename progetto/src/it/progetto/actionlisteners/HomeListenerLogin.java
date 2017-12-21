package it.progetto.actionlisteners;

import it.progetto.view.MyHomeFrame;
import it.progetto.view.MyLoginFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeListenerLogin implements ActionListener {



    private MyHomeFrame finestraLogin;


    public HomeListenerLogin(MyHomeFrame finestraLogin) {
        finestraLogin = finestraLogin;

    }






    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento catturato!");

        if (e.getSource() instanceof JButton){
        new MyLoginFrame();
    }
}
}
