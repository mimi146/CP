
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowTechnique {

    public static int  findGreatest( final List<Integer> A ,int start, int end)
    {
        int max=Integer.MIN_VALUE;

        for(int i=start;i<end;i++){
            int temp=A.get(i);
            max=Math.max(temp,max);
        }
        return max;

    }

    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        if(B>A.size()){
            int max=Integer.MIN_VALUE;
            for(int i =0;i<A.size();i++){
                int temp=A.get(i);
                max=Math.max(temp,max);
            }
            ans.add(max);
            return ans;
        }

        if(A.size()==1) {
           ans.add(A.get(0));
           return ans;
        }


        int i=0;
        while(A.get(B+i-2)<A.size())
        {

            int val=findGreatest(A,A.get(i),A.get(B+i-1));
            ans.add(val);
            i++;
        }
        return ans;

    }
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        int B=2;
        System.out.println(slidingMaximum(A,B));
    }
}
