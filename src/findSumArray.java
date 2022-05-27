public class findSumArray {
    public static int solve(int[] A, int B) {
        int sum=0; int b=B;
        b=B%A.length;
for(int k=0;k<b;k++){
    sum+=A[k];
   // System.out.println(sum);
}

       // System.out.println(sum);
        for(int i=0;i<b;i++){
           // sum=A[i]+A[b-1];
            int sum2= sum-A[b-i-1]+A[A.length-i-1];
            sum= Math.max(sum,sum2);
        }

        return sum ;


    }
    public static void main(String[] args){

       int[] arr={3,4,5,6};
        System.out.println(solve(arr,2 ));
    }
}
