package HW3;

public class test3_2S {
    public static void main(String[] args) {
        int scoreA[][];
        int scoreB[][];

        scoreA = new int[11][11];
        scoreB = new int[11][11];
        //preset three value in aarray 
        scoreA[1][1] = 1;
        scoreA[4][4] = 1;
        scoreA[6][6] = 1;

        // four run
        for (int i = 5; i < 9; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j < 10; j++) {
                    for (int k = 1; k < 10; k++) {
                        if (scoreA[j][k] == 1 || scoreA[j][k] == 0) {
                            //judgment criteria 
                            //sum > 5 == 0 
                            //1 < sum < 5 == 1 
                            //1 < sum  == 0 
                            if (eightsums(scoreA, j, k) > 5) {
                                scoreB[j][k] = 0;
                            } else if (eightsums(scoreA, j, k) < 6 && eightsums(scoreA, j, k) > 0) {
                                scoreB[j][k] = 1;
                            } else {
                                scoreB[j][k] = 0;
                            }
                        }
                    }
                }
                System.out.println("***B***");
                show(scoreB);
            }
            if (i % 2 == 0) {
                for (int j = 1; j < 10; j++) {
                    for (int k = 1; k < 10; k++) {
                        if (scoreB[j][k] == 1 || scoreB[j][k] == 0) {
                            if (eightsums(scoreB, j, k) > 5) {
                                scoreA[j][k] = 0;
                            } else if (eightsums(scoreB, j, k) < 6 && eightsums(scoreB, j, k) > 0) {
                                scoreA[j][k] = 1;
                            } else {
                                scoreA[j][k] = 0;
                            }
                        }
                    }
                }
                System.out.println("***A***");
                show(scoreA);
            }

        }

    }
    //eight plus 1 
    static int eightsums(int[][] score2, int j, int k) {
        int z = score2[j - 1][k - 1] + score2[j - 1][k]
                + score2[j][k + 1] + score2[j + 1][k - 1]
                + score2[j - 1][k + 1] + score2[j][k - 1]
                + score2[j + 1][k] + score2[j + 1][k + 1];
        return z;
    }
    //show int in array 
    static void show(int[][] score) {
        for (int m = 1; m < 10; m++) {
            for (int n = 1; n < 10; n++) {
                System.out.print(score[m][n] + " ");
            }
            System.out.println();
        }
        System.out.println("*************");
    }
}
