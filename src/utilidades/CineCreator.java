package utilidades;

import objetos.Cine;

public class CineCreator {

	public Cine getCine(String codigo, String nombre, String numSalas, String localidad) {

		Cine devolver = new Cine(codigo);

		try {
			devolver.setNombre(nombre);
			devolver.setNumSalas(Integer.parseInt(numSalas));
			devolver.setLocalidad(localidad);

		} catch (Exception e) {

			e.printStackTrace();
			devolver = null;

		}

		return devolver;

	}

}
