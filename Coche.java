package usandoGenericos;

public class Coche implements Comparar<Coche> {

	private String marca;
	private String modelo;
	private int autonomia;
	private int precio;

	public Coche(String marca, String modelo, int autonomia, int precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.autonomia = autonomia;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", autonomia=" + autonomia + ", precio=" + precio + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public boolean esMayor(Coche o) {
		return o.getPrecio() > this.precio;

	}

	@Override
	public boolean esMenor(Coche o) {
		return o.getPrecio() < this.precio;
	}

	@Override
	public boolean esIgual(Coche o) {
		return o.getPrecio() == this.precio;
	}

}
