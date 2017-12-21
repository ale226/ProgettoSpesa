package it.progetto.view;

import it.progetto.business.SessionManager;

public class Main {


    public static void main(String args[]){

        MyLoginFrame loginFrame = new MyLoginFrame();
        SessionManager.getInstance().getSESSION().put("finestra_login",loginFrame);


    }
}
