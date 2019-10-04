package MyTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuelConsumption {
    @Test
    public double countConsumption(double a, double b) {
        double consumption;
        //consumption = (a*100.0f)/b
        //a = tank volume
        //b = distance
        consumption = (a * 100.0f) / b;
        return consumption;

    }

    @Test
    public void showConsumption () {
        double c;
        double d;
        //consumption c = c
        // consumption d = d
        c = (50 * 100.0f) / 500;
        d = (40 * 100.0f) / 600;

        System.out.println("c is: "+ c +" and d is: " + d );

        Assertions.assertEquals(10, c);
        Assertions.assertEquals(7, d);

    }
}

