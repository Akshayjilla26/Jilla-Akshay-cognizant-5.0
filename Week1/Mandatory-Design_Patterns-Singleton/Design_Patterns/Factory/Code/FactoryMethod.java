/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Pattern : Factory Method Design Pattern
 * Module  : Design Patterns
 */
package Code;

public class FactoryMethod {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("  Factory Method Pattern Demo");
        System.out.println("  Author: Jilla Siva Sai Akshay Guptha | 7963010");
        System.out.println("==============================================\n");

        DocumentFactory pdfFactory = new PDFFactory();
        pdfFactory.processDocument();

        System.out.println();

        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.processDocument();

        System.out.println();

        DocumentFactory excelFactory = new ExcelFactory();
        excelFactory.processDocument();

        System.out.println("\n==============================================");
        System.out.println("  All documents processed successfully.");
        System.out.println("==============================================");
    }
}
