package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = number / 1000 + (number - (number / 1000) * 1000) / 100 + number % 10 + (number % 100)/10;
        System.out.println(sum);
    }
}
