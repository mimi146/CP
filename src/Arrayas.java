import java.util.ArrayList;
import java.util.Arrays;

public class Arrayas {
    StringBuilder str = new StringBuilder();
    public static ArrayList<Integer> arrange(ArrayList<Integer> a) {
        String sc="";
        ArrayList<Integer> ans= new ArrayList<Integer>();
        for(int i=0;i<a.size();i++)
        {

            a.set(i,(a.get(i)+(a.get(a.get(i))%a.size())*a.size()));
        }

        for(int j=0;j<a.size();j++)
        {
            a.set(j,a.get(j)/a.size());
        }


        return a;
    }
    public static void main(String[] args){

        ArrayList<Integer> a = new ArrayList<Integer>( Arrays.asList( 4, 0, 2, 1, 3 ));

        System.out.println(arrange(a));
    }
}
