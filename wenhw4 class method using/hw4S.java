package hw4;

class Q1 {
    // define num
    int num = 10;
    // method for recursive Factorial 
    public  int recursiveFun(int n) {
        if (n <= 0) {
          return 1;
        }
        return  n * recursiveFun(n  - 1);
      }
    //method for gcd
    public  double recursiveFun(int a,int b) {
        double ans;  
        if (b >= a) {
        // 10 > 8 
            return ans = GCD(b, a);
        } else {
            return ans = GCD(a, b);
        } 
    }

    public  int GCD(int n, int m) {
        if (n % m == 0)
            return m;
        else
            return GCD(m, n % m);
    }
    void showN() {
        System.out.println(recursiveFun(10)); 
    }
    void showG() {
        System.out.println(recursiveFun(num,8)); 
    }
}

public class hw4S {
    // define main 
    public static void main(String[] args) { 
        
        Q1 q1 = new Q1(); 
        q1.showN();
        q1.showG();

    }
}
