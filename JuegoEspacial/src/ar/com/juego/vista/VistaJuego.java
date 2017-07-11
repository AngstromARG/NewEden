/**
 *
 */
package ar.com.juego.vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import ar.com.juego.controlador.ControladorJugador;
import ar.com.juego.modelo.TipoNave;
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

		// constructor 
	public VistaJuego() {
		juego= Juego.getJuego();
		
		this.setTitle("JUEGO");
		this.setSize(1280, 720);
		this.setLocation(100, 100);
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

		this.add(panelImage);

		Jugador[] jugadores = juego.getJugadores();

		for (Jugador j : jugadores) {
			j.getPlanetas().size();
			int i=0;
			for (int x = 0; x < j.getPlanetas().size(); x++)
				if (j.getId()==1) {
					imageIcon = new ImageIcon(iconNave);
					jlabelIcon= new JLabel(imageIcon);
					jlabelIcon.setBounds(5, 100, 50, 100);
					panelImage.add(jlabelIcon);
				}else {
					imageIcon = new ImageIcon(iconImage);
					jlabelIcon= new JLabel(imageIcon);
					//jlabelIcon.setBounds(1250, i+10, 20, 20);
					jlabelIcon.setBounds(100, 100, 80, 30);
					//jlabelIcon.setIcon(imageIcon);
					panelImage.add(jlabelIcon);
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
		// this.ctrlJugador=VistaPrincipal.getInstance().getVista()).getCtrlJugador();
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
				// VistaPrincipal.getInstance().getVista().get
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
