package it.progetto.actionlisteners;

import it.progetto.view.MyHomeFrame;
import it.progetto.view.MyLoginFrame;
import it.progetto.view.MyRegFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeListenerReg implements ActionListener {


    private MyHomeFrame finestraRegistrazione;


    public HomeListenerReg(MyHomeFrame finestraRegistrazione) {
        finestraRegistrazione = finestraRegistrazione;

    }






    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento catturato!");

        if (e.getSource() instanceof JButton){
            new MyRegFrame();
        }
    }
}
