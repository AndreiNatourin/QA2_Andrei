import org.junit.jupiter.api.Test;

public class Percentage {
    @Test
    public float countAndreikaPercent(float a, float b) {
        float c;

        c = (a * 100.0f) / b;

        return c;
    }

    @Test
    public void countPercent () {
        float from = 200;
        float amount = 10;
        float percent;

        System.out.println(countAndreikaPercent(10, 100));

        percent = (amount*100.0f) / from;
        System.out.println("from" + from + "amount of" + amount + "is" + percent + "%");
    }

    @Test
    public void showPercent() {
        float c;
        float d;
        c = (30 * 100.0f) / 180;
        d = (20 * 100.0f) / 200;

        System.out.println("c is: "+ c +"% and d is: " + d + " % ");

    }
}

