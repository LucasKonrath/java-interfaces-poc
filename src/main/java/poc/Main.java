package poc;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Interface POC ==");

        // 1) Dependency injection via interface
        TimeProvider clock = new SystemTimeProvider();
        Greeter friendly = new FriendlyGreeter(clock);
        Greeter formal = new FormalGreeter(clock);

        System.out.println("\n-- Basic interface usage + DI --");
        System.out.println(friendly.greet("Ada"));
        System.out.println(formal.greet("Ada"));

        // 2) Default + static interface methods
        System.out.println("\n-- Default + static methods --");
        System.out.println("Default language: " + Greeter.defaultLanguage());
        System.out.println("Friendly language: " + friendly.language());
        System.out.println("Formal language: " + formal.language());

        // 3) Multiple interface inheritance and default method conflict resolution
        System.out.println("\n-- Multiple interfaces (default method conflict) --");
        LoudPoliteGreeter loudPolite = new LoudPoliteGreeter(clock);
        System.out.println(loudPolite.greet("Ada"));
        System.out.println("style() resolved to: " + loudPolite.style());

        // 4) Polymorphism: same interface, different behavior
        System.out.println("\n-- Polymorphism --");
        Greeter[] greeters = { friendly, formal, loudPolite };
        for (Greeter g : greeters) {
            System.out.println(g.getClass().getSimpleName() + ": " + g.greet("Lin"));
        }

        System.out.println("\nDone.");
    }
}
