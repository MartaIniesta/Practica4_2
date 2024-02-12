package Ejercicio02;

public class DiscoMusica {
	private String cantante;
	private String genero;
	private String album;
	private double precio;
	
	public DiscoMusica(){
		
	}
	public DiscoMusica(String cantante, String genero, String album, double precio){
		this.cantante = cantante;
		this.genero = genero;
		this.album = album;
		this.precio = precio;
	}
	
	//CANTANTE
	public String getCantante() {
		return cantante;
	}
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	
	//GENERO
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	//ALBUM
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	//PRECIO
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
