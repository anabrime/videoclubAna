import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class VentanaPrincipal3 extends JFrame implements ActionListener {
	private JButton bVolver;
	private JPanel pSur;
	private JFrame ventanaAnterior;
	public VentanaPrincipal3(JFrame ventanaAnterior) //Recibe la ventana de la que viene
	{
		this.ventanaAnterior = ventanaAnterior;
		this.setSize(800,600);
		this.setVisible(true);
		bVolver = new JButton("VOLVER");

		this.getContentPane().setLayout(new BorderLayout());
		pSur = new JPanel();
		pSur.add(bVolver);

		this.getContentPane().add("South", pSur);
		bVolver.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton botonPulsado = (JButton) e.getSource();
		if(botonPulsado == bVolver)
		{
			this.dispose();
			ventanaAnterior.setVisible(true);
		}

	}
}
