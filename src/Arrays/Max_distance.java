package Arrays;
//Problem Description
//        Given an array, A of integers of size N. Find the maximum value of j - i such that A[i] <= A[j].
public class Max_distance {
    public static int maximumGap(final int[] A) {
        int N = A.length;
        int[] maxRange = new int[N];
        maxRange[N-1] = A[N-1];
        int ans =0;
        for(int i =1; i<N; i++) {

            maxRange[N-1-i] = Math.max(maxRange[N-1], A[N-1-i]);
        }
        for(int l: maxRange) System.out.print(l);

        int x=0,y=0;
        while(x < N && y < N) {

            if(maxRange[x] >= A[y]) {
                ans = Math.max(ans, x-y);
                x++;
            }
            else{
                y++;
            }
        }

        return ans;
    }
    public static void main(String[] Args){
        int[] A ={6,3, 5, 4, 2,1};

       // System.out.println(maximumGap(A));

        String a = "abcd";
        int n = a.length();
        System.out.println(a.charAt(n-2)-'0');
    }
}
