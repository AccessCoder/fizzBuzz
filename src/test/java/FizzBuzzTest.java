import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    Fizz testfizz = new Fizz();

    @Test
    void shouldReturnFizzIfValueIs3(){
        String actual = testfizz.fizzBuzz(3);
        Assertions.assertEquals("fizz", actual);

    }
    @Test
    void shouldReturnBuzzIfValueIs5(){
        String actual = testfizz.fizzBuzz(5);
        Assertions.assertEquals("buzz", actual);

    }
    @Test
    void shouldReturnFizzBuzzIfValueIs15(){
        String actual = testfizz.fizzBuzz(15);
        Assertions.assertEquals("fizzbuzz",actual);

    }
    @Test
    void shouldReturn4IfValueIs4(){
        String actual = testfizz.fizzBuzz(4);
        Assertions.assertEquals("4", actual);

    }


}
