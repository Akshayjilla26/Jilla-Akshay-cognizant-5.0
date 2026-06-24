/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Pattern : Singleton Design Pattern
 * Module  : Design Patterns
 */

public class Singleton {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("  Singleton Pattern Demo - ApplicationConfig");
        System.out.println("  Author: Jilla Siva Sai Akshay Guptha | 7963010");
        System.out.println("==============================================\n");

        // First instance request
        ApplicationConfig config1 = ApplicationConfig.getInstance();
        System.out.println("\nConfig1 Details:");
        config1.displayConfig();

        // Second instance request - should return same object
        ApplicationConfig config2 = ApplicationConfig.getInstance();
        config2.setEnvironment("Production");

        System.out.println("\nConfig2 Details (after update):");
        config2.displayConfig();

        // Verify both references point to same object
        System.out.println("\n--- Singleton Verification ---");
        System.out.println("config1 HashCode : " + config1.hashCode());
        System.out.println("config2 HashCode : " + config2.hashCode());

        if (config1 == config2) {
            System.out.println("Result: SAME instance — Singleton Pattern working correctly!");
        } else {
            System.out.println("Result: DIFFERENT instances — Singleton Pattern failed!");
        }

        System.out.println("\n==============================================");
    }
}
