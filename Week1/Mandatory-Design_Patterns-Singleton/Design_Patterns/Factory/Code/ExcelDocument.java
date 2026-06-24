/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Pattern : Factory Method Design Pattern
 * Module  : Design Patterns
 */
package Code;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("  -> Opening Excel document in MS Excel...");
    }

    @Override
    public void save() {
        System.out.println("  -> Saving Excel document as .xlsx file...");
    }

    @Override
    public String getType() {
        return "Excel";
    }
}
