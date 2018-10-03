package superAndes.negocio;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import com.google.gson.JsonObject;

import superAndes.persistencia.PersistenciaSuperAndes;


public class SuperAndes {

	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Logger para escribir la traza de la ejecuci�n
	 */
	private static Logger log = Logger.getLogger(SuperAndes.class.getName());
	
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia
	 */
	private PersistenciaSuperAndes pp;
	
	/* ****************************************************************
	 * 			M�todos
	 *****************************************************************/
	/**
	 * El constructor por defecto
	 */
	public SuperAndes ()
	{
		pp = PersistenciaSuperAndes.getInstance ();
	}
	
	/**
	 * El constructor qye recibe los nombres de las tablas en tableConfig
	 * @param tableConfig - Objeto Json con los nombres de las tablas y de la unidad de persistencia
	 */
	public SuperAndes (JsonObject tableConfig)
	{
		pp = PersistenciaSuperAndes.getInstance (tableConfig);
	}
	
	/**
	 * Cierra la conexi�n con la base de datos (Unidad de persistencia)
	 */
	public void cerrarUnidadPersistencia ()
	{
		pp.cerrarUnidadPersistencia ();
	}
	
	public Bodega adicionarBodega(String tipoProducto,Double volumen,String unidadV,Double peso,String unidadP){
		return pp.adicionarBodega(tipoProducto, volumen, unidadV, peso, unidadP);
	}
	
	public List<String> indiceDeOcupacionPesoBodega(Long idSucursal){
		return pp.indiceDeOcupacionPesoBodega(idSucursal);
	}
	
	public List<String> indiceDeOcupacionVolumenBodega(Long idSucursal){
		return pp.indiceDeOcupacionVolumenBodega(idSucursal);
	}
	
	public Compra adicionarCompra(Long idC, Long idP, Long idS, Integer cantidad, Boolean promocion,Double precio,Date fecha){
		return pp.adicionarCompra(idC, idP, idS, cantidad, promocion, precio, fecha);
	}
	
	public List<VOCompra> darComprasFechas(Date fechaInicio,Date fechaFin){
		List<Compra> nueva = pp.darComprasFechas(fechaInicio, fechaFin);
		List<VOCompra> resp = new LinkedList<>();
		for(Compra compra : nueva)
			resp.add(compra);
		return resp;
	}
	
	public List<VOCompra> darComprasPorUsuario(Date fechaInicio,Date fechaFin,Long idCliente){
		List<Compra> nueva = pp.darComprasPorUsuario(fechaInicio, fechaFin,idCliente);
		List<VOCompra> resp = new LinkedList<>();
		for(Compra compra : nueva)
			resp.add(compra);
		return resp;
	}
	
	public Empresa adicionarEmpresa(String nombre, String correo, Long nit,String direccion){
		return pp.adicionarEmpresa(nombre, correo, nit, direccion);
	}
	
	public Estante adicionarEstante(String tipoProducto,Double volumen,Double volumen2,String unidadV,Double peso,Double peso2,String unidadP,Integer nivel){
		return pp.adicionarEstante(tipoProducto, volumen, volumen2, unidadV, peso, peso2, unidadP,nivel);
	}
	
	public List<String> indiceDeOcupacionPesoEstante(Long idSucursal){
		return pp.indiceDeOcupacionPesoEstante(idSucursal);
	}
	
	public List<String> indiceDeOcupacionVolumenEstante(Long idSucursal){
		return pp.indiceDeOcupacionVolumenEstante(idSucursal);
	}
	
	public OrdenPedido adicionarOrdenPedido(Long idProveedor,Long idSucursal,Date fechaEsperada, String estado){
		return pp.adicionarOrdenPedido(idProveedor, idSucursal, fechaEsperada, estado);
	}

	public long realizarEntrega(Long id,Date fecha,Double calificacion,String estado){
		return pp.realizarEntrega(id, fecha, calificacion, estado);
	}
	
	public List<VOOrdenPedido> darOrdenes(){
		List<OrdenPedido> temp = pp.darOrdenes();
		List<VOOrdenPedido> resp = new LinkedList<>();
		for(OrdenPedido nuevo : temp)
			resp.add(nuevo);
		return resp;
	}	
	
	public PersonaNatural adicionarPersona(String nombre, String correo, Long cedula){
		return pp.adicionarPersona(nombre, correo, cedula);
	}
}
