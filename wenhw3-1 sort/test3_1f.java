package HW3;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*  swap(a[i] ; a[i+1])
 * arr = [2,3,5,6,7]
 * for (i = 0 .arr.length -1 )
 *  for (j = 0 arr.length - 1-i )
 *    if arr[j] > arr[j+1] 
 *      temp = arr[j] 
 *      arr[j] = arr[j]
 *      arr[j+1] = temp
 *         
 */

//turn ascii 
//String s = "b";
//byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
//System.out.println("ASCII Numeric Value: "+bytes[0]);

public class test3_1f {
    public static void main(String[] args) {
        int array[];

        Scanner scanner = new Scanner(System.in);
        String scn = scanner.nextLine();
        String s = scn;

        // array bytes
        byte[] arr = s.getBytes(StandardCharsets.US_ASCII);
        // int arr2 [] = arr.length;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 轉換
                if (arr[j] > arr[j + 1]) {
                    swap(arr[j], arr[j + 1]);
                    // byte temp = arr[j];
                    // arr[j] = arr[j+1];
                    // arr[j+1] = temp;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            // for (int m = 0 ;m<arr.length;m++) {
            if (arr[k] > 64 && arr[k] < 123) {
                if (arr[k] < 91 || arr[k] > 96) {
                    // arr2[m] = arr[k];
                    System.out.print((char) arr[k]);// 有順序的排列
                }
            }
        }
    }

    // 65～90號為26個大寫英文字母，97～122號為26個小寫英文字母
    static void show(byte[] convertedCharArray) {
        for (int i = 1; i < convertedCharArray.length; i++) {
            System.out.println(convertedCharArray[i]);
        }
    }
    //swap method 
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
