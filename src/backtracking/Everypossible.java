package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Everypossible {
    public static void gen( int N ,int index, int[] ans) {
        if(N == 0) {

            for (int a : ans) {
                System.out.print(a);
            }
            System.out.println("-");
            return;
        }

        ans[index]=1;
        gen(N-1,index+1,ans);

        ans[index]  = 2;
        gen(N-1,index+1,ans);

    }

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2));
       int[] ans = new int[3];

        gen(3,0,ans);

    }

}
