/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Pattern : Factory Method Design Pattern
 * Module  : Design Patterns
 */
package Code;

public class PDFFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        System.out.println("PDFFactory: Creating a new PDF Document...");
        return new PDFDocument();
    }
}
