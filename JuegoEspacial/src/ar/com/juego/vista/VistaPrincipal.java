package ar.com.juego.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by beetoven.desir on 15/6/2017.
 */
public class VistaPrincipal extends JFrame {
    private static VistaPrincipal ourInstance;

    private VistaPrincipal() {
        this.setTitle("BATTLE OF UNIVERSE");
        // this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setSize(820, 680);
        this.setLocation(100, 100);
        this.setLayout(new GridLayout(1, 2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnCrearJugador = new JButton("Crear");
        btnCrearJugador.setBounds(20, 30, 40, 30);
        btnCrearJugador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(new JLabel("Registre los jugadores "));
        this.add(btnCrearJugador);

    }

    public static VistaPrincipal getInstance() {
        if (ourInstance == null) {
            ourInstance = new VistaPrincipal();
        }
        return ourInstance;
    }
}
  /*
    JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Crear Jugador");
        menuBar.add(menu);

        JPanel panel = new JPanel();
        panel.setSize(815,600);
        panel.setBackground(Color.gray);
        panel.setVisible(false);
        this.setLayout(new GridLayout(1,2));
        this.setJMenuBar(menuBar);
        this.add(panel);*/