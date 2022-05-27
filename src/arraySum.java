public class arraySum {

    public static int Sumdigit(int[]a, int n, int sum ){

        if(n<=0){
            //sum+=sum+a[a.length-1];
           // System.out.println(sum);
            return 0 ;
        }

        //sum+=a[i];
       // System.out.println(sum);
       return  Sumdigit(a,n-1,sum) + a[n-1];

       //return sum;
    }


    public static void main(String[]args){
        int[] a={1,2,3,4,5,1};
        int sum=0;
        int n= a.length;
      int ans= Sumdigit(a,n,sum);

        System.out.println(ans);
    }
}
