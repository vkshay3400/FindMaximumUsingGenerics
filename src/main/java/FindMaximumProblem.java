public class FindMaximumProblem{
    //METHOD TO GET MAXIMUM INTEGER
    public <T extends Comparable<T>> T getMaximum (T firstNumber, T secondNumber, T thirdNumber){
        T maxResult = firstNumber;
        if (secondNumber.compareTo(maxResult) > 0) {
            maxResult = secondNumber;
        }
        if (thirdNumber.compareTo(maxResult) > 0) {
            maxResult = thirdNumber;
        }
        return maxResult;
    }

    // MAIN METHOD
    public static void main(String[] args){
        System.out.println("Welcome to Find Maximum Problem");
    }
}