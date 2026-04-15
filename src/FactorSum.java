import java.util.HashSet;
import java.util.Set;

public class FactorSum {

    public int solution(int n) {
        Set<Integer> factors = new HashSet<>();
        int count = 0;
        for (int i=1; i<=n; i++) {
            count++;
            int divValue = n / i;
            if (factors.contains(divValue)) {
                break;
            } else if (n % i == 0) {
                factors.add(i);
                factors.add(divValue);
            }
        }
        return factors.stream().mapToInt(Integer::intValue).sum();
    }
}
