package SimulacroPOO3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {
	private int numLista;
	private String asignatura;
	private int numClases;
	private int numAlumnos;
	private String nombresProf;
		
	public Modulo() {
		
	}
	public Modulo(int numLista, String asignatura, int numClases, int numAlumnos, String nombresProf) {
		this.numLista = numLista;
		this.asignatura = asignatura;
		this.numClases = numClases;
		this.numAlumnos = numAlumnos;
		this.nombresProf = nombresProf;
	}
	
	//GET
	public int getNumLista() {
		return this.numLista;
	}
	public String getAsignatura() {
		return this.asignatura;
	}
	public int getNumClases() {
		return this.numClases;
	}
	public int getNumAlumnos() {
		return this.numAlumnos;
	}
	public String getNombresProf() {
		return this.nombresProf;
	}
	
	//SET
	public void setNumLista(int numLista) {
		this.numLista = numLista;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public void setNumClases(int numClases) {
		this.numClases = numClases;
	}
	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}
	public void setNombresProf(String nombresProf) {
		this.nombresProf = nombresProf;
	}
	
	public void Mostrar() {
		System.out.println(numLista + "º Profesor: " + asignatura + " - " + numClases + " - " + numAlumnos + " - " + nombresProf);
	}
	public Alumno[] leerModulo(String num) {
		ArrayList<Alumno> resultado = new ArrayList<Alumno>();

		try {
			File alumnos = new File("./ficheros/alumnos.txt");
			File moduloAlumno = new File("./ficheros/modulo_alumno.txt");
			Scanner dato1 = new Scanner(moduloAlumno);
			
			while(dato1.hasNextLine()) {
				String lineaMA = dato1.nextLine();
				String[] campoMA = lineaMA.split(",");
				Scanner dato2 = new Scanner(alumnos);
				
				if(num.equals(campoMA[0])) {
					while(dato2.hasNextLine()) {
						String lineaAl = dato2.nextLine();
						String[] campoAl = lineaAl.split("&");
						if(campoAl[0].equals(campoMA[1])) {
							int numLista = Integer.parseInt(campoAl[0]);
							int NIF = Integer.parseInt(campoAl[6]);
							Alumno actual = new Alumno (numLista, campoAl[1], campoAl[2], campoAl[3], campoAl[4], campoAl[5], NIF);
							resultado.add(actual);
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
		      System.out.println("Error");
		      e.printStackTrace();
		}
		Alumno[] devolver = new Alumno[resultado.size()];
		devolver = resultado.toArray(devolver);
		return devolver;
	}
}