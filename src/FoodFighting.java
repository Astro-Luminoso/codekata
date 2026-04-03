public class FoodFighting {
    public String foodFighting(int[] food) {
        String answer = "0";
        for (int i=food.length-1; i>0; i--) {
            String foodCount = Integer.toString(i).repeat(food[i]/2);
            answer = String.format("%s%s%s", foodCount, answer, foodCount);
        }
        return answer;
    }
}
