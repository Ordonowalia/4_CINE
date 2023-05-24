package objetos;

public class Peliculas {
	private String titulo;
	private String director;
	private int anio;
	

	public Peliculas(String titulo, String director, int anio) {
	
		this.titulo = titulo;
		this.director = director;
		this.anio = anio;
	
	}

	public Peliculas(String titulo) {
	this.titulo=titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	

	@Override
	public String toString() {
		return "Peliculas [titulo=" + titulo + ", director=" + director + ", anio=" + anio +  "]";
	}

}
