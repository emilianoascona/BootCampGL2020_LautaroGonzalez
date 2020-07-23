package ejer5;

public  class Electrodomestico {
	private String marca;
	private double peso;
	private char consumo;
	private String color;
	
	public void Encender() {
		System.out.println("se encencio Electrodomestico");
	}
	public void apagar() {
		System.out.println("se apago el Electrodomestico");
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public char getConsumo() {
		return consumo;
	}
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
