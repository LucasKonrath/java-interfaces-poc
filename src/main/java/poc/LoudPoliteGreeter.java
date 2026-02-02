package poc;

public class LoudPoliteGreeter implements Greeter, Loud, Polite {
    private final TimeProvider timeProvider;

    public LoudPoliteGreeter(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    // Must resolve conflict: Loud.style() vs Polite.style()
    @Override
    public String style() {
        // Combine both defaults explicitly
        return Loud.super.style() + "+" + Polite.super.style();
    }

    @Override
    public String greet(String name) {
        String base = "Hello " + name + " (t=" + timeProvider.epochSeconds() + ")";
        String polite = soften(base);
        return emphasize(polite) + "!";
    }
}
