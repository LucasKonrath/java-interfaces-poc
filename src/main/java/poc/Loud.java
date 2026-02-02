package poc;

public interface Loud {
    default String style() {
        return "LOUD";
    }

    default String emphasize(String s) {
        return s.toUpperCase();
    }
}
