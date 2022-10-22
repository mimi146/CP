package Arrays;

import java.util.Scanner;

public class roatematrixs {

    public static int[][] roatematrix(int[][] A) {
        int[][] ans = new int[A.length][A.length];
        int n = ans.length;
        for(int i =0; i<A.length;i++) {

            for(int j =0; j<A.length;j++) {
                ans[j][n-i-1] = A[i][j]; // obserning the pattern A[i][j] = A[j][n-i-1]; after 90 degree roatate
            }
        }


        return ans;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of matrix");
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        for(int i =0; i<n; i++) {

            for(int j =0; j<n; j++) {
                A[i][j] =i+j+1;
                System.out.print(A[i][j]);
            }
            System.out.println();
        }



        int[][] ans = roatematrixs.roatematrix(A);

        System.out.println("printing rotate matrix=--->");
        int m = ans.length;
        for(int i =0; i<m ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j]);

            }
            System.out.println();
        }


    }
}
