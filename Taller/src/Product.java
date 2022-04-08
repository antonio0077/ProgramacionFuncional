import java.math.BigDecimal;

public class Product {
	
	private String name;
	private BigDecimal price;
	private Tax tax;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Tax getTax() {
		return tax;
	}
	public void setTax(Tax tax) {
		this.tax = tax;
	}
	
	public Product(String name, BigDecimal price, Tax tax) {
		super();
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	
	

	


	
	

}
