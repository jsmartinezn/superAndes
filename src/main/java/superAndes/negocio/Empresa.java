package superAndes.negocio;

public class Empresa extends Cliente{
	
	private Long nit;
	
	private String direccion;

	public Long getNit() {
		return nit;
	}

	public void setNit(Long nit) {
		this.nit = nit;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
