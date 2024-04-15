import java.util.Scanner;

import java.util.Scanner;

public class aver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시험 과목의 개수 : ");
        int i = sc.nextInt();
        double[] arr = new double[i];
        double score = 0;

        System.out.println("점수를 입력하세요 : ");
        for (int a = 0; a < arr.length; a++) {
            arr[a] = sc.nextDouble();
        }

        double max = maxScore(arr);
        int sum = 0;

        for (int j = 0; j<arr.length; j++){
            double aa = arr[j];
            score = score + (aa/max)*100;
        }
        System.out.println(score/i);


    }

    static double maxScore(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}