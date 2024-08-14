
public class Detalle {
	private String descripcion;
	private int cantCuotas;
	private double ValorTotal;
	private double valorXcuota;
	public Detalle(String descripcion, int cantCuotas, double valorTotal, double valorXcuota) {
		super();
		this.descripcion = descripcion;
		this.cantCuotas = cantCuotas;
		ValorTotal = valorTotal;
		this.valorXcuota = valorXcuota;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantCuotas() {
		return cantCuotas;
	}
	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}
	public double getValorTotal() {
		return ValorTotal;
	}
	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}
	public double getValorXcuota() {
		return valorXcuota;
	}
	public void setValorXcuota(double valorXcuota) {
		this.valorXcuota = valorXcuota;
	}
	@Override
	public String toString() {
		return "Detalle [descripcion=" + descripcion + ", cantCuotas=" + cantCuotas + ", ValorTotal=" + ValorTotal
				+ ", valorXcuota=" + valorXcuota + "]";
	}
	
	
}
