public class Factorial {
    public static void main(String[] args) {
        int value = 5;

        String finalResult;
        if (value < 0) {
            finalResult = "Value should be >=0";
        } else {
            int result = 1;
            for (int i = 1; i <= value; i++) {
                int oldResult = result;
                result *= i;
                if (oldResult != result / i) {
                    result = 0;
                    break;
                }
            }
            finalResult = result == 0 ? "Int overflow" : String.valueOf(result);
        }

        System.out.println(finalResult);
    }
}
