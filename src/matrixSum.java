import java.util.Scanner;
//Given a array find the sum between two point
// INPUT: A =[1,2,3,4,5], l = 2, R = 4;
// OUTPUT: 9 ; i,e 2+3+4 =9;
public class matrixSum {  // summation in arrays using prefix sum;
    static int N= 100000+10;
    static int findArSum(int[] A , int n, int l, int r) {
        int[] prefix = new int[N];
        for (int i = 1;i <=n; ++i){
            prefix[i] = prefix[i-1] + A[i];
        }
//        for(int b : prefix) {
//            System.out.println(b);
//        }

        return prefix[r]-prefix[l-1];
    }
    // tc complexity optimize to O(N) from O(N^2);


    public static void main(String[] args) {
       System.out.print("enter the size of array");
       // System.out.println(N);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[N];
        for (int i = 1; i<=n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("enter L and R");
        int L = sc.nextInt();
        int R = sc.nextInt();
        System.out.println(findArSum(A,n,L,R));
    }
}
