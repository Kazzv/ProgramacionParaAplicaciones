public class ConsoleBasedFizzBuzz implements FizzBuzzRefac {

    @Override
    public void printFizzBuzz(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.println(getFizzBuzzValue(i));
        }
    }

    private String getFizzBuzzValue(int number) {
        String result = "";

        if (number % 3 == 0) result += "Fizz";
        if (number % 5 == 0) result += "Buzz";

        return result.isEmpty() ? String.valueOf(number) : result;
    }
}