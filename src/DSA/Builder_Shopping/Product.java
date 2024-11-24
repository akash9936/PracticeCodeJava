package src.DSA.Builder_Shopping;

// Product class with optional and required fields.
public class Product {
    // Required fields
    private final String name;
    private final double price;

    // Optional fields
    private final String color;
    private final String size;
    private final String warranty;
    private final boolean giftWrapping;

    // Private constructor - only accessible via the builder
    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.color = builder.color;
        this.size = builder.size;
        this.warranty = builder.warranty;
        this.giftWrapping = builder.giftWrapping;
    }

    // Getter methods to access product details
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getColor() { return color; }
    public String getSize() { return size; }
    public String getWarranty() { return warranty; }
    public boolean hasGiftWrapping() { return giftWrapping; }

    // Nested ProductBuilder class
    public static class ProductBuilder {
        // Required fields
        private final String name;
        private final double price;

        // Optional fields - initialized to default values
        private String color = "Default Color";
        private String size = "Default Size";
        private String warranty = "No Warranty";
        private boolean giftWrapping = false;

        // Constructor for required fields
        public ProductBuilder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        // Setter for optional field 'color'
        public ProductBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        // Setter for optional field 'size'
        public ProductBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        // Setter for optional field 'warranty'
        public ProductBuilder setWarranty(String warranty) {
            this.warranty = warranty;
            return this;
        }

        // Setter for optional field 'giftWrapping'
        public ProductBuilder setGiftWrapping(boolean giftWrapping) {
            this.giftWrapping = giftWrapping;
            return this;
        }

        // Builds and returns the final Product object
        public Product build() {
            return new Product(this);
        }
    }
}
