package Ejercicio02;

public class Libro {
	private String titulo;
	private String autor;
	private String genero;
	private double precio;
	private int ISBN;

	public Libro() {
		
	}
	public Libro(String titulo, String autor, String genero, double precio, int ISBN) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.precio = precio;
		this.ISBN = ISBN;
	}
	
	//TITULO
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//AUTOR
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//GENERO
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	//PRECIO
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//ISBN
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
}