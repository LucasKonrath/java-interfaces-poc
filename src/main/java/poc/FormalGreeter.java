package poc;

public class FormalGreeter implements Greeter {
    private final TimeProvider timeProvider;

    public FormalGreeter(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    @Override
    public String greet(String name) {
        return "Good day, " + name + ". (t=" + timeProvider.epochSeconds() + ")";
    }
}
