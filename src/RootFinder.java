public class RootFinder {

    public long solution(long n) {
        double sqrtNumber = Math.floor(Math.sqrt(n));
        if (sqrtNumber * sqrtNumber != n) {
            return -1;
        }
        return (long) ((++sqrtNumber) * sqrtNumber);
    }
}
