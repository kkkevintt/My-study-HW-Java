
import java.util.Scanner;

public class hw2_1 {
    public static void main (String [] args ) {
        int scn ,wen ,ren;
        Scanner scanner = new Scanner (System.in);

        while(true) {
            System.out.println("please enter 0-4");
            System.out.println("0 : break while ,1 : dinner ");
            System.out.println("2 : take a walk ,3 : bathroom  ");
            //0到四 選地方或取消
            scn = scanner.nextInt();

            if (scn == 0 ) {
                System.out.println("the end !! no i say no ");
                break;

            } else if (scn == 1 ) {
                System.out.println("please enter wens mon");
                wen = scanner.nextInt();
                System.out.println("please enter rens mon");
                ren = scanner.nextInt();

                dinner(wen,ren);

            } else if (scn == 2 ) {
                System.out.println("1 = wen ok , 0 = wennie not ok ");
                wen = scanner.nextInt();
                System.out.println("1 = ren ok , 0 = ren not ok ");
                ren = scanner.nextInt();

                stroll(wen,ren);//原來這是漫步 好傢伙

            } else {
                System.out.println("1 = wen ok , 0 = wennie not ok ");
                wen = scanner.nextInt();
                System.out.println("1 = ren ok , 0 = ren not ok ");
                ren = scanner.nextInt();

                bathroom(wen,ren);
            } 
            System.out.println();
            System.out.println();
       }
       scanner.close();
    }

    public static void dinner (int wen ,int ren ) {
    //And 為同時擁有 && 
        if ((wen == ren )&&(ren != 0 )) {
            System.out.println("both have money but i believe you bring enough  ");
            System.out.println("lets go fucking dinner ");
        } else {
            System.out.println("可能無法");
        }
    }

    public static void stroll (int wen ,int ren ) {
         if ((wen == 1 ) || (ren == 1 )) {
            System.out.println("兩個en其中一個要");
            System.out.println("lets go to walk and 課金");
        } else{
            System.out.println("maybe 大家在睡覺可能要改天");
        }

    }
    public static void bathroom(int wen ,int ren ) {
        if ((wen == 1 ) ^ (ren == 1 ) ) {
            System.out.println("//有一個人上");
            System.out.println("慢慢來");
        } else {
            System.out.println("都不要上阿(原句)");
            System.out.println("世說可以憶起去學校上壓表哥");

        }
    }

}
