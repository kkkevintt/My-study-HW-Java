import java.util.Scanner;
import java.util.Random;
/*自學練習題1 */

public class Test_1 {
    public static void main (String args []) {
        int scn,b,i;
        System.out.println("請輸入數值");
        System.out.println("50抽一次 小於50則不給抽");
        System.out.println("輸入值不為0時會運行");
        Scanner scanner = new Scanner(System.in);
        scn = scanner.nextInt();
        if (scn != 0 ) {
            b = scn / 50;

            if ( b > 0 ) {
                for(i = 0; i < b; i++) {
                    Random random = new Random();
                    int r = random.nextInt(101) ;

                    if (r <= 60) {
                        System.out.println("R");
                    } else if (r < 99 && r > 60) {
                        System.out.println("*SR*");
                    } else {
                        System.out.println("**SSR**");
                        System.out.println("*******恭喜老爺賀喜夫人********");
                    }scanner.close();
                }
            } else if ( b < 1 ) {
                //小於一抽價錢則說你錢不夠
                System.out.println("你錢不夠呀表哥");
                }
            } else if (scn == 0 ) {
            //輸入值等於零不給你跑
            System.out.println("ola ola ola ");
            System.out.println("不給你跑");
        } 
    } 
}
