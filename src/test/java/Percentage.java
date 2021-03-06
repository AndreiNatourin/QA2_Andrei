import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Percentage {
    private final Logger LOGGER = LogManager.getLogger(Percentage.class);

    @Test
    public double countPercent(double a, double b) {
        double c;

        c = (a * 100.0f) / b;
        return c;
    }

    @Test
    public void showPercent() {
        double c;
        double d;
        LOGGER.info("We are calculating");
        c = (30 * 100.0f) / 180;
        d = (20 * 100.0f) / 200;

        System.out.println("c is: " + c + "% and d is: " + d + " % ");

        Assertions.assertEquals(10, d);
        Assertions.assertEquals(16.66666603088379, c);

    }
}

