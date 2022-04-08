import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;



public class taller2 {
	
	public static BigDecimal calculateTax = new BigDecimal("0");
	public static BigDecimal taxPrice = new BigDecimal("0");
	public static BigDecimal total = new BigDecimal("0");
	
	public static void main(String[] args) {

		

		List<Product> shoppingCart = List.of(
		new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
		new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
		new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
		new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
		new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
		new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		// Implementación
		
		
		shoppingCart.stream().forEach((p) -> {
			total=total.add(p.getPrice().add(p.getPrice().multiply(p.getTax().getPrecio())));
		});
		
		System.out.println(total);
		
		String resultado = shoppingCart.stream().filter(product -> product.getName().startsWith("C")).map(product -> product.getName()).collect(Collectors.joining(", ", "Resultado: ", "."));
		System.out.println(resultado);
	}

}
