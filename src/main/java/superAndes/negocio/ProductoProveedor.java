package superAndes.negocio;

public class ProductoProveedor {
	
	private Long idProducto;
	
	private Long idProveedor;
	
	private Double precio;
	
	private Double indiceCalidad;

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getIndiceCalidad() {
		return indiceCalidad;
	}

	public void setIndiceCalidad(Double indiceCalidad) {
		this.indiceCalidad = indiceCalidad;
	}
}
