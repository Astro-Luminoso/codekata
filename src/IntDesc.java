import java.util.Arrays;
import java.util.Collections;

public class IntDesc {

    public long solution(long n) {
        String[] nToString = String.valueOf(n).split("");
        Arrays.sort(nToString, Collections.reverseOrder());
        return Long.parseLong(String.join("", nToString));
    }
}
