package ar.com.juego.vista;

import ar.com.juego.common.entities.Jugador;
import ar.com.juego.controlador.ControladorJugador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by beetoven.desir on 21/6/2017.
 */
public class VistaJugador extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private ControladorJugador ctrlJugador;
	private DefaultListModel<String> item;
	private JList<String> lista;
	private JTextField text;
	private JLabel nombre;
	private int id = 0;

	public VistaJugador() {

		this.setTitle("Crear Jugadores");
		this.setSize(420, 400);
		this.setLocation(100, 100);
		this.setLayout(null);

		this.ctrlJugador = new ControladorJugador();

		// label del nombre jugador
		nombre = new JLabel("Nombre: ");
		nombre.setBounds(30, 60, 100, 40);
		this.add(nombre);
		// input del nombre del jugador

		text = new JTextField();
		// text.setText(this.jugador.getNombre());
		text.setBounds(30, 90, 200, 26);
		this.add(text);

		// show nombre del jugador ingresado..
		item = new DefaultListModel<>();
		// La lista que mostrara el nombre.
		lista = new JList<>(item);
		lista.setBounds(50, 30, 200, 50);
		this.add(lista);

		// boton de registrar jugadores.
		JButton crear = new JButton("Ingresar");
		crear.setBounds(205, 90, 130, 25);
		crear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				final String name = text.getText();
				if (name != "" || name == null) {
					try {
						getCtrlJugador().agregarJugador(name, id);
						if (ControladorJugador.full) {
							JFrame juego = new VistaJuego();
							juego.setVisible(true);
						}

					} catch (Exception e1) {
						e1.printStackTrace();
					}
					id++;
				}
				for (Jugador jugador : ctrlJugador.getJuego().getJugadores()) {
					if (jugador != null)
						item.addElement(jugador.getNombre());
				}
			}
		});
		this.add(crear);

	}

	public ControladorJugador getCtrlJugador() {
		return ctrlJugador;
	}

	public void setCtrlJugador(ControladorJugador ctrlJugador) {
		this.ctrlJugador = ctrlJugador;
	}
}
