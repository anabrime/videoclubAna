
public class Usuario {


	private String usuario;
	private String contrase�a;

	public Usuario() {
		
	}
	
	public Usuario(String usuario, String contrase�a) {

		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}

	private String getUsuario() {
		return usuario;
	}

	private void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	private String getContrase�a() {
		return contrase�a;
	}

	private void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
}
