package superAndes.negocio;

public class Producto implements VOProducto {
	
	private Long id;
	
	private String marca;
	
	private String nombre;
	
	private String presentacion;
	
	private String unidadDeMedida;
	
	private Double volumen;
	
	private Double peso;
	
	private String codigoDeBarras;
	
	private String categoria;
	
	private String tipo;

	public Producto(){
		this.id = (long) 0;
		this.marca = "";
		this.nombre = "";
		this.presentacion = "";
		this.unidadDeMedida = "";
		this.volumen = 0.0;
		this.peso = 0.0;
		this.codigoDeBarras="";
		this.categoria = "";
		this.tipo = "";
	}
	
	public Producto(Long id,String marca,String nombre,String presentacion,String unidadDeMedida,
			Double volumen,Double peso,String codigoBarras,String categoria,String tipo){
		this.id = id;
		this.marca = marca;
		this.nombre = nombre;
		this.presentacion = presentacion;
		this.unidadDeMedida = unidadDeMedida;
		this.volumen = volumen;
		this.peso = peso;
		this.codigoDeBarras = codigoBarras;
		this.categoria = categoria;
		this.tipo = tipo;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public String getUnidadDeMedida() {
		return unidadDeMedida;
	}

	public void setUnidadDeMedida(String unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}

	public Double getVolumen() {
		return volumen;
	}

	public void setVolumen(Double volumen) {
		this.volumen = volumen;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}
