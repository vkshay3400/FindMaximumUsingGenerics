public class FindMaximumProblem <T extends Comparable<T>> {
    //VARIABLES
    private T firstValue;
    private T secondValue;
    private T thirdValue;
    private T maximumValues;

    //DEFAULT CONSTRUCTOR
    FindMaximumProblem(){
    }

    //PARAMETRISED CONSTRUCTOR
    FindMaximumProblem( T firstValue, T secondValue, T thirdValue ){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    //CALL GET MAXIMUM METHOD
    public T getMaximum() {
        maximumValues = getMaximum(firstValue,secondValue,thirdValue);
        printMaximum(maximumValues);
        return maximumValues;
    }

    //GENERIC METHOD TO GET MAXIMUM
    public T getMaximum (T firstNumber, T secondNumber, T thirdNumber){
        T maxResult = firstNumber;
        if (secondNumber.compareTo(maxResult) > 0) {
            maxResult = secondNumber;
        }
        if (thirdNumber.compareTo(maxResult) > 0) {
            maxResult = thirdNumber;
        }
        return maxResult;
    }

    //PRINT MAX
    public T printMaximum(T maxValue){
        System.out.println("Maximum value: " + maxValue );
        return maxValue;
    }

    // MAIN METHOD
    public static void main(String[] args){
        System.out.println("Welcome to Find Maximum Problem");
    }
}