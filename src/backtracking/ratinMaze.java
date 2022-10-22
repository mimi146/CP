package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    static boolean generate(ArrayList<ArrayList<Integer>> A, int N, int x, int y, ArrayList<Integer> temp) {

        if (x == N && y == N) {
            return true;
        }
        if (x < 1 || y < 1 || x > N || y > N) {
            return false;
        }
        if (A.get(x - 1).get(y - 1) == 0) {
            return false;
        }
        temp.add(1);

        if (generate(A, N, x + 1, y, temp) == true) {
            return true;
        }
        temp.remove(temp.size() - 1);

        temp.add(0);
        if (generate(A, N, x, y + 1, temp) == true) {
            return true;
        }
        temp.remove(temp.size() - 1);
        return false;
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> temp = new ArrayList<>();
        int N = A.size();
        generate(A, N, 1, 1, temp);
        System.out.print(temp);

        for (int i = 0; i < N; i++) {
            ArrayList<Integer> test = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                test.add(0);
            }
            ans.add(test);
        }

        int x = 0, y = 0;
        ans.get(x).set(y, 1);
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) == 1) x++;
            else y++;
            ans.get(x).set(y, 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> tem1 = new ArrayList<>(Arrays.asList(1, 1, 1));
        A.add(tem1);
        ArrayList<Integer> tem2 = new ArrayList<>(Arrays.asList(0, 0, 1));
        A.add(tem2);
        //   System.out.println(A);
        //solve(A);
        System.out.println(solve(A));


    }

}
