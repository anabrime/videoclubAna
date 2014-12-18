
public class Usuario {


	private String usuario;
	private String contraseña;

	public Usuario() {
		
	}
	
	public Usuario(String usuario, String contraseña) {

		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	private String getUsuario() {
		return usuario;
	}

	private void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	private String getContraseña() {
		return contraseña;
	}

	private void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
