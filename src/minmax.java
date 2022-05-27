public class minmax {
    public static int solve(int[] A, int[] B, int[] C) {
        int i=A.length-1;
        int j=B.length-1;
        int k=C.length-1;
        int max_diff=0;
        int current_diff=0;
        int min_diff= Math.abs( Math.max(A[i],Math.max(B[j],C[k])) - Math.min(A[i], Math.min(B[j],C[k])));
System.out.println(min_diff);
        while(i!= -1 && j!= -1 && k!= -1)
        {

            //int current_diff = Math.abs( Math.max(A[i],Math.max(B[j],C[k])) - Math.min(A[i], Math.min(B[j],C[k])));
            current_diff = Math.abs(Math.max(A[i], Math.max(B[j], C[k]))
                    - Math.min(A[i], Math.min(B[j], C[k])));

            if(current_diff < min_diff) min_diff=current_diff;

            max_diff= Math.max(A[i],Math.max(B[j],C[k]));

            if(max_diff==A[i]) i--;

            else if(max_diff==B[j]) j--;

            else k--;

        }
        return min_diff;
    }
    public static void main(String[] args)
    {

        int[] A={ 1, 4, 5, 8, 10};
        int[] B={6, 9, 15};
        int[] C={2, 3, 6, 6};

        System.out.println(solve(A,B,C));

    }
}
