package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class combinationsum {
   static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    static int sum =0;
   static int index=0;
    static void generate(ArrayList<Integer> A, int B, ArrayList<Integer> curr, int index) {
        if (index == A.size() ) {
            if(sum == B) {
                ans.add(new ArrayList<>(curr));
            }
            return;
        }


        curr.add(A.get(index));
        sum = sum + A.get(index);
        generate(A,B,curr,index);

        curr.add(A.get(index));
        sum = sum + A.get(index);
//        sum = sum + A.get(index);
//        curr.remove(curr.size()-1);
        generate(A,B,curr,index);


    }
    public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList A, int B) {
        ArrayList<Integer> curr = new ArrayList<>();
        generate(A,B,curr,0);
            return ans;
    }




    public static void main(String [] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 3, 6, 7));
        int B = 7;
        System.out.println(combinationSum(A,B));
    }
}
