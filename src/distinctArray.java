import java.util.ArrayList;
import java.util.Arrays;

public class distinctArray {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
            int j = 0;
        ans.add(A.get(0));

        for(int i=0;i<A.size();i++)
        {

            if((A.get(i))==(ans.get(j))) {

            }
            else{
                System.out.println(ans.get(j)+"dn"+A.get(i));
                ans.add(A.get(i));
                j++;
            }

        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5000,5000,5000,1,1)) ;

        System.out.println(solve(A));
    }

}
