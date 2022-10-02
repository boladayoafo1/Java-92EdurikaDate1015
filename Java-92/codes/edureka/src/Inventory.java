
public class Inventory {

	public static void main(String[] args) {
		Product product = new Product();
		//System.out.println(product.productId); //The field Product.productId is not visible
		System.out.println(product.getProductId()+ " | "  + product.getProductName() + " | " + product.getProductPrice());
		
		product.setProductId(1001254);
		product.setProductName("Computer");
		product.setProductPrice(45270.5f);
		
		System.out.println(product.getProductId()+ " | "  + product.getProductName() + " | " + product.getProductPrice());
		
		System.out.println("instance is of type --> " + product.getClass().getName());
		
		System.out.println(product); //toString()
	}
}