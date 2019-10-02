import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        //Given
        Calculator calc = new Calculator();
        int x = 1, y = 2;
        int expected = 3;
        //When
        int actual = calc.add(x, y);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractTest(){
        Calculator calc = new Calculator();
        int x = 2, y = 1;
        int expected = 1;
        int actual = calc.subtract(x, y);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest(){
        Calculator calc = new Calculator();
        int x = 2, y = 3;
        int expected = 6;
        long actual = (long) calc.multiply(x ,y);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divideTest(){
        Calculator calc = new Calculator();
        int x = 10, y = 2, expected = x / y;
        long actual = (long) calc.divide(x, y);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void squareTest(){
        Calculator calc = new Calculator();
        int x = 5;
        int expected = 25;
        int actual = calc.square(x);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void squareRootTest(){
        Calculator calc = new Calculator();
        double x = 25;
        long expected = 5;
        long actual = (long) calc.squareRoot(x);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exponentsTest(){
        Calculator calc = new Calculator();
        int x = 5, y = 3;
        long expected = 125;
        long actual = (long) calc.exponents(x, y);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sineMethodTest(){
        Calculator calc = new Calculator();
        double x = 10;
        long expected = (long) Math.sin(x);
        long actual = (long) calc.sineMethod(x);
        Assert.assertEquals(expected, actual);
    }
}
