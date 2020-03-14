import org.junit.Assert;
import org.junit.Test;

public class FindMaximumProblemTest {
    FindMaximumProblem findMaximum = new FindMaximumProblem();

    @Test
    public void givenThreeIntegers_WhenMaximumFirstNumber_ThenShouldReturnMaximum() {
            int maximumOfInteger = findMaximum.getMaximumOfInteger(10, 8, 9);
        Assert.assertEquals(10, maximumOfInteger);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumSecondNumber_ThenShouldReturnMaximum() {
        int maximumOfInteger = findMaximum.getMaximumOfInteger(10, 12, 9);
        Assert.assertEquals(12, maximumOfInteger);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumThirdNumber_ThenShouldReturnMaximum() {
        int maximumOfInteger = findMaximum.getMaximumOfInteger(10, 12, 14);
        Assert.assertEquals(14, maximumOfInteger);
    }

    @Test
    public void givenThreeFloat_WhenMaximumFirstNumber_ThenShouldReturnMaximum() {
        Float maximumOfFloat = findMaximum.getMaximumOfFloat(10.2f, 8.6f, 9.7f);
        Assert.assertEquals((Float)10.2f, maximumOfFloat);
    }

    @Test
    public void givenThreeFloat_WhenMaximumSecondNumber_ThenShouldReturnMaximum() {
        Float maximumOfFloat = findMaximum.getMaximumOfFloat(10.2f, 12.6f, 9.7f);
        Assert.assertEquals((Float)12.6f, maximumOfFloat);
    }

    @Test
    public void givenThreeFloat_WhenMaximumThirdNumber_ThenShouldReturnMaximum() {
        Float maximumOfFloat = findMaximum.getMaximumOfFloat(10.2f, 12.6f, 14.7f);
        Assert.assertEquals((Float)14.7f, maximumOfFloat);
    }
}
