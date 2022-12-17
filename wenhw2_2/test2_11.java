import java.util.Scanner;

public class test2_11 {
    public static void main(String[] args) {
        int scoreA[][];
        int scoreB[][];
        int j = 1;
        int k = 1;

        // two array
        scoreA = new int[6][6];
        scoreB = new int[6][6];
        Scanner scanner = new Scanner(System.in);
        // input(2,1) turn to (1,2)
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        // 000000
        // 010000
        // 000000
        // 000000
        // 000000
        // 000000
        scoreA[y + 1][x + 1] = 1;
        show(scoreA);

        // i = 5 6 7 8 run
        for (int i = 5; i < 9; i++) {
            if (ifFull(scoreB) == true) {
                break;
            }
            // odd
            // 0 0 0 0 0 0
            // 0 1 0 0 0 0
            // 0 0 0 0 0 0
            // 0 0 0 0 0 0
            // 0 0 0 0 0 0
            if (i % 2 == 1) {
                for (j = 1; j < 5; j++) {
                    for (k = 1; k < 5; k++) {
                        // if scoreA[][] =1 scoreB[][] = 1 eight neighbor + 1
                        if (scoreA[j][k] == 1) {
                            scoreB[j][k] = 1;
                            scoreB[j - 1][k - 1] = 1;
                            scoreB[j - 1][k] = 1;
                            scoreB[j][k + 1] = 1;
                            scoreB[j + 1][k - 1] = 1;
                            scoreB[j - 1][k + 1] = 1;
                            scoreB[j][k - 1] = 1;
                            scoreB[j + 1][k] = 1;
                            scoreB[j + 1][k + 1] = 1;
                        }

                    }
                }
                System.out.println("***B***");
                show(scoreB);
            }
            if (i % 2 == 0) {
                for (j = 1; j < 5; j++) {
                    for (k = 1; k < 5; k++) {
                        if (scoreB[j][k] == 1) {
                            scoreA[j][k] = 1;
                            scoreA[j - 1][k - 1] = 1;
                            scoreA[j - 1][k] = 1;
                            scoreA[j][k + 1] = 1;
                            scoreA[j + 1][k - 1] = 1;
                            scoreA[j - 1][k + 1] = 1;
                            scoreA[j][k - 1] = 1;
                            scoreA[j + 1][k] = 1;
                            scoreA[j + 1][k + 1] = 1;
                        }
                    }
                }
                System.out.println("***A***");
                show(scoreA);
            }
        }
        scanner.close();
    }

    // if four corners be one return !
    // 1 0 0 0
    // 0 0 0 0
    // 0 0 0 0
    // 0 0 0 1
    static boolean ifFull(int[][] scoreB) {
        if (scoreB[1][1] == 1 && scoreB[4][4] == 1) {
            return true;

        }
        return false;
    }

    // show array !
    // 0 - 6 X 0 - 6
    static void show(int[][] score) {
        for (int m = 0; m < 6; m++) {
            for (int n = 0; n < 6; n++) {
                System.out.print(score[m][n] + " ");
            }
            System.out.println();
        }
        System.out.println("*************");
    }

}
