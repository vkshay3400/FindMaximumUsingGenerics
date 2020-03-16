import org.junit.Assert;
import org.junit.Test;

public class FindMaximumProblemTest {
    Integer maximumOfInteger;
    Float maximumOfFloat;
    String maximumOfString;

    @Test
    public void givenThreeIntegers_ParameterisedConstructor_WhenMaximumFirstNumber_ThenShouldReturnMaximumNumber() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10,8,9);
        maximumOfInteger = (Integer) findMaximum.getMaximum();
        Assert.assertEquals((Integer) 10, maximumOfInteger);
    }

    @Test
    public void givenThreeIntegers_ParameterisedConstructor_WhenMaximumSecondNumber_ThenShouldReturnMaximumNumber() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10, 12, 9);
        maximumOfInteger = (Integer) findMaximum.getMaximum();
        Assert.assertEquals((Integer)12, maximumOfInteger);
    }

    @Test
    public void givenThreeIntegers_ParameterisedConstructor_WhenMaximumThirdNumber_ThenShouldReturnMaximumNumber() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10, 12, 14);
        maximumOfInteger = (Integer) findMaximum.getMaximum();
        Assert.assertEquals((Integer)14, maximumOfInteger);
    }

    @Test
    public void givenThreeFloat_ParameterisedConstructor_WhenMaximumFirstNumber_ThenShouldReturnMaximumFloat() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10.2f, 8.6f, 9.7f);
        maximumOfFloat = (Float) findMaximum.getMaximum();
        Assert.assertEquals((Float)10.2f, maximumOfFloat);
    }

    @Test
    public void givenThreeFloat_ParameterisedConstructor_WhenMaximumSecondNumber_ThenShouldReturnMaximumFloat() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10.2f, 12.6f, 9.7f);
        maximumOfFloat = (Float) findMaximum.getMaximum();
        Assert.assertEquals((Float)12.6f, maximumOfFloat);
    }

    @Test
    public void givenThreeFloat_ParameterisedConstructor_WhenMaximumThirdNumber_ThenShouldReturnMaximumFloat() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10.2f, 12.6f, 14.7f);
        maximumOfFloat = (Float) findMaximum.getMaximum();
        Assert.assertEquals((Float)14.7f, maximumOfFloat);
    }

    @Test
    public void givenThreeString_ParameterisedConstructor_WhenMaximumFirstString_ThenShouldReturnMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("dog", "cat", "bat");
        maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals("dog", maximumOfString);
    }

    @Test
    public void givenThreeString_ParameterisedConstructor_WhenMaximumSecondString_ThenShouldReturnMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("dog", "mat", "bat");
        maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals("mat", maximumOfString);
    }

    @Test
    public void givenThreeString_ParameterisedConstructor_WhenMaximumThirdString_ThenShouldReturnMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("dog", "cat", "mat");
        maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals("mat", maximumOfString);
    }

    @Test
    public void givenThreeString_ParameterisedConstructor_WhenCapitalMaximumString_ThenShouldReturnMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("DOG", "BAT", "CAT");
        maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals("DOG", maximumOfString);
    }

    @Test
    public void givenThreeNumber_ParameterisedConstructor_WhenMaximumNumber_ThenShouldReturnMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("1", "2", "3");
        maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals("3", maximumOfString);
    }

    @Test
    public void givenThreeStringAsCombination_ParameterisedConstructor_WhenGetMaximum_ThenShouldReturnMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("1", "abc", "ABC");
        maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals("abc", maximumOfString);
    }
}