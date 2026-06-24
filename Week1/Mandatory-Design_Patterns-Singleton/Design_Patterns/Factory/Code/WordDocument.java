/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Pattern : Factory Method Design Pattern
 * Module  : Design Patterns
 */
package Code;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("  -> Opening Word document in MS Word...");
    }

    @Override
    public void save() {
        System.out.println("  -> Saving Word document as .docx file...");
    }

    @Override
    public String getType() {
        return "Word";
    }
}
