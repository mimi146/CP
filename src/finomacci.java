public class finomacci {

                                        //print Fibonacci series using recursion
    public static int fib(int n){

        int a=0;
        int b=1;
        int sum=0;
        for(int i=1;i<n;i++){
           // int temp=a+b;
          sum=a+b;
          a=b;
          b=sum;
        }
        return sum;
    }

    static void fib2(int n,int a, int b){

        if(n==0) return ;
        int c=a+b;

        System.out.println(c);

        fib2(n-1,b,c);

    }

    public static void main(String[]args){

//       int ans= fib(6);
//        System.out.println(ans);

       int a=0; int b=1; int n=5;
        System.out.println(a);
        System.out.println(b);
                fib2(n-2,a,b);
       // System.out.println(ans);
    }
}
