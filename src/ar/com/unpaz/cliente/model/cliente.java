package ar.com.unpaz.cliente.model;

public class cliente {
	
	
	private String id;
	private String nombreApellido;
	private String tipoConsumidor;
	private String fecha;
	
	public cliente(String id, String nombreApellido, String tipoConsumidor, String fecha) {
		this.id = id;
		this.nombreApellido = nombreApellido;
		this.tipoConsumidor = tipoConsumidor;
		this.fecha = fecha;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getTipoConsumidor() {
		return tipoConsumidor;
	}

	public void setTipoConsumidor(String tipoConsumidor) {
		this.tipoConsumidor = tipoConsumidor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "cliente [id=" + id + ", nombreApellido=" + nombreApellido + ", tipoConsumidor=" + tipoConsumidor
				+ ", fecha=" + fecha + "]";
	}
	
	
	
	
	
	
}
