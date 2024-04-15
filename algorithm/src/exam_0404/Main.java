package exam_0404;

public class Main {
    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "water", "drink", "ff"};
        solution(cards1, cards2, goal);
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int cardIdx1 = 0;
        int cardIdx2 = 0;

        for (int i = 0; i < goal.length; i++) {
            String target = goal[i];

            if (cardIdx1 < cards1.length && target.equals(cards1[cardIdx1])) {
                cardIdx1++;
            } else if (cardIdx2 < cards2.length && target.equals(cards2[cardIdx2])) {
                cardIdx2++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
