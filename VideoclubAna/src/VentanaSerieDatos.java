import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;


public class VentanaSerieDatos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSerieDatos frame = new VentanaSerieDatos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaSerieDatos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lFoto = new JLabel("FotoUrl");
		lFoto.setBounds(20, 69, 206, 285);
		contentPane.add(lFoto);
		
		JLabel LTitulo = new JLabel("T\u00EDtulo");
		LTitulo.setBounds(20, 27, 229, 22);
		contentPane.add(LTitulo);
		
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
		
		JLabel lblDuracion = new JLabel("Duraci\u00F3n por capitulo");
		lblDuracion.setBounds(283, 60, 229, 14);
		contentPane.add(lblDuracion);
		
		JLabel lblIdioma = new JLabel("Idioma");
		lblIdioma.setBounds(283, 117, 229, 14);
		contentPane.add(lblIdioma);
		
		JLabel lblProtagonistas = new JLabel("Protagonistas");
		lblProtagonistas.setBounds(283, 210, 230, 58);
		contentPane.add(lblProtagonistas);
	}
}
