package superAndes.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import superAndes.negocio.Bodega;
import superAndes.negocio.Estante;

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
	public long adicionarEstante (PersistenceManager pm,Long id,String tipoProducto,Double volumen,Double volumen2,String unidadV,Double peso,Double peso2,String unidadP) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaBodega () + "(idSucursal, tipoProducto, volumen, volumenactual, unidadDeVolumen, peso, pesoactual, unidadPeso) values (?, ?, ?, ?, ?, ?, ?, ?)");
        q.setParameters(id,tipoProducto,volumen,volumen2, unidadV,peso, peso2,unidadP);
        return (long) q.executeUnique();
	}

	public List<Estante> darEstante(PersistenceManager pm,Long idSucursal)
	{
		Query q = pm.newQuery(SQL, "SELECT FROM" + pp.darTablaEstante() + "WHERE idsucursal = ?");
		q.setResultClass(Estante.class);
		q.setParameters(idSucursal);
		return q.executeList();
	}

}
