package Maths.primeNumbers;

public class DivisorCount {

    public static void seive(int[] spt, int max) {

        for(int i =1; i<= max; i++) {
            spt[i] =i;
        }

        for(int i=2; i<=max; i++) {

            if(i > 10000) break;   // to handle over flow for large no.

            for(int j =i*i; j<=max; j +=i) {  // algorithm to get the smallest prime no.

                if(spt[j] == j) {

                    spt[j]=i;
                }


            }
        }
    }
    public static int[] divisorCount(int[] A) {
        int max = Integer.MIN_VALUE;
        for(int i =0; i<A.length; i++ ) {

            max = Math.max(max, A[i]);
        }
        int[] spt = new int[max+1];
        seive(spt,max);
        int[] ans1 = new int[A.length];

//        for(int v:spt) {
//            System.out.println(v);
//        }
        for(int i =0; i<A.length; i++) {

            int temp = A[i];
            int ans =1;
          while(temp != 1) {
              int cnt =1;
              int d = spt[temp];
              while(temp !=1 && temp%d ==0) {
                  cnt++;
                  temp = temp/d;
              }

              ans *= cnt;

          }
          ans1[i] = ans;
        }
        return ans1;
    }

    public static void main(String [] args) {

        int[] A = {10,25,36};
      int[] a =   DivisorCount.divisorCount(A);

      for(int k:a){
          System.out.println(k);
      }
    }
}
