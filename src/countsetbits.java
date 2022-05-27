import java.util.Scanner;

public class countsetbits {

    public static int Countbits(int A){
        int bitcount = 0;
        while(A>0){
            bitcount += A % 2;      // 1+
            A = A / 2;           // 2, 1
        }
        return  bitcount;
    }

    public static int Countbits2(int A){      // using bit manipulation technique
        int bitcount =0;
        while(A > 0){
            if((A & 1) == 1) bitcount += 1;

            A = A >> 1;
        }
        return bitcount;

    }

    public static void main(String[] ars){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter digit:");
        int A = sc.nextInt();
        System.out.println(Countbits2(A));
    }
}
