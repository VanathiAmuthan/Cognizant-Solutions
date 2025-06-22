import java.util.Arrays;
import java.util.Comparator;

public class Search {

    // Linear Search
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String targetName) {
        // Step 1: Sort the products by productName
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Step 2: Binary search logic
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = targetName.compareToIgnoreCase(products[mid].productName);

            if (compare == 0) {
                return products[mid]; // found
            } else if (compare < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null; // not found
    }
}
