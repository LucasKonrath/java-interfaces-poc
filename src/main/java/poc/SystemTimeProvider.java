package poc;

import java.time.Instant;

public class SystemTimeProvider implements TimeProvider {
    @Override
    public long epochSeconds() {
        return Instant.now().getEpochSecond();
    }
}
