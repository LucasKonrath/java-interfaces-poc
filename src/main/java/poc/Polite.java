package poc;

public interface Polite {
    default String style() {
        return "POLITE";
    }

    default String soften(String s) {
        return s + ", please";
    }
}
