/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Pattern : Factory Method Design Pattern
 * Module  : Design Patterns
 */
package Code;

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        System.out.println("WordDocumentFactory: Creating a new Word Document...");
        return new WordDocument();
    }
}
