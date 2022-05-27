package backtracking.DP;

public class LLPsubsequnce {

    static int LLPS(String s , int start, int end, int[][] A) {

        if(start == end ) return 1;

        if( start > end) return 0;

        if (A[start][end] == -1) { // if it is not equal to -1 is already calculated
            if(s.charAt(start) == s.charAt(end)) {
                A[start][end] = 2 + LLPS(s,start+1,end-1,A);
            }
            else {
                A[start][end] = Math.max(LLPS(s,start+1,end,A),LLPS(s,start,end-1,A));
                System.out.println(A[start][end]);
            }
        }

        return A[start][end];
    }

    public static void main(String []args) {
        String a = "abcda";
        int[][] A = new int[a.length()][a.length()];

        for(int i =0; i< A.length;i++) {
            for(int j =0; j<A.length;j++){
                A[i][j] = -1;
            }
        }
        //System.out.println(a.charAt(6));

        System.out.println(LLPS(a,0,a.length()-1,A));
    }
}
