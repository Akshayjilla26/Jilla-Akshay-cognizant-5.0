/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Pattern : Factory Method Design Pattern
 * Module  : Design Patterns
 */
package Code;

public class PDFDocument implements Document {

    @Override
    public void open() {
        System.out.println("  -> Opening PDF document in Adobe Reader...");
    }

    @Override
    public void save() {
        System.out.println("  -> Saving PDF document as .pdf file...");
    }

    @Override
    public String getType() {
        return "PDF";
    }
}
