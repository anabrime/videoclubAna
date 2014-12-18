
public class Pelicula {

	private int idPelicula;
	private String Titulo;
	private int Año;
	private String Genero;
	private String url;
	private String Idioma;
	private String Directores;
	private String Protagonistas;
	private String Sinopsis; 
	private int Duracion;
	
	

	public Pelicula() {

	}

	public Pelicula(String Titulo, String Genero, String Idioma, String Directores, String Protagonistas, 
			String Sinopsis, int Duracion, String url, int idPelicula, int Año){
		this.Titulo = Titulo;
		this.Genero = Genero;
		this.Idioma = Idioma;
		this.Directores = Directores;
		this.Protagonistas = Protagonistas;
		this.Sinopsis = Sinopsis;
		this.Duracion = Duracion;
		this.url = url;
		this.idPelicula = idPelicula;
		this.Año = Año;
	}

	
	private int getAño() {
		return Año;
	}

	private void setAño(int año) {
		this.Año = Año;
	}

	private int getIdPelicula() {
		return idPelicula;
	}

	private void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String geturl(){
		return url;
	}

	public void seturl(String url){
		this.url = url;
	}

	public String getTitulo(){
		return Titulo;
	}

	public void setTitulo(String Titulo){
		this.Titulo = Titulo;
	}

	public String getGenero(){
		return Genero;
	}

	public void setGenero(String Genero){
		this.Genero = Genero;
	}

	public String getIdioma(){
		return Idioma;
	}

	public void setIdioma(String Idioma){
		this.Idioma = Idioma;
	}

	public String getDirectores() {
		return Directores;
	}

	public void setDirectores(String Directores) {
		this.Directores = Directores;
	}

	public String getProtagonistas(){
		return Protagonistas;
	}

	public void setProtagonistas(String Protagonistas){
		this.Protagonistas = Protagonistas;
	}

	public String getSinopsis(){
		return Sinopsis;
	}

	public void setSinopsis(String Sinopsis){
		this.Sinopsis = Sinopsis;
	}

	public int getDuracion() {
		return Duracion;
	}

	public void setDuracion(int Duracion) {
		this.Duracion = Duracion;
	}
}
