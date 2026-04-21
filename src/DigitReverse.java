import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitReverse {

    public int[] solution(long n) {
        List<Integer> answer = new ArrayList<>();
        String nums = String.valueOf(n);
        for (int i=nums.length()-1; i>=0; i--) {
            answer.add(Integer.parseInt(String.valueOf(nums.charAt(i))));
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        DigitReverse dr = new DigitReverse();
        int[] result = dr.solution(12345);
        System.out.println(Arrays.toString(result));
    }
}
