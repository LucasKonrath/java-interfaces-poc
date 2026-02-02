package poc;

public class FriendlyGreeter implements Greeter {
    private final TimeProvider timeProvider;

    public FriendlyGreeter(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    @Override
    public String greet(String name) {
        return "Hey " + name + "! (t=" + timeProvider.epochSeconds() + ")";
    }

    @Override
    public String language() {
        return "en-US";
    }
}
