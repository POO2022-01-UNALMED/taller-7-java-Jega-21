package comunicacion;

// Clase.
public class Periodico extends Escrito {
	
	// Atributos.
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	// Contructor.
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	// Getters and Setters.
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPrimicia() {
		return primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	// Metodos.
	public int palabrasTotales(int parametro) {
		return parametro*this.getPaginas()*10;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + fecha + "\n" + primicia;
	}

}