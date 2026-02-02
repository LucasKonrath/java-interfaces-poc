package poc;

public interface Greeter {
    String greet(String name);

    // Default method: implementations may override
    default String language() {
        return defaultLanguage();
    }

    // Static method: belongs to the interface type
    static String defaultLanguage() {
        return "en";
    }
}
