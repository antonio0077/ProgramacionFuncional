import java.math.BigDecimal;

public enum Tax {
	NORMAL(new BigDecimal("0.21")), REDUCED(new BigDecimal("0.1")), SUPERREDUCED(new BigDecimal("0.04"));

	private BigDecimal precio;
	
	Tax(BigDecimal precio) {
		this.precio = precio;
	}
	
	public BigDecimal getPrecio() {
		return precio;
	}
	
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
}
