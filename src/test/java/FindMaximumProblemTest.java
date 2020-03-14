import org.junit.Assert;
import org.junit.Test;

public class FindMaximumProblemTest {
    FindMaximumProblem findMaximum = new FindMaximumProblem();

    @Test
    public void givenThreeIntegers_WhenMaximumFirstNumber_ThenShouldReturnMaximumNumber() {
        int maximumOfInteger = findMaximum.getMaximumOfInteger(10, 8, 9);
        Assert.assertEquals(10, maximumOfInteger);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumSecondNumber_ThenShouldReturnMaximumNumber() {
        int maximumOfInteger = findMaximum.getMaximumOfInteger(10, 12, 9);
        Assert.assertEquals(12, maximumOfInteger);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumThirdNumber_ThenShouldReturnMaximumNumber() {
        int maximumOfInteger = findMaximum.getMaximumOfInteger(10, 12, 14);
        Assert.assertEquals(14, maximumOfInteger);
    }

    @Test
    public void givenThreeFloat_WhenMaximumFirstNumber_ThenShouldReturnMaximumFloat() {
        Float maximumOfFloat = findMaximum.getMaximumOfFloat(10.2f, 8.6f, 9.7f);
        Assert.assertEquals((Float)10.2f, maximumOfFloat);
    }

    @Test
    public void givenThreeFloat_WhenMaximumSecondNumber_ThenShouldReturnMaximumFloat() {
        Float maximumOfFloat = findMaximum.getMaximumOfFloat(10.2f, 12.6f, 9.7f);
        Assert.assertEquals((Float)12.6f, maximumOfFloat);
    }

    @Test
    public void givenThreeFloat_WhenMaximumThirdNumber_ThenShouldReturnMaximumFloat() {
        Float maximumOfFloat = findMaximum.getMaximumOfFloat(10.2f, 12.6f, 14.7f);
        Assert.assertEquals((Float)14.7f, maximumOfFloat);
    }

    @Test
    public void givenThreeString_WhenMaximumFirstString_ThenShouldReturnMaximumString() {
        String maximumOfString = findMaximum.getMaximumOfString("dog", "cat", "bat");
        Assert.assertEquals("dog", maximumOfString);
    }

    @Test
    public void givenThreeString_WhenMaximumSecondString_ThenShouldReturnMaximumString() {
        String maximumOfString = findMaximum.getMaximumOfString("dog", "mat", "bat");
        Assert.assertEquals("mat", maximumOfString);
    }

    @Test
    public void givenThreeString_WhenMaximumThirdString_ThenShouldReturnMaximumString() {
        String maximumOfString = findMaximum.getMaximumOfString("dog", "cat", "mat");
        Assert.assertEquals("mat", maximumOfString);
    }

    @Test
    public void givenThreeString_WhenCapitalMaximumString_ThenShouldReturnMaximumString() {
        String maximumOfString = findMaximum.getMaximumOfString("DOG", "BAT", "CAT");
        Assert.assertEquals("DOG", maximumOfString);
    }

    @Test
    public void givenThreeNumber_WhenMaximumNumber_ThenShouldReturnMaximumString() {
        String maximumOfString = findMaximum.getMaximumOfString("1", "2", "3");
        Assert.assertEquals("3", maximumOfString);
    }
}