import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Vector;


public class VentanaExtensiones3 extends JFrame implements MouseListener {

	private JPanel contentPane,panelFotos;
	private BaseDeDatos bd;
	JMenuItem mntmComedia;
	private JScrollPane scrollPanel;
	private JFrame ventanaAnterior;
	/**
	 * Launch the application.
	 */
	
	public void cargarFotos(String g)
	{
		panelFotos.removeAll();
		
		bd.conectar();
		bd.crearSentencia();
		ArrayList<String> aRutas = bd.obtenerRutasGenero(g);
		for(int j=0;j<aRutas.size();j++)
		{
			String ruta = aRutas.get(j);
			JLabel l = new JLabel();
			ImageIcon i= new ImageIcon(ruta);
			i.setDescription(ruta);
			l.setIcon(i);
			panelFotos.add(l);
			System.out.println(ruta);
		}
		bd.cerrarSentencia();
		bd.desconectar();
		panelFotos.repaint();
	}
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Extensiones4 frame = new Extensiones4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public VentanaExtensiones3(JFrame va) {
		ventanaAnterior = va;
		bd = new BaseDeDatos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(833,683);
		//setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		panelFotos = new JPanel();
		contentPane.add(panelFotos, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar);
		
		JMenu mnPeliculas = new JMenu("Pel\u00EDculas");
		menuBar.add(mnPeliculas);
		
		JMenu mnGenero = new JMenu("G\u00E9nero");
		mnPeliculas.add(mnGenero);
		
		JMenuItem mntmAccin = new JMenuItem("Acci\u00F3n");
		mnGenero.add(mntmAccin);
		
		
		panelFotos=new JPanel();
		panelFotos.setLayout(new GridLayout(2,5));
		cargarFotos("Misterio");
		panelFotos.updateUI();
		panelFotos=new JPanel();
		panelFotos.setLayout(new GridLayout(2,5));
		cargarFotos("Ciencia Ficción");
		panelFotos.updateUI();
		panelFotos=new JPanel();
		panelFotos.setLayout(new GridLayout(2,5));
		cargarFotos("Acción");
		panelFotos.updateUI();
		panelFotos=new JPanel();
		panelFotos.setLayout(new GridLayout(2,5));
		cargarFotos("Romance");
		panelFotos.updateUI();
		panelFotos=new JPanel();
		panelFotos.setLayout(new GridLayout(2,5));
		cargarFotos("Comedia");
		panelFotos.updateUI();
		
		scrollPanel = new JScrollPane(panelFotos);
		scrollPanel.addMouseListener(this);
		contentPane.add("Center",scrollPanel);
		this.setVisible(true);
		mntmComedia = new JMenuItem("Comedia");
		mnGenero.add(mntmComedia);
		/*mntmComedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Vector v= new Vector();
				bd.conectar();bd.crearSentencia();
				ArrayList<String> aURLs=bd.obtenerRutasGenero(mntmComedia.getText());
				int f=0,c=0;
				for(int i=0;i<aURLs.size();i++)
				{
					String url=aURLs.get(i);
					System.out.println(url);
					JLabel l=new JLabel();
					l.setIcon(new ImageIcon(url));
					v.add(l);
				}
				
				bd.cerrarSentencia();bd.desconectar();
				for(int i=0;i<v.size();i++)
				{
					panelFotos.add((JLabel)v.get(i));
				}
				panelFotos.repaint();
			}
		}); */
		
		
		JMenuItem mntmCienciaFiccin = new JMenuItem("Ciencia Ficci\u00F3n");
		mnGenero.add(mntmCienciaFiccin);
		
		JMenuItem mntmRomance = new JMenuItem("Romance");
		mnGenero.add(mntmRomance);
		
		JMenuItem mntmMisterio = new JMenuItem("Misterio");
		mnGenero.add(mntmMisterio);
		
		JMenu mnAo = new JMenu("A\u00F1o");
		mnPeliculas.add(mnAo);
		
		JMenuItem mntmCualquiera = new JMenuItem("Cualquiera");
		mnAo.add(mntmCualquiera);
		
		JMenuItem mntmActual_1 = new JMenuItem("Actual");
		mnAo.add(mntmActual_1);
		
		JMenuItem menuItem = new JMenuItem("90");
		mnAo.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("80");
		mnAo.add(menuItem_1);
		
		JMenu mnVideojuegos = new JMenu("Videojuegos");
		menuBar.add(mnVideojuegos);
		
		JMenu mnCategoria = new JMenu("Categor\u00EDa");
		mnVideojuegos.add(mnCategoria);
		
		JMenuItem mntmPlataformas = new JMenuItem("Plataformas");
		mnCategoria.add(mntmPlataformas);
		
		JMenu mnNumJugadores = new JMenu("N\u00FAmero de jugadores");
		mnVideojuegos.add(mnNumJugadores);
		
		JMenuItem mntmIndividual = new JMenuItem("Individual");
		mnNumJugadores.add(mntmIndividual);
		
		JMenuItem mntmPorParejas = new JMenuItem("Por parejas");
		mnNumJugadores.add(mntmPorParejas);
		
		JMenuItem mntmMltiple = new JMenuItem("M\u00FAltiple");
		mnNumJugadores.add(mntmMltiple);
		
		JMenu mnSeries = new JMenu("Series");
		menuBar.add(mnSeries);
		
		JMenu mnGenero_1 = new JMenu("G\u00E9nero");
		mnSeries.add(mnGenero_1);
		
		JMenuItem mntmAccion = new JMenuItem("Acci\u00F3n");
		mnGenero_1.add(mntmAccion);
		
		JMenuItem mntmTerror = new JMenuItem("Terror");
		mnGenero_1.add(mntmTerror);
		
		JMenu mnAo_2 = new JMenu("A\u00F1o");
		mnSeries.add(mnAo_2);
		
		JMenuItem mntmCualquiera_1 = new JMenuItem("Cualquiera");
		mnAo_2.add(mntmCualquiera_1);
		
		JMenuItem mntmActual = new JMenuItem("Actual");
		mnAo_2.add(mntmActual);
		
		JMenuItem mntmDeLos = new JMenuItem("De los '90");
		mnAo_2.add(mntmDeLos);
		
		JMenuItem mntmDeLos_1 = new JMenuItem("De los '80");
		mnAo_2.add(mntmDeLos_1);
		
	
		
		
	}

	/*private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}*/
	@Override
	public void mouseClicked(MouseEvent arg0) {
		Point po = panelFotos.getMousePosition();
		try
		{
			JLabel imagen = (JLabel)panelFotos.getComponentAt(po);
			ImageIcon i = (ImageIcon)imagen.getIcon();
			String ruta = i.getDescription();
			bd.conectar();
			bd.crearSentencia();
			Pelicula p = bd.obtenerPelicula(ruta);
			bd.cerrarSentencia();
			bd.desconectar();
			new VentanaPeliculaDatos(this,p);
			this.dispose();
		}
		catch(Exception e)
		{}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
