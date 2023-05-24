package utilidades;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import objetos.Cine;
import objetos.Peliculas;

public class Read {

	private final static String FICHERO1 = "C:\\Users\\nukep\\desktop\\ficherosprog\\cine.txt";
	private final static String FICHERO2 = "C:\\Users\\nukep\\desktop\\ficherosprog\\peliculas.txt";

	private HashMap<String, Cine> listaCines = new HashMap<>();

	public HashMap<String, Cine> mezclarDatos() {

		BufferedReader ficheroEntrada;
		BufferedReader ficheroEntrada1;

		try {
			// BufferedReader enlaza con un fichero; para ello en java hay que crear un
			// FileReader
			ficheroEntrada = new BufferedReader(new FileReader(FICHERO1));

			// leo una linea del fichero

			String codigo = ficheroEntrada.readLine();

			// mientras que las lineas existan y no leamos null

			while (codigo != null) {
				Cine cine = new Cine(codigo);
				cine.setNombre(ficheroEntrada.readLine());
				cine.setNumSalas(Integer.parseInt(ficheroEntrada.readLine()));
				cine.setLocalidad(ficheroEntrada.readLine());
				listaCines.put(codigo, cine);
				codigo = ficheroEntrada.readLine();
			}
			ficheroEntrada1 = new BufferedReader(new FileReader(FICHERO2));

			String titulo = ficheroEntrada1.readLine();

			// mientras que las lineas existan y no leamos null

			while (titulo != null) {
				Peliculas peli = new Peliculas(titulo);
				peli.setDirector(ficheroEntrada1.readLine());
				peli.setAnio(Integer.parseInt(ficheroEntrada1.readLine()));
				String codigosCines = ficheroEntrada1.readLine();
				String[] codigosCineArray = codigosCines.split("\\*");
				for (int i = 0; i < codigosCineArray.length; i++) {
					String codigoCine = codigosCineArray[i];
					if (listaCines.containsKey(codigoCine)) {
						Cine cineActual = listaCines.get(codigoCine);
						ArrayList<Peliculas> pelisActuales = cineActual.getPeliculas();
						pelisActuales.add(peli);
						listaCines.put(codigoCine, cineActual);
					}
				}

				titulo = ficheroEntrada1.readLine();
			}

			ficheroEntrada1.close();

		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}
		return listaCines;

	}

}