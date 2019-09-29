import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Consumption {
    @Test
    public double calculateConsumption (double a, double b) {
        // a - tank volume
        // b - distance
        double c; // c - fuel consumption
        c = (a *100.0f)/b;
        return c;


    }
    @Test
    public void showConsumption () {

        double d; // new consumption d
        double e; // new consumption e
        d = (50*100.0f)/500;
        e = (40*100.0f)/800;
        System.out.println("d is: "+ d +" ltr/100km and e is: "+ e + " ltr/100km");


        Assertions.assertEquals(10, d);
        Assertions.assertEquals(5, e);
    }
}