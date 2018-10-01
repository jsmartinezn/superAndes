package superAndes.negocio;

import java.util.Date;

public class OrdenPedido {
	
	public final static String E = "ENTREGADA";
	
	public final static String P = "PENDIENTE";
	
	public Long id;
		
	private Long idProveedor;
	
	private Long idSucursal;

	private Long idProductoCantidad;
	
	private Date fechaEspEntrega;
	
	private Date fechaEntrega;

	private Double calificacion;
	
	private String Estado;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public Long getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Long idSucursal) {
		this.idSucursal = idSucursal;
	}

	public Long getIdProductoCantidad() {
		return idProductoCantidad;
	}

	public void setIdProductoCantidad(Long idProductoCantidad) {
		this.idProductoCantidad = idProductoCantidad;
	}

	public Date getFechaEspEntrega() {
		return fechaEspEntrega;
	}

	public void setFechaEspEntrega(Date fechaEspEntrega) {
		this.fechaEspEntrega = fechaEspEntrega;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
}
