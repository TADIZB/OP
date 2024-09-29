import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {32,423,45,342,54,66,67,89,243,667,896};
        int sum = 0;
        double average;
        Arrays.sort(numbers);
        for (int num : numbers) sum+=num;
        average = (double) sum / numbers.length;
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}