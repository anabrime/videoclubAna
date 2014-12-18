import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;


public class VentanaVideojuegoDatos extends JFrame {
	public VentanaVideojuegoDatos() {
		getContentPane().setLayout(null);
		
		JLabel lNombre = new JLabel("Nombre");
		lNombre.setBounds(66, 28, 198, 14);
		getContentPane().add(lNombre);
		
		JLabel lblUrlfoto = new JLabel("UrlFoto");
		lblUrlfoto.setBounds(66, 53, 210, 229);
		getContentPane().add(lblUrlfoto);
		
		JButton btnAlquilar = new JButton("ALQUILAR");
		btnAlquilar.setBounds(115, 391, 89, 23);
		getContentPane().add(btnAlquilar);
		
		JButton btnComprar = new JButton("COMPRAR");
		btnComprar.setBounds(323, 391, 89, 23);
		getContentPane().add(btnComprar);
		
		JLabel lblCategora = new JLabel("Categor\u00EDa");
		lblCategora.setBounds(323, 53, 209, 14);
		getContentPane().add(lblCategora);
		
		JLabel lblNmeroDeJugadores = new JLabel("N\u00FAmero de jugadores");
		lblNmeroDeJugadores.setBounds(323, 106, 209, 14);
		getContentPane().add(lblNmeroDeJugadores);
		
		JLabel lblInformacin = new JLabel("Informaci\u00F3n");
		lblInformacin.setBounds(326, 147, 166, 203);
		getContentPane().add(lblInformacin);
	}
}
