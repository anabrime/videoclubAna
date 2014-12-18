import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;


public class VentanaPeliculaDatos extends JFrame {

	private JPanel contentPane;
	private JFrame ventanaAnterior;
	private Pelicula p;
	private BaseDeDatos bd;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPeliculaDatos frame = new VentanaPeliculaDatos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public VentanaPeliculaDatos(JFrame va, Pelicula p) {
		bd = new BaseDeDatos();
		ventanaAnterior = va;
		this.p = p;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lFoto = new JLabel("FotoUrl");
		lFoto.setBounds(20, 69, 206, 285);
		contentPane.add(lFoto);
		
		JLabel lTitulo = new JLabel("T\u00EDtulo");
		lTitulo.setBounds(20, 27, 229, 22);
		contentPane.add(lTitulo);
		
		JLabel lGenero = new JLabel("G\u00E9nero");
		lGenero.setBounds(283, 85, 229, 22);
		contentPane.add(lGenero);
		
		JLabel lDirector = new JLabel("Directores");
		lDirector.setBounds(283, 142, 229, 57);
		contentPane.add(lDirector);
		
		JLabel lAnio = new JLabel("A\u00F1o");
		lAnio.setBounds(283, 25, 229, 27);
		contentPane.add(lAnio);
		
		JButton btnAlquilar = new JButton("ALQUILAR");
		btnAlquilar.setBounds(0, 387, 127, 23);
		contentPane.add(btnAlquilar);
		
		JButton btnComprar = new JButton("COMPRAR");
		btnComprar.setBounds(137, 387, 118, 23);
		contentPane.add(btnComprar);
		
		JTextPane txtpnSinopsis = new JTextPane();
		txtpnSinopsis.setText("sinopsis");
		txtpnSinopsis.setBounds(283, 294, 230, 116);
		contentPane.add(txtpnSinopsis);
		
		JLabel lSinopsis = new JLabel("Sinopsis");
		lSinopsis.setBounds(283, 269, 229, 14);
		contentPane.add(lSinopsis);
		
		JLabel lDuracion = new JLabel("Duraci\u00F3n");
		lDuracion.setBounds(283, 60, 229, 14);
		contentPane.add(lDuracion);
		
		JLabel lIdioma = new JLabel("Idioma");
		lIdioma.setBounds(283, 117, 229, 14);
		contentPane.add(lIdioma);
		
		JLabel lProtagonistas = new JLabel("Protagonistas");
		lProtagonistas.setBounds(283, 210, 230, 58);
		contentPane.add(lProtagonistas);
	}
}
