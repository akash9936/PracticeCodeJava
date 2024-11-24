package src.DSA.Builder_Shopping;

public class ShoppingCart {
    public static void main(String[] args) {
        // Creating a basic product with only required fields
        Product basicProduct = new Product.ProductBuilder("Laptop", 1200.99)
                .build();

        // Creating a product with some optional fields
        Product configuredProduct = new Product.ProductBuilder("Smartphone", 799.99)
                .setColor("Black")
                .setSize("6.5 inches")
                .setWarranty("2-year Warranty")
                .build();

        // Creating a fully configured product with all optional fields
        Product giftProduct = new Product.ProductBuilder("Headphones", 199.99)
                .setColor("Red")
                .setSize("Large")
                .setWarranty("1-year Warranty")
                .setGiftWrapping(true)
                .build();

        // Displaying the products
        System.out.println("Basic Product: " + basicProduct.getName() + ", Price: " + basicProduct.getPrice());
        System.out.println("Configured Product: " + configuredProduct.getName() + ", Color: " + configuredProduct.getColor() + ", Warranty: " + configuredProduct.getWarranty());
        System.out.println("Gift Product: " + giftProduct.getName() + ", Gift Wrapped: " + giftProduct.hasGiftWrapping());
    }
}
