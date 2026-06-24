/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Pattern : Factory Method Design Pattern
 * Module  : Design Patterns
 */
package Code;

public class ExcelFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        System.out.println("ExcelFactory: Creating a new Excel Document...");
        return new ExcelDocument();
    }
}
