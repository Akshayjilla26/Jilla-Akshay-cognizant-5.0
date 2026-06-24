/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Pattern : Factory Method Design Pattern
 * Module  : Design Patterns
 */
package Code;

public abstract class DocumentFactory {
    // Factory method to be implemented by subclasses
    public abstract Document createDocument();

    // Common workflow regardless of document type
    public void processDocument() {
        Document doc = createDocument();
        System.out.println("Processing: " + doc.getType() + " document");
        doc.open();
        doc.save();
    }
}
