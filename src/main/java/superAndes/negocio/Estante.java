package superAndes.negocio;

public class Estante implements VOEstante {
	
	private Long idSucursal;
	
	private String tipoProducto;
	
	private Double volumen;
	
	private String unidadVolumen;
	
	private Double peso;
	
	private String unidadPeso;

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
}
