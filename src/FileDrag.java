import java.util.Arrays;

public class FileDrag {
    public int[] fileDrag(String[] wallpaper) {
        int[] answer = {wallpaper.length, wallpaper[0].length(), 0, 0};
        for(int i=0; i<wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                answer[0] = Math.min(answer[0], i);
                answer[1] = Math.min(answer[1], wallpaper[i].indexOf("#"));
                answer[2] = Math.max(answer[2], i + 1);
                answer[3] = Math.max(answer[3], wallpaper[i].lastIndexOf("#") + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FileDrag fd = new FileDrag();
        int[] answer = fd.fileDrag(new String[] {"......##.", ".........", ".........", ".........", ".........", ".........", ".##......"});
        System.out.println(Arrays.toString(answer));
    }


}