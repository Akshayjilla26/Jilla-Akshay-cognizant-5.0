/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Program : E-Commerce Platform - Product Search
 * Module  : Data Structures & Algorithms
 */

public class Product {
    private int productId;
    private String productName;
    private double price;
    private String brand;

    public Product(int productId, String productName, double price, String brand) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.brand = brand;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Product { ID=" + productId +
               ", Name='" + productName + "'" +
               ", Price=Rs." + price +
               ", Brand='" + brand + "' }";
    }
}
