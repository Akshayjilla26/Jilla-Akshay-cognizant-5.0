/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Program : E-Commerce Platform - Search Function Demo
 * Module  : Data Structures & Algorithms
 */

public class Main {

    public static void main(String[] args) {

        // Product catalog with brand and price attributes
        Product[] catalog = new Product[5];
        catalog[0] = new Product(101, "Laptop",       55000.00, "Dell");
        catalog[1] = new Product(102, "Smartphone",   18000.00, "Samsung");
        catalog[2] = new Product(103, "Headphones",    2500.00, "Sony");
        catalog[3] = new Product(104, "Smart Watch",   8999.00, "Noise");
        catalog[4] = new Product(105, "Tablet",       32000.00, "Apple");

        BinarySearch binarySearch = new BinarySearch();
        LinearSearch linearSearch = new LinearSearch();

        System.out.println("==============================================");
        System.out.println("  E-Commerce Product Search System");
        System.out.println("  Author: Jilla Siva Sai Akshay Guptha | 7963010");
        System.out.println("==============================================");

        System.out.println("\n--- Binary Search Results ---");
        binarySearch.displayResult(catalog, 101);
        binarySearch.displayResult(catalog, 103);
        binarySearch.displayResult(catalog, 106);

        System.out.println("\n--- Linear Search Results ---");
        linearSearch.displayResult(catalog, 102);
        linearSearch.displayResult(catalog, 104);
        linearSearch.displayResult(catalog, 999);

        System.out.println("\n==============================================");
    }
}
