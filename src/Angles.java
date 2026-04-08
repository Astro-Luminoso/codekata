public class Angles {
    public int solution(int angle) {

        return (angle < 90 && angle > 0) ? 1
                : (angle == 90) ? 2
                  : (angle < 180) ? 3
                    : 4;
    }
}
