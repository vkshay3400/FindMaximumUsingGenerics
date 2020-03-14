import org.junit.Assert;
import org.junit.Test;

public class FindMaximumProblemTest {
    FindMaximumProblem findMaximum = new FindMaximumProblem();

    @Test
        public void givenThreeIntegers_whenMaximumFirstNumber_ThenShouldReturnMaximum() {
            int maximumOfInteger = findMaximum.getMaximumOfInteger(10, 8, 9);
        Assert.assertEquals(10, maximumOfInteger);
    }
}
