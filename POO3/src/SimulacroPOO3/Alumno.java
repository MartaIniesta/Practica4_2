package SimulacroPOO3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
	private int numLista;
	private String nombre;
	private String apellidos;
	private String DNI;
	private String email;
	private String direccion;
	private int NIF;
	
	public Alumno() {
		
	}
	public Alumno(int numLista, String nombre, String apellidos, String DNI, String email, String direccion, int NIF) {
		this.numLista = numLista;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.email = email;
		this.direccion = direccion;
		this.NIF = NIF;
	}
	
	//GET
	public int getNumLista() {
		return this.numLista;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public String getDNI() {
		return this.DNI;
	}
	public String getEmail() {
		return this.email;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public int getNIF() {
		return this.NIF;
	}
	
	//SET
	public void setNumLista(int numLista) {
		this.numLista = numLista;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setNIF(int NIF) {
		this.NIF = NIF;
	}
	
	public void Mostrar() {
		System.out.println(numLista + "º Alumno: " + nombre + " " + apellidos + " - " + DNI + " - " + email+  " - " + direccion + " - " + NIF);

	}
	public Modulo[] OpenAlumno(String num) {
		ArrayList<Modulo> resultado = new ArrayList<Modulo>();

		try {
			File fiModulos = new File("./ficheros/modulos.txt");
			File mitad = new File("./ficheros/modulo_alumno.txt");
			Scanner mita = new Scanner(mitad);
			
			while(mita.hasNextLine()) {
				String lineaMitad = mita.nextLine().toLowerCase().trim();
				String[] partesMitad = lineaMitad.split(",");
				Scanner fichero2 = new Scanner(fiModulos);
				
				if(num.equals(partesMitad[1])) {
					while(fichero2.hasNextLine()) {
						String linea2 = fichero2.nextLine().toLowerCase().trim();
						String[] partes2 = linea2.split("&");
						if(partes2[0].equals(partesMitad[0])) {
							int numLista = Integer.parseInt(partes2[0]);
							int numClases = Integer.parseInt(partes2[2]);
							int numAlumnos = Integer.parseInt(partes2[3]);
							Modulo actual = new Modulo(numLista, partes2[1], numClases, numAlumnos, partes2[4]);
							resultado.add(actual);
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
		      System.out.println("Error");
		      e.printStackTrace();
		}
		Modulo[] devolver = new Modulo[resultado.size()];
		devolver = resultado.toArray(devolver);
		return devolver;
	}
}