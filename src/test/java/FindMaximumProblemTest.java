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
}
