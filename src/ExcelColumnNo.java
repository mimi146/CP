import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcelColumnNo {
    public static int titleToNumber(String A) {

        int sum=0;int j=0; int ans=0;
        for(int i=A.length()-1;i>=0;i--)
        {
            sum= (int)Math.pow(26,i);

            ans+=sum*(A.charAt(j)-64);

            j++;
        }
        return ans;
    }
    public static void arrange(ArrayList<Integer> a) {
        String sc="";
        ArrayList<Integer> ans= new ArrayList<Integer>();
        for(int i=0;i<a.size();i++)
        {
            int val=a.get(i);

            ans.add(i,a.get(a.get(i)));
        }
        for(int k:ans) sc+=k+" ";

        System.out.println(sc);
    }

    public static void main(String[] args){
       // String A="D";

        ArrayList<Integer> A = new ArrayList<Integer>( Arrays.asList(2, 1, 3, 0));
       // System.out.println(titleToNumber(A));
        arrange(A);
    }
}
