import java.util.*;

public class TermsAndCondition {

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        int[] todayDate = Arrays.stream(today.split("\\.")).mapToInt(Integer::parseInt).toArray();
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyAndTerm = privacies[i].split(" ");
            String[] privacyDate = privacyAndTerm[0].split("\\.");
            int totalDays = (todayDate[0] - Integer.parseInt(privacyDate[0])) * 12 * 28 +
                    (todayDate[1] - Integer.parseInt(privacyDate[1])) * 28 +
                    (todayDate[2] - Integer.parseInt(privacyDate[2]));
            if (totalDays >= termMap.get(privacyAndTerm[1]) * 28) answer.add(i + 1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
