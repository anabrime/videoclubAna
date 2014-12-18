import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class VentanaAcceso2 extends JFrame implements ActionListener {
	//Declaramos los atributos para rellenar la pagina pNorte etc
		private JLabel eTitulo, eUsuario, eContrasenia, eNombre, eCon;
		public JTextField tUsuario, tContrasenia, tNombre, tCon;
		private JButton bAceptar, bSalir, bRegistro, bRegistrate;
		static BaseDeDatos bd; //Para que se pueda utilizar desde cualquier sitio Todas las clases que esten en el mismo paquete pueden acceder a ella
		
		public VentanaAcceso2(){
			
			//Creo 
			
			eNombre = new JLabel("Introduce tu nombre de usuario: ");
			eNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
			eNombre.setBounds(10, 135, 201, 20);
			getContentPane().add(eNombre);
			
			
			eCon = new JLabel("Introduce tu contraseña: ");
			eCon.setFont(new Font("Tahoma", Font.PLAIN, 13));
			eCon.setBounds(10, 169, 149, 14);
			getContentPane().add(eCon);
			
			
			tNombre = new JTextField();
			tNombre.setBounds(221, 136, 179, 20);
			getContentPane().add(tNombre);
			tNombre.setColumns(10);
			
			
			tCon = new JTextField();
			tCon.setBounds(221, 167, 179, 20);
			getContentPane().add(tCon);
			tCon.setColumns(10);
			
			
			bRegistro = new JButton("REGISTRARME");
			bRegistro.setFont(new Font("Tahoma", Font.PLAIN, 14));
			bRegistro.setBounds(186, 277, 164, 33);
			getContentPane().add(bRegistro);
			bRegistro.addActionListener(this); // Para tener boton
			
			
			bRegistrate = new JButton("\u00A1REG\u00CDSTRATE!");
			bRegistrate.setFont(new Font("Tahoma", Font.PLAIN, 14));
			bRegistrate.setBounds(225, 350, 164, 33);
			getContentPane().add(bRegistrate);
			bRegistrate.addActionListener(this);
			
			
			//Creo el constructor
			bd = new BaseDeDatos();
			this.setSize(633, 470); //Poner la anchura y la largura
			
			getContentPane().setLayout(null);
			
			
			//ESTAN CREADOS PERO NO SALEN TODAVIA EN LA VENTANA
			eTitulo = new JLabel ("BIENVENIDO");
			eTitulo.setFont(new Font("Tahoma", Font.BOLD, 23));
			eTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			eTitulo.setBounds(0, 0, 607, 47);
			getContentPane().add(eTitulo);
			
			
			eUsuario = new JLabel("Usuario:");
			eUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
			eUsuario.setBounds(10, 58, 58, 14);
			getContentPane().add(eUsuario);
			
			
			eContrasenia = new JLabel ("Contraseña:");
			eContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 13));
			eContrasenia.setBounds(10, 94, 79, 14);
			getContentPane().add(eContrasenia);

			tUsuario = new JTextField();
			tUsuario.setBounds(88, 55, 201, 20);
			getContentPane().add(tUsuario);
			tUsuario.setColumns(10);
			
			
			tContrasenia = new JTextField();
			tContrasenia.setBounds(88, 91, 201, 20);
			getContentPane().add(tContrasenia);
			tContrasenia.setColumns(10);

			bAceptar = new JButton ("ACEPTAR");
			bAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			bAceptar.setBounds(443, 350, 164, 33);
			getContentPane().add(bAceptar);
			bAceptar.addActionListener(this);


			bSalir = new JButton ("SALIR");
			bSalir.setFont(new Font("Tahoma", Font.PLAIN, 14));
			bSalir.setBounds(10, 350, 164, 33);
			getContentPane().add(bSalir);
			bSalir.addActionListener(this);
			


			//Todos invisibles,no queremos que salgan

			bRegistro.setVisible(false);
			eNombre.setVisible(false);
			eCon.setVisible(false);
			tNombre.setVisible(false);
			tCon.setVisible(false);


			getContentPane().add(bAceptar);
			getContentPane().add(bSalir);
			this.setVisible(true);
			getContentPane().add(bRegistrate);
			this.setVisible(true);

		}
		public void actionPerformed(ActionEvent arg0) {
			//es el evento, el click etc
			// TODO Auto-generated method stub
			//Si ha pulsado el boton aceptar comprobar que existe

			JButton botonPulsado = (JButton) arg0.getSource(); //Coger la ruta de donde se ha hecho click y guardarlo en botonPulsado


			if(botonPulsado == bRegistrate)
			{
				//PONGO TODOS LOS CAMPOS VISIBLES PARA QUE SE REGISTRE

				eNombre.setVisible(true);
				eCon.setVisible(true);
				tNombre.setVisible(true);
				tCon.setVisible(true);
				bRegistro.setVisible(true);
				bAceptar.setVisible(false);
				bRegistrate.setVisible(false);
				eUsuario.setVisible(false);
				eContrasenia.setVisible(false);
				tContrasenia.setVisible(false);
				tUsuario.setVisible(false);

			}
			else if(botonPulsado == bRegistro)
			{
				if(tNombre.getText().equals("") || tCon.getText().equals("") )
				{
					JOptionPane.showMessageDialog(null, "ALGUN CAMPO ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
				} 
				else
				{
					bd.conectar();
					bd.crearSentencia();
					bd.registrarUsuario(tNombre.getText(), tCon.getText()); // Si rellena todos los huecos se guardan en la base de datos, queda registrado
					bd.cerrarSentencia();
					bd.desconectar();

					//Nos avisa de que el registro se ha hecho bien

					JOptionPane.showMessageDialog(null, "REGISTRO REALIZADO CON EXITO", "", JOptionPane.INFORMATION_MESSAGE);

					//Quita el boton de registro, y los campos

					bRegistro.setVisible(false);
					eNombre.setVisible(false);
					eCon.setVisible(false);
					tNombre.setVisible(false);
					tCon.setVisible(false);

					//Borra el texto (Usuario, contraseña etc) que hemos puesto antes en la Ventana Principal 

					tUsuario.setText("");
					tCon.setText("");
					tContrasenia.setText("");
					tNombre.setText("");
					new VentanaExtensiones3(this);

				}
			}

			else if(botonPulsado == bAceptar)
			{

				bd.conectar();
				bd.crearSentencia();
				//Crear arriba atributo base de datos y el constructor
				/*boolean resul = bd.existeUsuario(tUsuario.getText(), tContrasenia.getText());
				//Una vez comprobado si existe resul = true, abrir ventana pequeña donde ponga usuario correcto
				if (resul)
					JOptionPane.showMessageDialog(null, "USUARIO CORRECTO", "", JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null, "USUARIO INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
				 */
				//SI EL USUARIO NO EXISTE LA CONTRASEÑA NI SE COMPRUEBA
				int resul = bd.UsuarioCorrecto(tUsuario.getText(), tContrasenia.getText());
				bd.cerrarSentencia();
				bd.desconectar();
				if (resul == 0)
				{
					JOptionPane.showMessageDialog(null, "USUARIO INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);

					//Aqui se supone que pondria todo visible


				}else if(resul == 2){
					JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
				}else{


					//YA NO QUIERO QUE ME SALGA USUARIO CORRECTO, SINO QUE QUIERO QUE ME ENTRE A OTRA VENTANA
					//JOptionPane.showMessageDialog(null, "USUARIO CORRECTO", "", JOptionPane.INFORMATION_MESSAGE);
					this.setVisible(false); //Para que la ventana principal se ponga en invisible
				new VentanaExtensiones3(this);
				}
			}
			else
				System.exit(0);
		}

}
