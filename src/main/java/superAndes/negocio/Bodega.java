package superAndes.negocio;

public class Bodega implements VOBodega {
	
	private Long idSucursal;
	
	private String tipoProducto;
	
	private Double volumen;
	
	private Double volumenActual;
	
	private String unidadVolumen;
	
	private Double peso;
	
	private Double pesoActual;
	
	private String unidadPeso;
	
	private Integer cantidad;
	
	public Bodega(){
		this.idSucursal = (long) 0;
		this.tipoProducto = "";
		this.volumen = 0.0;
		this.unidadVolumen = "cm3";
		this.volumen = 0.0;
		this.unidadPeso = "gr";
		this.pesoActual = 0.0;
		this.volumenActual = 0.0;
		this.cantidad = 0;
	}
	
	public Bodega(Long id, String tipoProducto, Double volumen,Double volumen2,String unidadV, Double peso,Double peso2,String unidadP,Integer cantidad)
	{
		this.idSucursal = id;
		this.tipoProducto = tipoProducto;
		this.volumen = volumen;
		this.peso = peso;
		this.unidadPeso = unidadP;
		this.unidadVolumen = unidadV;
		this.pesoActual = peso2;
		this.volumenActual = volumen2;
		this.cantidad = cantidad;
	}

	public Long getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Long idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Double getVolumen() {
		return volumen;
	}

	public void setVolumen(Double volumen) {
		this.volumen = volumen;
	}

	public String getUnidadVolumen() {
		return unidadVolumen;
	}

	public void setUnidadVolumen(String unidadVolumen) {
		this.unidadVolumen = unidadVolumen;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getUnidadPeso() {
		return unidadPeso;
	}

	public void setUnidadPeso(String unidadPeso) {
		this.unidadPeso = unidadPeso;
	}

	public Double getVolumenActual() {
		return volumenActual;
	}

	public void setVolumenActual(Double volumenActual) {
		this.volumenActual = volumenActual;
	}

	public Double getPesoActual() {
		return pesoActual;
	}

	public void setPesoActual(Double pesoActual) {
		this.pesoActual = pesoActual;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
}
