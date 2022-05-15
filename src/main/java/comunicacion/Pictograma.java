package comunicacion;

// Clase.
public abstract class Pictograma {
	
	// Atributos.
	private String origen;
	
	// Constructor.
	public Pictograma(String origen) {
		super();
		this.origen = origen;
	}
	
	// Getters and Setters.
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	// Metodos.
	abstract String interpretacion();
	
	public abstract String toString();

}