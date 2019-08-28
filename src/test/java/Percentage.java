import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Percentage {
    @Test
    public float countPercent(float a, float b) {
        float c;

        c = (a * 100.0f) / b;
        return c;

    }

    @Test
    public void showPercent() {
        float c;
        float d;
        c = (30 * 100.0f) / 180;
        d = (20 * 100.0f) / 200;

        System.out.println("c is: "+ c +"% and d is: " + d + " % ");

        Assertions.assertEquals(10, d);
        Assertions.assertEquals(16.666666, c);

    }
}

