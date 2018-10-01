package superAndes.negocio;

public class ProductoCantidad {
	
	private Long idProducto;
	
	private Long idOrden;
	
	private Double volumen;
	
	private String unidadDeMedida;
	
	private Integer cantidadRecibida;
	
	private Double calidadRecibida;

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Long getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(Long idOrden) {
		this.idOrden = idOrden;
	}

	public Double getVolumen() {
		return volumen;
	}

	public void setVolumen(Double volumen) {
		this.volumen = volumen;
	}

	public String getUnidadDeMedida() {
		return unidadDeMedida;
	}

	public void setUnidadDeMedida(String unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}

	public Integer getCantidadRecibida() {
		return cantidadRecibida;
	}

	public void setCantidadRecibida(Integer cantidadRecibida) {
		this.cantidadRecibida = cantidadRecibida;
	}

	public Double getCalidadRecibida() {
		return calidadRecibida;
	}

	public void setCalidadRecibida(Double calidadRecibida) {
		this.calidadRecibida = calidadRecibida;
	}
}
