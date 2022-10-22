package backtracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class combinationsum {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    static int sum = 0;
    boolean t = false;
    static HashSet<Integer> hs = new HashSet<>();

    static void generate(ArrayList<Integer> A, int B, ArrayList<Integer> curr, int sum, int l) {
        if (sum > B) return;
        if (sum == B) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = l; i < A.size(); i++) {
             if(sum + A.get(i) > B) continue;  // check if sum greater then B
           // if (i > l && A.get(i) == A.get(i - 1)) { // checking for repetition
              //  continue;
            else
                curr.add(A.get(i));
                generate(A, B, curr, sum + A.get(i), i + 1);
                curr.remove(curr.size() - 1);

       }
    }

    public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList A, int B) {
        ArrayList<Integer> curr = new ArrayList<>();
        generate(A, B, curr, 0, 0);
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(18, 10, 6, 11, 1, 16, 8));
        int B = 28;
        Collections.sort(A);
        System.out.println(combinationSum(A, B));
    }
}
