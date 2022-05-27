public class EquilibriumIndex {
    public static int solve(int[] A) {
        int[] prefixsum = new int[A.length];
        int index = Integer.MAX_VALUE;
        prefixsum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefixsum[i] = prefixsum[i - 1] + A[i];   //123456
            // System.out.println(prefixsum[i]);
        }

//        for(int m:prefixsum)
//            System.out.println(m);

        int n = prefixsum.length;
        for (int j = 1; j <= prefixsum.length; j++) {
            int sumofleft = prefixsum[j - 1];
            int rightofsum = prefixsum[n - 1] - prefixsum[j - 1];

            if (sumofleft == rightofsum) {


                return j - 1;
            }

        }

        return -1;                       //tc O(n); sc:O(N)

    }


        public static  int solve1(int[] A) {

            int sum=0;

            for(int i=0;i<A.length;i++)
            {
                sum=sum+A[i];
            }

            System.out.println(sum);
            int sumL=0; int sumR=sum-A[0];

            if(sumL==sumR) return 0;

            for(int j=1;j<A.length;j++)
            {
                sumL=sumL+A[j-1];
                sumR=sumR-A[j];

                if(sumL==sumR) return j;
            }

            return -1;                                   //TC:  O(N); SC:O(1);
        }

    public static void main(String[] args){
        int[] A={5,2,1, 5,2};

        System.out.println(solve1(A));
    }
}
