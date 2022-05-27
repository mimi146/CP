import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RotateArrayNtime {

    public static ArrayList<Integer> reverse(ArrayList<Integer> A)
    {

        int start=0; int end=A.size()-1;
        while(start<end)
        {
            int temp=A.get(start);
            A.set(start,A.get(end));
            A.set(end,temp);
            start++;
            end--;
        }
        return A;

    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        ArrayList<ArrayList<Integer>> ans1 = new ArrayList<ArrayList<Integer>>();

        int n =A.size();
        int b=B.size();
        int i=0;

     while(b>0)
     {
         ans=reverse(new ArrayList<>(A));
         B.set(i,B.get(i)%A.size());

          //  System.out.println(B);

           // System.out.println(ans);
            int start=0; int end=ans.size()-B.get(i)-1;

           // System.out.println(end);

            while(start<end)
            {
                int temp=ans.get(start);
                ans.set(start,ans.get(end));
                ans.set(end,temp);
                start++;
                end--;
            }

           // System.out.println(ans);
        end=ans.size()-B.get(0)-1;
            start=end+1; end=ans.size()-1;
            while(start<end)
            {
                int temp=ans.get(start);
                ans.set(start,ans.get(end));
                ans.set(end,temp);
                start++;
                end--;
            }
            System.out.println(ans);
            ans1.add(new ArrayList<>(ans));
            ans.clear();
            b--;
            i++;
       }

        return ans1;
    }



    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<Integer>( Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> B = new ArrayList<Integer>( Arrays.asList(2,3));
        System.out.println(solve(A,B));
    }
}
