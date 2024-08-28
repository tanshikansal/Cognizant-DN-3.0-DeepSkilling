import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean isHealthy = true; 
        if (isHealthy) {
            return Health.up().build();
        } else {
            return Health.down().withDetail("reason", "Database not reachable").build();
        }
    }
}
