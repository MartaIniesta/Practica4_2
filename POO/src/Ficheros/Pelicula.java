package Ficheros;

public class Pelicula {
	private String titulo;
	private int duracion;
	private String sinopsis;
	private String genero;
	
	public Pelicula() {
		
	}
	public Pelicula(String titulo, int duracion, String sinopsis, String genero) {
		this.setTitulo(titulo);
		this.setDuracion(duracion);
		this.setSinopsis(sinopsis);
		this.setGenero(genero);
	}
	
	//GET
	public String getTitulo() {
		return this.titulo;
	}
	public int getDuracion() {
		return this.duracion;
	}
	public String getSinopsis() {
		return this.sinopsis;
	}
	public String getGenero() {
		return this.genero;
	}
	
	//SET
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}