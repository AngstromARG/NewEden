/**
 *
 */
package ar.com.juego.vista;

import ar.com.juego.common.entities.Juego;
import ar.com.juego.controlador.ControladorJugador;
import ar.com.juego.modelo.TipoNave;
import ar.com.juego.observer.IObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Beetoven Desir
 */
public class VistaJuego extends JFrame implements IObserver {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	private JComboBox<TipoNave> tipoNave;
	private ControladorJugador ctrlJugador;

	public VistaJuego() {
		this.setTitle("JUEGO");
		this.setSize(1280, 720);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// panel del juego
		JPanel panel = new JPanel();
		panel.setBounds(40, 80, 200, 200);

		JButton b1 = new JButton("Button 1");
		b1.setBounds(50, 100, 80, 30);

		JButton b2 = new JButton("Button 2");
		b2.setBounds(100, 100, 80, 30);

		panel.add(b1);
		panel.add(b2);
		this.add(panel);
		this.setLayout(null);
		this.setVisible(true);

		JMenuBar menuBar = new JMenuBar();
		// menubar nombre
		JMenu menu = new JMenu("Acciones");
		// Los Items del menubar
		JMenuItem addNave = new JMenuItem("Construir Nave");

		JMenuItem crearFlota = new JMenuItem("Contruir Flota");
		JMenuItem pasarTurno = new JMenuItem("Pasar Turno");
		JMenuItem atacarPlaneta = new JMenuItem("Atacar Planeta");
		JMenuItem enviarFlota = new JMenuItem("Enviar Flota");

		menu.add(addNave);

		menu.add(crearFlota);
		menu.add(pasarTurno);
		menu.add(atacarPlaneta);
		menu.add(enviarFlota);
		// menu agregado en la barra
		menuBar.add(menu);

		panel.setVisible(true);

		this.setLayout(new GridLayout(1, 2));

		this.setJMenuBar(menuBar);
		this.add(b1);
		this.add(b2);
		this.add(panel);

		// agregar nave
		addNave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// una vista para ir agregado label.
				crearNaves();

			}
		});
		//this.ctrlJugador=VistaPrincipal.getInstance().getVista()).getCtrlJugador();
		Juego.getJuego().inicializar();
		VistaPrincipal.getInstance().getVista().hide();
		VistaPrincipal.getInstance().hide();
	}

	// Metodos de las listas de los items.
	public void crearNaves() {

		JFrame vista = new Vista();
		// vista.setDefaultCloseOperation();

		JLabel nombre = new JLabel("Tipo Nave");
		tipoNave = new JComboBox<TipoNave>();

		tipoNave.addItem(TipoNave.asedio);
		tipoNave.addItem(TipoNave.combate);
		tipoNave.addItem(TipoNave.utilidad);

		vista.add(tipoNave);
		tipoNave.setBounds(30, 60, 100, 40);


		nombre.setBounds(30, 60, 100, 40);
		vista.add(tipoNave);
		vista.add(nombre);
		// input del nombre del jugador

		JTextField text = new JTextField();
		text.setBounds(30, 90, 200, 26);
		vista.add(text);

		JButton crear = new JButton("Crear");
		crear.setBounds(205, 90, 130, 25);
		vista.add(crear);

		crear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//VistaPrincipal.getInstance().getVista().get
			}
		});

		vista.setVisible(true);
		System.out.println("Creando la nave ");
	}

	public void enviarFlota() {

		JFrame vista = new Vista();
		// vista.setDefaultCloseOperation();

		JLabel nombre = new JLabel("Enviar Flota");


		nombre.setBounds(30, 60, 100, 40);

		vista.add(nombre);
		// input del nombre del jugador

		JTextField text = new JTextField();
		text.setBounds(30, 90, 200, 26);
		vista.add(text);

		JButton crear = new JButton("Enviar");
		crear.setBounds(205, 90, 130, 25);
		vista.add(crear);

		crear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		vista.setVisible(true);
		System.out.println("Enviando flota ");
	}

	public void atacarPlaneta() {

		JFrame vista = new Vista();
		// vista.setDefaultCloseOperation();

		JLabel nombre = new JLabel("Tipo Nave");


		nombre.setBounds(30, 60, 100, 40);

		vista.add(nombre);
		// input del nombre del jugador

		JTextField text = new JTextField();
		text.setBounds(30, 90, 200, 26);
		vista.add(text);

		JButton crear = new JButton("Crear");
		crear.setBounds(205, 90, 130, 25);
		vista.add(crear);

		crear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		vista.setVisible(true);
		System.out.println("Atacando planeta enemiga. ");

	}

	public void crearPlaneta() {

		JFrame vista = new Vista();
		// vista.setDefaultCloseOperation();

		JLabel nombre = new JLabel("Tipo Nave");


		nombre.setBounds(30, 60, 100, 40);

		vista.add(nombre);
		// input del nombre del jugador

		JTextField text = new JTextField();
		text.setBounds(30, 90, 200, 26);
		vista.add(text);

		JButton crear = new JButton("Crear");
		crear.setBounds(205, 90, 130, 25);
		vista.add(crear);

		crear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		vista.setVisible(true);
		System.out.println("Creando planeta");
	}

	@Override
	public void actualizar() {

	}
}
