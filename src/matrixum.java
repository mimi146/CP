public class matrixum {

    public static void summatrix(int[][] A)
    {
        int R= A.length;
        int C =A[0].length;
        int[][] psa = new int[R][C];
      psa[0][0]=A[0][0];

       for(int i=1;i<C;i++){
           psa[0][i]=psa[0][i-1]+A[0][i];
       }

       for(int i=1;i<R;i++)
       {
           psa[i][0]=psa[i-1][0]+A[i][0];
       }
      // System.out.println(psa[0].length);

       for(int i=1;i<R;i++){

           for(int j=1;j<C;j++){

              psa[i][j]=psa[i-1][j]+psa[i][j-1] - psa[i-1][j-1]+A[i][j];

               System.out.println(psa[i][j]);
           }
       }

    }

//2+2-1+1             1 2 3 4 5
//                    2
//                    3
//                    4

    public static void main(String[] args)
    {
        int[][] arr2={ { 1, 1, 1, 1, 1 },
                       { 1, 1, 1, 1, 1 },
                       { 1, 1, 1, 1, 1 },
                     { 1, 1, 1, 1, 1 } };

        summatrix(arr2);
    }
}
