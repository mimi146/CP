import java.util.ArrayList;
import java.util.Arrays;

public class subsequence {

    public static int generate(ArrayList<Integer> A,int B, int sum, int index){

        if(sum>1000) return 0;
        if(B==0) {
            //ans++;
            return 1;
        }

       if(index==A.size())  return 0;



        //System.out.println(ans);
    return generate(A,B-1,sum+A.get(index),index+1) + generate(A, B, sum,index+1);
        //return a+b;
    }



    public static void main(String[]args){

        ArrayList<Integer> A= new ArrayList<>(Arrays.asList(1,2,8));
        int sum=0; int count=0; int B=2; int index=0; int ans=0;
       //generate(A,B,sum,index);

        System.out.println( generate(A,B,sum,index));

    }
}
