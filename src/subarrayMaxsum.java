public class subarrayMaxsum {
   private static int finMaxsum(int[] a, int n) {
       int maxsum = Integer.MIN_VALUE; // initializing with this value will handle if all
       int cursum =0;                                      // elements are negative or can also be this maxsum = a[i];

       for(int i =0; i<n ; i++) {
           cursum = cursum + a[i];
           if(cursum > maxsum) {
               maxsum = cursum;
           }
           if(cursum < 0) {
               cursum = 0;
           }
       }
       return maxsum;
   }
    public static void main(String[] args) {
// finding maxsub in a subarray using kandane algorithm in tc O(N)
        int[] a = {-6,-2,-3};
        int n =a.length;
        System.out.println(finMaxsum(a,n));
    }
}
