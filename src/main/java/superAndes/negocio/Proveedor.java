package superAndes.negocio;

public class Proveedor implements VOProveedor{
	
	private Long id;
	
	private String nit;
	
	private String nombre;
	
	public Proveedor(){
		this.id = (long) 0;
		this.nit = "";
		this.nombre = "";
	}
	
	public Proveedor(Long id,String nit,String nombre){
		this.id = id;
		this.nit = nit;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
