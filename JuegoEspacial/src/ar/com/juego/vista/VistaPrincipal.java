package ar.com.juego.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by beetoven.desir on 15/6/2017.
 */
public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private static VistaPrincipal ourInstance;
	private JFrame vista;

	private VistaPrincipal() {
		this.setTitle("Battle of Universe Game ");
		this.setSize(400, 400);
		this.setLocation(100, 100);
		// this.setLayout(new GridLayout(1, 2));
		// this.setLayout(new FlowLayout());
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel jlabel = new JLabel("Registre los jugadores ");
		jlabel.setBounds(80, 90, 200, 50);
		// Boton para crear Jugadores.
		JButton btnCrearJugador = new JButton("Crear Jugador");
		btnCrearJugador.setBounds(100, 140, 200, 40);

		btnCrearJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista = new VistaJugador();
				vista.setVisible(true);
			}
		});
		this.add(jlabel);
		this.add(btnCrearJugador);


	}

	public static VistaPrincipal getInstance() {
		if (ourInstance == null) {
			ourInstance = new VistaPrincipal();
		}
		return ourInstance;
	}

	public static VistaPrincipal getOurInstance() {
		return ourInstance;
	}

	public static void setOurInstance(VistaPrincipal ourInstance) {
		VistaPrincipal.ourInstance = ourInstance;
	}

	public JFrame getVista() {
		return vista;
	}

	public void setVista(JFrame vista) {
		this.vista = vista;
	}
	
	
}
