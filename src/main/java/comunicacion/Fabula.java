package comunicacion;

// Clase.
public class Fabula extends Escrito {
	
	// Atributos.
	private String ensenanza;
	private String interpretacion;
	
	// Contructor.
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

	// Getters and Setters.
	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	// Metodos.
	public int palabrasTotales(int parametro) {
		return parametro*this.getPaginas()*1;
	}
	
	public String interpretacion() {
		return interpretacion;
	}

	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + ensenanza;
	}
	
}