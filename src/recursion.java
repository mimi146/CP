import java.util.Scanner;

public class recursion {

    public static int fib(int n) {

        if (n ==1) {
            return 0;
        }
        if (n ==2) {
            return 1;
        }
        //int ans = fib(n - 1);
        int a= fib(n-1);
        int b= fib(n - 2);
         int ans= a+b;
         return ans;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("find the fibonacci of");
//        int n = sc.nextInt();
//        System.out.println("enter n");
//        int n= sc.nextInt();
//        System.out.println("enter p");
//        int p= sc.nextInt();

        System.out.println(fib(5));
        System.out.println("is and");
        //System.out.println(fastpower(2,5));

    }
}
