package objetos;

import java.util.ArrayList;

public class Cine {

	private String codigo;
	private String nombre;
	private int numSalas;
	private String localidad;
	private ArrayList<Peliculas> peliculas;

	public Cine(String codigo) {
		this.codigo = codigo;
		this.peliculas= new ArrayList<Peliculas>();
	}

	public Cine(String codigo, String nombre, int numSalas, String localidad, ArrayList<Peliculas> peliculas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.numSalas = numSalas;
		this.localidad = localidad;
		this.peliculas = peliculas;
	}

	public ArrayList<Peliculas> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Peliculas> peliculas) {
		this.peliculas = peliculas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumSalas() {
		return numSalas;
	}

	public void setNumSalas(int numSalas) {
		this.numSalas = numSalas;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Cine [codigo=" + codigo + ", nombre=" + nombre + ", numSalas=" + numSalas + ", localidad=" + localidad
				+ ", peliculas=" + peliculas + "]";
	}

	

}
