package utilidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import objetos.Peliculas;
import objetos.Cine;

public class Writer {

	private final static String FICHERO3 = "C:\\Users\\nukep\\desktop\\ficherosprog\\carteleras.txt";
	BufferedWriter ficheroSalida;

	public void escribirDatos(HashMap<String, Cine> listaCines) throws IOException {
		ficheroSalida = new BufferedWriter(new FileWriter(FICHERO3));

		for (String listaCine : listaCines.keySet()) {

			ficheroSalida.write(listaCine);
			ficheroSalida.newLine();
			Cine cineActual = listaCines.get(listaCine);

			ficheroSalida.write(cineActual.getNombre());
			ficheroSalida.newLine();
			ficheroSalida.write(cineActual.getLocalidad() + "");
			ficheroSalida.newLine();
			for (int i = 0; i<cineActual.getPeliculas().size();i++) {
				Peliculas peliActual = cineActual.getPeliculas().get(i);
				ficheroSalida.write(peliActual.getTitulo() + "");
				ficheroSalida.newLine();
			}

		}
		ficheroSalida.close();
	}
}
