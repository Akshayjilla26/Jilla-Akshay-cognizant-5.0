/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Program : E-Commerce Platform - Linear Search
 * Module  : Data Structures & Algorithms
 */

public class LinearSearch {

    // Returns the index of the product if found, else -1
    public int search(Product[] catalog, int targetId) {
        for (int index = 0; index < catalog.length; index++) {
            if (catalog[index].getProductId() == targetId) {
                return index;
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
