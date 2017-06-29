package ar.com.juego.programa;

import ar.com.juego.vista.VistaPrincipal;

import javax.swing.*;
import java.awt.*;

/**
 * Created by beetoven.desir on 21/6/2017.
 */
public class Programa {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame vista = VistaPrincipal.getInstance();
                vista.setVisible(true);
            }
        });
    }
}
