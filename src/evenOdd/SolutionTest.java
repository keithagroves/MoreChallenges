package evenOdd;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.*;
import java.util.stream.IntStream;

public class SolutionTest {
    @Test
    public void test1() {
       assertEquals("odd", Codewars.oddOrEven(new int[] {2, 5, 34, 6}));
       assertEquals("odd", Codewars.oddOrEven(new int[] {0, 1, 2}));
       assertEquals("even", Codewars.oddOrEven(new int[] {0, 1, 3}));
       assertEquals("even", Codewars.oddOrEven(new int[] {1023, 1, 2}));
    }
    
    @Test
    public void randomTests() {
    Random r = new Random();
     for(int j = 1; j <= 200; j++) {
      int length = 1+r.nextInt(10);
      int[] array = new int[length];
        for(int i = 0; i < array.length; i++) {
        int random_number = 1+r.nextInt(2000);
        array[i] = random_number;
        }

        assertEquals(this.n(array), Codewars.oddOrEven(array));
    }
    }
    // my solution
    private static String n (int[] array) {
      int sum = IntStream.of(array).sum();
      return (sum%2==0) ? "even" : "odd";
  }
}