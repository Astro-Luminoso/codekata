import java.util.Arrays;

public class ArrayAverage {
    public double solution(int[] numbers) {

        return Arrays.stream(numbers).average().getAsDouble();
    }

    public static void main(String[] args) {
        ArrayAverage avg = new ArrayAverage();
        System.out.println(avg.solution(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));;
    }
}
