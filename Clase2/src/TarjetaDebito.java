import java.sql.Date;
import java.time.LocalDate;

public class TarjetaDebito extends Tarjeta {
	//ctrl+ f
	private String pinAsociado;
	
	public TarjetaDebito(Titular titular, String numeroTarjeta, LocalDate fechaExpiracion, String cvv,
			String pinAsociado) {
		super(titular, numeroTarjeta, fechaExpiracion, cvv);
		this.pinAsociado = pinAsociado;
	}

	

	public String getPinAsociado() {
		return pinAsociado;
	}

	public void setPinAsociado(String pinAsociado) {
		this.pinAsociado = pinAsociado;
	}

	
	
	
	
}
