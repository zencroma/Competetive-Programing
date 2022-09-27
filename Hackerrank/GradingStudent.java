import java.util.Scanner;

public class GradingStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = in.nextInt();

            int round = 5 * (grades[i] / 5 + 1);
            if (grades[i] >= 38 && round - grades[i] < 3) {
                grades[i] = round;
            }
        }

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }
}