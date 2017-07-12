/**
 *
 */
package ar.com.juego.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import ar.com.juego.common.entities.Juego;
import ar.com.juego.common.entities.Jugador;
import ar.com.juego.modelo.Nave;
import ar.com.juego.modelo.Planeta;
import ar.com.juego.modelo.TipoNave;
import ar.com.juego.modelo.entities.NaveAsedio;
import ar.com.juego.observer.IObserver;

/**
 * @author Beetoven Desir
 */
public class VistaJuego extends JFrame implements IObserver {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private JComboBox<TipoNave> tipoNave;
	private Juego juego;
	private String imagen;
	private String iconImage;
	private String iconNave;
	private PanelImage panelImage;
	private LabelIcon icon;
	private JLabel jlabelIcon;
	private ImageIcon imageIcon;
	private Jugador[] jugadores;

	// constructor
	public VistaJuego() {
		juego = Juego.getJuego();

		this.setTitle("JUEGO");
		this.setSize(1280, 720);
		this.setLocation(100, 100);
		this.getContentPane().setBackground(Color.darkGray);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Carga de imagen de fondo
		try {
			iconNave = "imagen/nave.png";
			imagen = "imagen/universo.jpg";
			iconImage = "imagen/naves.png";

		} catch (RuntimeException e) {
			e.printStackTrace();
		}

		// panel del juego
		panelImage = new PanelImage();

		icon = new LabelIcon();
		icon.setBackground(iconImage);

		panelImage.setBackground(imagen);

		// this.add(panelImage);

		jugadores = juego.getJugadores();

		for (Jugador j : jugadores) {
			j.getPlanetas().size();
			int i = 5;
			for (int x = 0; x < j.getPlanetas().size(); x++)
				if (j.getId() == 1) {
					imageIcon = new ImageIcon(iconNave);
					jlabelIcon = new JLabel(imageIcon);
					jlabelIcon.setBounds(0, imageIcon.getIconWidth(), imageIcon.getIconWidth(), imageIcon.getIconHeight());
					i = i + 15;
					this.add(jlabelIcon);
					// panelImage.add(jlabelIcon);
				} else {
					imageIcon = new ImageIcon(iconImage);
					jlabelIcon = new JLabel(imageIcon);
					jlabelIcon.setBounds(1270, imageIcon.getIconHeight(), imageIcon.getIconWidth(), imageIcon.getIconHeight());
					i = i + 15;
					// agregar al panel...
					// panelImage.add(jlabelIcon);
					this.add(jlabelIcon);
				}

		}

		// JPanel panel = new JPanel();
		// panel.setBounds(40, 80, 200, 200);

		JButton b1 = new JButton("Button 1");
		b1.setBounds(50, 100, 80, 30);

		JButton b2 = new JButton("Button 2");
		b2.setBounds(100, 100, 80, 30);

		// panel.add(b1);
		// panel.add(b2);
		this.setLayout(new FlowLayout());

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

		// panel.setVisible(true);

		this.setLayout(new GridLayout(1, 2));

		this.setJMenuBar(menuBar);
		// this.add(b1);
		// this.add(b2);
		// this.add(panel);

		// agregar nave
		addNave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// una vista para ir agregado label.
				crearNaves();

			}
		});
		
		pasarTurno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pasarTurnos();
			}
		});
		// this.ctrlJugador=VistaPrincipal.getInstance().getVista()).getCtrlJugador();
		Juego.getJuego().inicializar();
		VistaPrincipal.getInstance().getVista().hide();
		VistaPrincipal.getInstance().hide();
		//this.actualizar();
	}

	// Metodos de las listas de los items.

	/**
	 * metodos para las acciones.
	 */
	public void crearNaves() {

		JFrame vista = new Vista();
		// vista.setDefaultCloseOperation();

		JLabel nombre = new JLabel("Tipo Nave");
		tipoNave = new JComboBox<TipoNave>();

		tipoNave.addItem(TipoNave.asedio);
		tipoNave.addItem(TipoNave.combate);
		tipoNave.addItem(TipoNave.utilidad);

		vista.add(tipoNave);
		tipoNave.setBounds(50, 30, 240, 20);

		nombre.setBounds(50, 50, 240, 30);
		vista.add(tipoNave);
		vista.add(nombre);
		// input del nombre del jugador

		final JTextField text = new JTextField();
		text.setBounds(50, 90, 200, 30);
		vista.add(text);

		JButton crear = new JButton("Crear");
		crear.setBounds(205, 90, 80, 30);
		vista.add(crear);

		crear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// VistaPrincipal.getInstance().getVista().get
				for (Jugador jugador : jugadores) {
					if (jugador.getId() == Juego.getTurnoJugador()) {
						final List<Planeta> juga = jugador.getPlanetas();
						juga.size();
							Nave nave;
							try {
								nave = new NaveAsedio(jugador.getMineral());
								juga.get(1).setNaves(nave);
								imageIcon = new ImageIcon(iconNave);
								jlabelIcon = new JLabel(imageIcon);
								jlabelIcon.setBounds(0, 30, imageIcon.getIconWidth(), imageIcon.getIconHeight());
								
							} catch (Exception e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
						
						jugador.actualizarObservadores();
						 actualizar();
					}
				}
			}
		});

		vista.setVisible(true);
		System.out.println("Creando la nave ");
	}

	public void enviarFlota() {
		for (Jugador jugador : jugadores) {
			if (jugador.getId()==Juego.getTurnoJugador()) {
				final List<Nave> naves=jugador.enviarFlota();
				  for (Nave nave : naves) {
					//nave.viajarHacia(posX, posY, posXuniverso, posYuniverso);
				}
			}
		}
		
		System.out.println("Enviando flota ");
	}
	
	public void pasarTurnos() {
		
	if (Juego.getTurnoJugador()==jugadores[Juego.getTurnoJugador()-1].getId())  
		jugadores[Juego.getTurnoJugador()-1].pasarTurno();
	
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


	@Override
	public void actualizar() {
	
		for (Jugador j : jugadores) {
			j.getPlanetas().size();
			int i = 5;
			for (int x = 0; x < j.getPlanetas().size(); x++)
				if (j.getId() == 1) {
					imageIcon = new ImageIcon(iconNave);
					jlabelIcon = new JLabel(imageIcon);
					jlabelIcon.setBounds(0, i, imageIcon.getIconWidth(), imageIcon.getIconHeight());
					i = i + 15;
					this.add(jlabelIcon);
					// panelImage.add(jlabelIcon);
				} else {
					imageIcon = new ImageIcon(iconImage);
					jlabelIcon = new JLabel(imageIcon);
					jlabelIcon.setBounds(1270, i, 20, 20);
					i = i + 15;
					// agregar al panel...
					// panelImage.add(jlabelIcon);
					this.add(jlabelIcon);
				}

		}
	}
}
