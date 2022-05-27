public class RecursionFastPower {

    public static int fastpower(int n, int p){

        if(p==0) return 1;
        //if(p==1) return n;

        int x= fastpower(n,p/2);
        System.out.println(x);

        if(p%2==0){

            return x * x;
        }
        else{
            return x * x * n;
        }


    }

    public static void main(String[] args){

        int x=fastpower(2,5);

        System.out.println(x);
    }
}
