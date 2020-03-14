public class FindMaximumProblem{
    //METHOD TO GET MAXIMUM INTEGER
    public int getMaximumOfInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber){
        int maxResult = firstNumber;
        if (secondNumber.compareTo(maxResult) > 0) {
            maxResult = secondNumber;
            }
        if (thirdNumber.compareTo(maxResult) > 0) {
            maxResult = thirdNumber;
            }
        return maxResult;
    }

    //METHOD TO GET MAXIMUM FLOAT
    public float getMaximumOfFloat(Float firstNumber, Float secondNumber, Float thirdNumber){
        float maxResult = firstNumber;
        if (secondNumber.compareTo(maxResult) > 0) {
            maxResult = secondNumber;
        }
        if (thirdNumber.compareTo(maxResult) > 0) {
            maxResult = thirdNumber;
        }
        return maxResult;
    }

    //METHOD TO GET MAXIMUM STRING
    public String getMaximumOfString(String firstString, String secondString, String thirdString){
        String maxResult = firstString;
        if (secondString.compareTo(maxResult) > 0) {
            maxResult = secondString;
        }
        if (thirdString.compareTo(maxResult) > 0) {
            maxResult = thirdString;
        }
        return maxResult;
    }

    // MAIN METHOD
    public static void main(String[] args){
        System.out.println("Welcome to Find Maximum Problem");
    }
}