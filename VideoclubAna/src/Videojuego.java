
public class Videojuego {


	private String Nombre;
	private String Categoria;
	private String NumJugadores;
	private String Informacion;
	private int idVideojuego;
	private String url;


	public Videojuego() {

	}

	public Videojuego(String Nombre, String Categoria, String NumJugadores,
			String Informacion, int idVideojuego, String url) {
		this.Nombre = Nombre;
		this.Categoria = Categoria;
		this.NumJugadores = NumJugadores;
		this.Informacion = Informacion;
		this.idVideojuego = idVideojuego;
		this.url = url;
	}


	private String getUrl() {
		return url;
	}

	private void setUrl(String url) {
		this.url = url;
	}

	private int getIdVideojuego() {
		return idVideojuego;
	}

	private void setIdVideojuego(int idVideojuego) {
		this.idVideojuego = idVideojuego;
	}

	private String getNombre() {
		return Nombre;
	}

	private void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	private String getCategoria() {
		return Categoria;
	}

	private void setCategoria(String Categoria) {
		this.Categoria = Categoria;
	}

	private String getNumJugadores() {
		return NumJugadores;
	}

	private void setNumJugadores(String NumJugadores) {
		this.NumJugadores = NumJugadores;
	}

	private String getInformacion() {
		return Informacion;
	}

	private void setInformacion(String Informacion) {
		this.Informacion = Informacion;
	}

}
