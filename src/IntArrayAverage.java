import java.util.Arrays;

public class IntArrayAverage {
    public double solution(int[] arr) {

        return Arrays.stream(arr).average().orElse(0);
    }
}
