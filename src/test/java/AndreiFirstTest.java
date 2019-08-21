import org.junit.jupiter.api.Test;

public class AndreiFirstTest {

    private Integer sum(Integer a, Integer b) {
        return a + b;    }

    @Test
    public void showSum() {
        Integer c;
        Integer d;

        c = sum(15, 5);
        d = sum(25, 15);

        System.out.println("c is:" + c + " and d is:" + d);

    }}


