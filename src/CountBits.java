import java.util.Scanner;

// count the bits (including setbits and unsetbits)
public class CountBits {
    public static int solve(int A) {
        int one = 0;
        for (int i = 1; i <= A; i++) {
            //  int a = arr[i];
            one += i % 2;
            System.out.println(one);
            //a = a / 2;
        }
        return one;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        //System.out.println(a.size());
        System.out.println(solve(a));
    }
}
