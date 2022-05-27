import java.util.*;

public class RecursionSubset {
    public static void
    findSubsets(List<List<Integer>> subset, ArrayList<Integer> nums, ArrayList<Integer> temp1, int index)
    {
        // Base Condition
        if (index == nums.size()) {
            subset.add(temp1);
            return;
        }

        // Not Including Value which is at Index
        findSubsets(subset, nums, new ArrayList<>(temp1), index + 1);

        // Including Value which is at Index
        temp1.add(nums.get(index));
        findSubsets(subset, nums, new ArrayList<>(temp1), index + 1);
    }

    public static void main(String[] args) {

        //Main List for storing all subsets
        List<List<Integer>> subset = new ArrayList<>();

        // Input ArrayList
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> temp1 = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
            ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
       findSubsets(subset, input, new ArrayList<>(), 0);

        System.out.println(subset);
        }
    }


