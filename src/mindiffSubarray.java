import java.util.Arrays;

public class mindiffSubarray {
    public static int solve(int[] A) {
        int minimum=Integer.MAX_VALUE;; int min=0;
        Arrays.sort(A);
        int n=A.length-1;
        int i=0;

        //for(int a:A) System.out.println(a);
        while(n>0)
        {


            min= (A[i]-A[i+1]);;
           min= Math.abs(min);
            minimum=Math.min(min,minimum);
            n--;
            i++;
        }
        // System.out.println(minimum);
        return minimum;
    }
    public static void main(String[] args) {

        int[] A={65, 38, 20, -58, 32, 75, -50, -80, -88, 82};
        System.out.println(solve(A));
    }
}
