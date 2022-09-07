public class Main {
    public static void main(String[] args) {


            double[] nums = {5, -3, 9, 0, -4, 7, -2, -1, -4, 10, 8, 11, -2, 5, -12};
            double result = 0;

            for (double d : nums) {
                result += d;
            }
            System.out.println("Среднее арифметическое " + result / nums.length);
    }
}


