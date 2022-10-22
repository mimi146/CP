package backtracking;

public class subsetSumCount {
    static  int count = 0;
    int c = 0;
    static void generate(int[]A,int index, int sum, int K){

      if(index == A.length) {
          if(sum == K) {
              count ++;
          }
              return;
          }

        sum = sum + A[index];
        generate(A,index+1,sum, K);
        sum = sum - A[index];
        generate(A,index+1,sum , K);
    }
    public static int countsum (int[] A,int K) {

        generate(A,0,0, K);
        return count;
    }

    public static void main(String[] args) {
        int K = 7;
        int[] A = {5,2,7};
        System.out.println(countsum(A, K));
    }
}
