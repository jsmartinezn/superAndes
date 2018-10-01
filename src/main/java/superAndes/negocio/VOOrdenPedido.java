package superAndes.negocio;

import java.util.Date;

public interface VOOrdenPedido {

	public Long getId();
	
	public Long getIdProveedor();
	
	public Long getIdSucursal();
	
	public Long getIdProductoCantidad();
	
	public Date getFechaEspEntrega();
	
	public Date getFechaEntrega();
	
	public Double getCalificacion();
	
	public String getEstado();
}
