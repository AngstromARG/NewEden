package ar.com.juego.programa;


import ar.com.juego.common.entities.Juego;
import ar.com.juego.common.entities.Jugador;
import ar.com.juego.vista.VistaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class TestRun extends WindowAdapter {

    static JFrame vista;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("        ====================================================================     ");
        vista = VistaPrincipal.getInstance();
        vista.setVisible(true);
        vista.setLayout(new FlowLayout());

        Jugador[] jugadores = new Jugador[2];
        for (int i = 0; i < jugadores.length; i++) {
            String nombre = JOptionPane.showInputDialog("Escribe un nombre");

            jugadores[i] = new Jugador(nombre, i);
            System.out.println("jugador Ingresado con exito: " + jugadores[i].getNombre());
        }
        // Recorremos el array  de los jugadores
        for (Jugador j : jugadores) {
            System.out.println(j.toString());
            System.out.println("        ====================================================================     ");
            System.out.println("                                                                                   ");
        }
        //Todo inicializar el Juego con un boton start
        System.out.println("");
        Juego.getInstance(jugadores);
        // Incializamos el juego asignando el 1er turno al azar a uno de los 2 jugadores.


        System.out.println("===========================================================");


        System.out.println("===========================================================");

    }

    static JComponent createVerticalSeparator() {
        JSeparator x = new JSeparator(SwingConstants.VERTICAL);
        x.setPreferredSize(new Dimension(3, 50));
        return x;
    }

    static JComponent createHorizontalSeparator() {
        JSeparator x = new JSeparator(SwingConstants.HORIZONTAL);
        x.setPreferredSize(new Dimension(50, 3));
        return x;
    }

    public void windowClosing(WindowEvent e) {
        int a = JOptionPane.showConfirmDialog(vista, "Are you sure?");
        if (a == JOptionPane.YES_OPTION) {
            vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
