package Ejercicio02;

public class Cancion {
	private String titulo;
	private String artista;
	private double duracion;
	private String generoMusical;
	
	public Cancion() {
		
	}
	public Cancion(String titulo, String artista, double duracion, String generoMusical) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = duracion;
		this.generoMusical = generoMusical;
	}

	//TITULO
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//ARTISTA
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	//DURACION
	public double getDuracion() {
		return duracion;
	}
	public void setTipo(double duracion) {
		this.duracion = duracion;
	}
	
	//GENERO MUSICAL
	public String getGeneroMusical() {
		return generoMusical;
	}
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}
}