package comunicacion;

// Clase.
public abstract class Escrito extends Pictograma {
	
	// Atributos.
	private String titulo;
	private String autor;
	private int paginas;
	
	// Constructor.
	public Escrito(String origen, String titulo, String autor, int paginas) {
		super(origen);
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	// Getters and Setters.
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	// Metodos.
	public String resumen() {
		String resum = this.getOrigen() + "\n";
		resum += this.titulo + "\n";
		resum += this.autor + "\n";
		resum += this.paginas;
		return resum;
	}
	
	abstract int palabrasTotales(int palabrasPagina);

}