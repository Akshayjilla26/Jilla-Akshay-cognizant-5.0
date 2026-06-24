/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Program : E-Commerce Platform - Binary Search
 * Module  : Data Structures & Algorithms
 */

public class BinarySearch {

    // Returns the index of the product if found, else -1
    // Assumes product array is sorted by productId
    public int search(Product[] catalog, int targetId) {
        int low = 0;
        int high = catalog.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midId = catalog[mid].getProductId();

            if (midId == targetId) {
                return mid;
            } else if (midId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public void displayResult(Product[] catalog, int targetId) {
        int result = search(catalog, targetId);
        if (result != -1) {
            System.out.println("  [FOUND] " + catalog[result]);
        } else {
            System.out.println("  [NOT FOUND] No product with ID: " + targetId);
        }
    }
}
