package superAndes.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

class SQLEstante {
	
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

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor
	 * @param pp - El Manejador de persistencia de la aplicación
	 */
	public SQLEstante (PersistenciaSuperAndes pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar una BODEGA a la base de datos de Parranderos
	 * @param pm - El manejador de persistencia
	 * @param idSucursal - El identificador de la sucursal
	 * @param tipoProducto - El identificador del bar
	 * @param fecha - La fecha en que se realizó la visita
	 * @param horario - EL horario en que se realizó la visita (DIURNO, NOCTURNO, TODOS)
	 * @return EL número de tuplas insertadas
	 */
	public long adicionarEstante (PersistenceManager pm,Long id,String tipoProducto,Double volumen,String unidadV,Double peso,String unidadP) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaBodega () + "(idSucursal, tipoProducto, volumen, unidadDeVolumen, peso,unidadPeso) values (?, ?, ?, ?, ?, ?)");
        q.setParameters(id,tipoProducto,volumen,unidadV,peso,unidadP);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar TODAS LAS VISITAS de la base de datos de Parranderos
	 * @param pm - El manejador de persistencia
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarTodas (PersistenceManager pm) 
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaEstante ());
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN VISITAN de la base de datos de Parranderos, por sus identificadores
	 * @param pm - El manejador de persistencia
	 * @param idBebedor - El identificador del bebedor
	 * @param idBar - El identificador del bar
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarBodega (PersistenceManager pm, Long idSucursal,String tipoProducto) 
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaEstante () + " WHERE idsucursal = ? AND tipoProducto = ?");
        q.setParameters(idSucursal, tipoProducto);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para ELIMINAR TODAS LAS VISITAS DE UN BEBEDOR de la base de datos de Parranderos, por su identificador
	 * @param pm - El manejador de persistencia
	 * @param idBebedor - El identificador del bebedor
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarTodasLasBodegasDeSucursal (PersistenceManager pm, long idSucursal) 
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaEstante () + " WHERE idsucursal = ?");
        q.setParameters(idSucursal);
        return (long) q.executeUnique();
	}
	
	public long darBodegas(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT FROM" + pp.darTablaEstante() );
		return (long) q.executeUnique();
	}
	
	public long darBodegasSucursal(PersistenceManager pm,Long idSucursal)
	{
		Query q = pm.newQuery(SQL, "SELECT FROM" + pp.darTablaEstante() + "WHERE idsucursal = ?");
		q.setParameters(idSucursal);
		return (long) q.executeUnique();
	}

}
