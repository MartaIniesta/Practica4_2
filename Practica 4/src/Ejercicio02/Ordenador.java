package Ejercicio02;

public class Ordenador {
	private String modelo;
	private int numeroSerie;
	private String estado;
	private String marca;

	public Ordenador(){
		
	}
	public Ordenador(String modelo, int numeroSerie, String estado, String marca){
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.estado = estado;
		this.marca = marca;
	}
	
	//MODELO
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	//NUMERO DE SERIE
	public int getNumeroSerie(){
		return numeroSerie;
	}
	public void setModelo(int numeroSerie){
		this.numeroSerie = numeroSerie;
	}
	
	//ESTADO
	public String getEstado(){
		return estado;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	//MARCA
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
}
