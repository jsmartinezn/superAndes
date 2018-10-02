package superAndes.persistencia;

import java.util.LinkedList;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.apache.log4j.Logger;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class PersistenciaSuperAndes {

	/**
	 * Logger para escribir la traza de la ejecución
	 */
	private static Logger log = Logger.getLogger(PersistenciaSuperAndes.class.getName());
	
	/**
	 * Cadena para indicar el tipo de sentencias que se va a utilizar en una consulta
	 */
	public final static String SQL = "javax.jdo.query.SQL";

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * Atributo privado que es el único objeto de la clase - Patrón SINGLETON
	 */
	private static PersistenciaSuperAndes instance;
	
	/**
	 * Fábrica de Manejadores de persistencia, para el manejo correcto de las transacciones
	 */
	private PersistenceManagerFactory pmf;
	
	/**
	 * Arreglo de cadenas con los nombres de las tablas de la base de datos, en su orden:
	 * Secuenciador, tipoBebida, bebida, bar, bebedor, gustan, sirven y visitan
	 */
	private List <String> tablas;
	
	/**
	 * Atributo para el acceso a las sentencias SQL propias a PersistenciaParranderos
	 */
	private SQLUtil sqlUtil;
	
	private SQLBodega sqlBodega;
	
	private SQLCompra sqlCompra;
	
	private SQLEmpresa sqlEmpresa;
	
	private SQLEstante sqlEstante;
	
	private SQLOrdenPedido sqlOrden;
	
	private SQLPersonaNatural sqlPersona;
	
	private PersistenciaSuperAndes()
	{
		pmf = JDOHelper.getPersistenceManagerFactory("Parranderos");		
		
		crearClasesSql();
		
		// Define los nombres por defecto de las tablas de la base de datos
		tablas = new LinkedList<String> ();
		tablas.add ("SuperAndes_sequence");
		tablas.add ("BODEGA");
		tablas.add ("COMPRA");
		tablas.add ("EMPRESA");
		tablas.add ("ESTANTE");
		tablas.add ("ORDENPEDIDO");
		tablas.add ("PERSONANATURAL");
	}
	
	private PersistenciaSuperAndes(JsonObject config)
	{
		crearClasesSql();
		tablas = leerNombresTablas(config);
		
		String unidadPersistencia = config.get ("unidadPersistencia").getAsString ();
		log.trace ("Accediendo unidad de persistencia: " + unidadPersistencia);
		pmf = JDOHelper.getPersistenceManagerFactory (unidadPersistencia);
		
	}
	
	public static PersistenciaSuperAndes getInstance ()
	{
		if (instance == null)
		{
			instance = new PersistenciaSuperAndes ();
		}
		return instance;
	}
	

	public static PersistenciaSuperAndes getInstance (JsonObject tableConfig)
	{
		if (instance == null)
		{
			instance = new PersistenciaSuperAndes (tableConfig);
		}
		return instance;
	}

	public String darSeqParranderos() {
		return tablas.get(0);
	}
	
	public String darTablaBodega()
	{
		return tablas.get(1);
	}
	public String darTablaPersonaNatural()
	{
		return tablas.get(6);
	}
	public String darTablaCompra()
	{
		return tablas.get(2);
	}
	public String darTablaEmpresa()
	{
		return tablas.get(3);
	}
	public String darTablaEstante()
	{
		return tablas.get(4);
	}
	public String darTablaOrdenPedido()
	{
		return tablas.get(5);
	}
	
	public void crearClasesSql()
	{
		sqlBodega = new SQLBodega(this);
		sqlCompra = new SQLCompra(this);
		sqlEmpresa = new SQLEmpresa(this);
		sqlEstante = new SQLEstante(this);
		sqlOrden = new SQLOrdenPedido(this);
		sqlPersona = new SQLPersonaNatural(this);
		sqlUtil = new SQLUtil(this);
	}
	private List <String> leerNombresTablas (JsonObject tableConfig)
	{
		JsonArray nombres = tableConfig.getAsJsonArray("tablas") ;

		List <String> resp = new LinkedList <String> ();
		for (JsonElement nom : nombres)
		{
			resp.add (nom.getAsString ());
		}
		
		return resp;
	}
	
	private long nextval()
	{
        long resp = sqlUtil.nextval (pmf.getPersistenceManager());
        log.trace ("Generando secuencia: " + resp);
        return resp;
    }

}
