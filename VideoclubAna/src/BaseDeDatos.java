import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BaseDeDatos {

	private Connection connection;
	private Statement stmt;

	public BaseDeDatos()
	{

	}

	public void conectar()
	{
		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:prueba.db");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void desconectar()
	{
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void crearSentencia()
	{
		try {
			stmt = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void cerrarSentencia()
	{
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int UsuarioCorrecto(String u, String c)

	{
		int resul = 0;
		String query = "SELECT * FROM registro WHERE usuario='" + u + "'";
		try {
			ResultSet rs = stmt.executeQuery(query);
			if(!rs.next())
				resul = 0; // No existe el nombre del usuario
			else
			{
				if(c.equals(rs.getString("contrasenia")))
					resul = 1; //La contraseña es correcta
				else
					resul = 2; //La contraseña es incorrecta
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resul;
	}
	public void insertarUsuario(String u, String c)
	{
		String query = "INSERT INTO registro VALUES( ' " + u + "','" + c + "')";
		try {
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void registrarUsuario(String u, String c)
	{
		String query = "INSERT INTO registro VALUES( ' " + u + "','" + c + "')";
		try {
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Es para la VentanaBienvenida1
	public ArrayList<String> obtenerRutas()
	{
		ArrayList<String> aRutas = new ArrayList<String>();
		
		String query = "SELECT url FROM Pelicula";
		try {
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				aRutas.add(rs.getString("url"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aRutas;
	}
	
	public ArrayList<String> obtenerRutasGenero(String g)
	{
		ArrayList<String> aRutas = new ArrayList<String>();
		
		String query = "SELECT url FROM Pelicula WHERE genero='"+g+"'";
		try {
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				aRutas.add(rs.getString("url"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aRutas;
	}
	
	public Pelicula obtenerPelicula(String url)
	{
		Pelicula p = null;
		
		String query = "SELECT url FROM pelicula WHERE url='"+url+"'";
		try {
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next())
			
				p = new Pelicula(rs.getString("Titulo"), rs.getString("Genero"), rs.getString("Idioma"), rs.getString("Directores"), rs.getString("Protagonistas"), rs.getString("Sinopsis"),rs.getInt("Duracion"),rs.getString("url"),rs.getInt("idPelicula"), rs.getInt("Año"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	
	
	
	
	

	
	
}