import java.util.ArrayList;
import java.util.Scanner;

public class subset {
    // subset generation using bit masking

    public static ArrayList<ArrayList<Integer>> generate(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        int ArraySize = A.size();
        int subsetNum = (1 << ArraySize);
        for (int submask = 0; submask < subsetNum; submask++) {

            ArrayList<Integer> subset = new ArrayList<>();
            for (int i = 0; i < ArraySize; i++) {
                if ((submask & (1 << i)) != 0) {
                    subset.add(A.get(i));
                }
            }
            subsets.add(subset);

        }
        return subsets;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            A.add(a);
        }
        System.out.println(generate(A));
    }

}
