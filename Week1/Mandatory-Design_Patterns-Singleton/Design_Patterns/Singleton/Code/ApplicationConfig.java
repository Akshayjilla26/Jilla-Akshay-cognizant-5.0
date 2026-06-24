/**
 * Author  : Jilla Siva Sai Akshay Guptha
 * ID      : 7963010
 * Pattern : Singleton Design Pattern
 * Module  : Design Patterns
 */

public class ApplicationConfig {

    private static ApplicationConfig configInstance;
    private String appName;
    private String version;
    private String environment;

    // Private constructor to prevent direct instantiation
    private ApplicationConfig() {
        this.appName    = "CognizantFSE-App";
        this.version    = "1.0.0";
        this.environment = "Development";
        System.out.println("[ApplicationConfig] Configuration instance created.");
    }

    // Thread-safe lazy initialization
    public static synchronized ApplicationConfig getInstance() {
        if (configInstance == null) {
            configInstance = new ApplicationConfig();
        }
        return configInstance;
    }

    public void displayConfig() {
        System.out.println("  App Name    : " + appName);
        System.out.println("  Version     : " + version);
        System.out.println("  Environment : " + environment);
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
        System.out.println("[ApplicationConfig] Environment updated to: " + environment);
    }

    public String getAppName() { return appName; }
    public String getVersion()  { return version; }
    public String getEnvironment() { return environment; }
}
