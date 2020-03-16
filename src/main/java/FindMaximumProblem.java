public class FindMaximumProblem <T extends Comparable<T>> {
    //VARIABLES
    T firstValue;
    T secondValue;
    T thirdValue;

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
        return getMaximum(firstValue,secondValue,thirdValue);
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

    // MAIN METHOD
    public static void main(String[] args){
        System.out.println("Welcome to Find Maximum Problem");
    }
}