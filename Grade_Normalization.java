import java.util.*;

class GradeNormalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int maxScore = 0;
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        int[] normalized = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            normalized[i] = (scores[i] * 100) / maxScore;
            sum += normalized[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(normalized[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();
        int average = sum / n;
        System.out.println(average);
        sc.close();
    }
}
