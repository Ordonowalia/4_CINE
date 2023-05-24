package utilidades;

import objetos.Peliculas;

public class PeliCreator {

	public Peliculas getPeli(String titulo, String director, String anio, String codigoCine) {

		Peliculas devolver = new Peliculas(titulo);

		try {
			devolver.setDirector(director);
			devolver.setAnio(Integer.parseInt(anio));

		} catch (Exception e) {

			e.printStackTrace();
			devolver = null;

		}

		return devolver;

	}

}
