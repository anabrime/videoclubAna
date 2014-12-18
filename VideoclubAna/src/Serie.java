
public class Serie {

	private int idSerie;
	private int Año;
	private String Titulo;
	private String Genero;
	private String Idioma;
	private String url;
	private String Directores;
	private String Protagonistas;
	private String Sinopsis; 
	private int DuracionCapitulo;
	
	

	public Serie() {

	}

	public Serie(String Titulo, String Genero, String Idioma, String Directores, String Protagonistas, 
			String Sinopsis, int DuracionCapitulo, String url, int idSerie, int Año){
		
		this.Titulo = Titulo;
		this.Genero = Genero;
		this.Idioma = Idioma;
		this.Directores = Directores;
		this.Protagonistas = Protagonistas;
		this.Sinopsis = Sinopsis;
		this.DuracionCapitulo = DuracionCapitulo;
		this.url = url;
		this.idSerie = idSerie;
		this.Año = Año;
	}

	
	private int getAño() {
		return Año;
	}

	private void setAño(int año) {
		Año = año;
	}

	private int getIdSerie() {
		return idSerie;
	}

	private void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
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

	public int getDuracionCapitulo() {
		return DuracionCapitulo;
	}

	public void setDuracionCapitulo(int DuracionCapitulo) {
		this.DuracionCapitulo = DuracionCapitulo;
	}
}