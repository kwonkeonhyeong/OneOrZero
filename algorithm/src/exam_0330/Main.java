package exam_0330;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = new int[28];
        int[] answer = new int[2];

        for (int i = 0; i < 28; i++) {
            input[i] = scanner.nextInt();
        }

        Arrays.sort(input);

        int inputIndex = 0;
        int answerIndex = 0;

        for (int i = 0; i < 30; i++) {
            if(input[inputIndex] == i+1) {
                inputIndex++;
                continue;
            }
            answer[answerIndex++] = i+1;
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
