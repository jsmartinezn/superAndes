package superAndes.negocio;

public class SucursalProducto {
	
	private Long idSucursal;
	
	private Long idProducto;
	
	private Double precio;
	
	private Integer nivelDeReorden;

	public Long getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Long idSucursal) {
		this.idSucursal = idSucursal;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getNivelDeReorden() {
		return nivelDeReorden;
	}

	public void setNivelDeReorden(Integer nivelDeReorden) {
		this.nivelDeReorden = nivelDeReorden;
	}
}