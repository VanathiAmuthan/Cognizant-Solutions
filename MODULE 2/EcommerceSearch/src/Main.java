public class Main {
    public static void main(String[] args) {

        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "T-Shirt", "Clothing")
        };

        // 🔍 Linear Search
        Product foundLinear = Search.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " +
            (foundLinear != null ? foundLinear.productName : "Not Found"));

        // 🔍 Binary Search
        Product foundBinary = Search.binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " +
            (foundBinary != null ? foundBinary.productName : "Not Found"));
    }
}
