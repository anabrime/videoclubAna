

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VentanaBienvenida1 extends JFrame implements ActionListener{

	private JPanel pNorte, pSur, pCentro;

	private JLabel eTitulo;
	private JButton bEntrar;
	private BaseDeDatos bd;
	private JLabel foto;
	public VentanaBienvenida1()
	{

		bd=new BaseDeDatos(); 
		this.setSize(800,600);

		this.getContentPane().setLayout(new BorderLayout());

		pNorte = new JPanel();
		pNorte.setBackground(new Color(204, 255, 255));

		FlowLayout flowLayout = (FlowLayout) pNorte.getLayout();
		flowLayout.setVgap(100);
		flowLayout.setHgap(100);

		pCentro = new JPanel();
		pCentro.setBackground(new Color(204, 255, 255));

		FlowLayout flowLayout_1 = (FlowLayout) pCentro.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setVgap(15);
		flowLayout_1.setHgap(15);

		pSur = new JPanel();
		pSur.setBackground(new Color(204, 255, 255));

		FlowLayout flowLayout_2 = (FlowLayout) pSur.getLayout();
		flowLayout_2.setVgap(15);
		flowLayout_2.setHgap(15);

		bd.conectar();
		bd.crearSentencia();
		ArrayList<String> aURLs=bd.obtenerRutas();
		String url = aURLs.get(0);
		
		foto = new JLabel();
		foto.setIcon(new ImageIcon(url));
		foto.setBounds(100, 100, 100, 100);
		pCentro.add(foto);
		bd.cerrarSentencia();
		bd.desconectar();
		
		bd.conectar();
		bd.crearSentencia();
		ArrayList<String> aURLs1=bd.obtenerRutas();
		String url1 = aURLs1.get(1);
		
		foto = new JLabel();
		foto.setIcon(new ImageIcon(url1));
		foto.setBounds(100, 100, 100, 100);
		pCentro.add(foto);
		bd.cerrarSentencia();
		bd.desconectar();
		
		bd.conectar();
		bd.crearSentencia();
		ArrayList<String> aURLs2=bd.obtenerRutas();
		String url2 = aURLs2.get(2);
		
		foto = new JLabel();
		foto.setIcon(new ImageIcon(url2));
		foto.setBounds(100, 100, 100, 100);
		pCentro.add(foto);
		bd.cerrarSentencia();
		bd.desconectar();
		
		bd.conectar();
		bd.crearSentencia();
		ArrayList<String> aURLs3=bd.obtenerRutas();
		String url3 = aURLs3.get(10);
		
		foto = new JLabel();
		foto.setIcon(new ImageIcon(url3));
		foto.setBounds(100, 100, 100, 100);
		pCentro.add(foto);
		bd.cerrarSentencia();
		bd.desconectar();
		
		this.getContentPane().add("Center", pCentro);
		this.getContentPane().add("North", pNorte);
		this.getContentPane().add("South", pSur);


		eTitulo = new JLabel("BIENVENIDO AL VIDEOCLUB OIHANA");
		eTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 29));

		bEntrar = new JButton("¡ ENTRA !");
		bEntrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bEntrar.addActionListener(this);

		pNorte.add(eTitulo);
		pSur.add(bEntrar);
		this.setVisible(true);

	}
	public static void main (String []args) 
	{
		new VentanaBienvenida1();
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton botonPulsado = (JButton) e.getSource();

		if(botonPulsado == bEntrar){

			this.dispose();
			new VentanaAcceso2();
		}else{
			System.exit(0);
		}	

	}


}

