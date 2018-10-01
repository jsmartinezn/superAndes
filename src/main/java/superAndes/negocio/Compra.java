package superAndes.negocio;

public class Compra implements VOCompra{
	
	private Long idCliente;
	
	private Long idSucursal;
	
	private Long idProducto;
	
	private Integer cantidad;
	
	private Boolean promocion;
	
	private Long id;
	
	public Compra(){
		this.id = (long)0;
		this.idCliente=(long)0;
		this.idProducto=(long)0;
		this.idSucursal=(long)0;
		this.cantidad = 0;
		this.promocion = false;
	}
	
	public Compra(Long id, Long idC, Long idP, Long idS, Integer cantidad, Boolean promocion){
		this.id = id;
		this.idCliente = idC;
		this.idSucursal = idS;
		this.idProducto = idP;
		this.cantidad = cantidad;
		this.promocion = promocion;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

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

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Boolean getPromocion() {
		return promocion;
	}

	public void setPromocion(Boolean promocion) {
		this.promocion = promocion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
