package superAndes.persistencia;

import java.util.Date;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class SQLPromocion {

	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra acá para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaSuperAndes.SQL;

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	private PersistenciaSuperAndes pp;
	
	public SQLPromocion(PersistenciaSuperAndes pp){
		this.pp = pp;
	}
	
	public long adicionarPromocion(PersistenceManager pm, Long idSucursal, Long idProducto, Date fechaInicio, Date fechaFin, String condicion){
		
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaPromocion () + "(id_sucursal, id_producto, fecha_inicio, fecha_fin, condicion) values (?, ?, ?, ?, ?)");
        q.setParameters(idSucursal, idProducto, fechaInicio, fechaFin, condicion);
        return (long) q.executeUnique();
	}
}
