
public class Titular {
	
	private String nombre;
	private double saldo;
	public Titular(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Titular [nombre=" + nombre + ", saldo=" + saldo + "]";
	}
	
}
