import java.util.ArrayList;

public class backtrackSubset {
   static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> generate(ArrayList A, int index,ArrayList currlist) {
        if(index == A.size()) {
           // ArrayList<Integer> temp = new ArrayList<>(currlist);
             ans.add(0,new ArrayList<>(currlist));
            return ans;
        }

        currlist.add((Integer) A.get(index));
        generate(A,index+1,currlist);
        currlist.remove(currlist.size()-1);
        generate(A,index+1,currlist);

        return ans;

    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> A = new ArrayList<>();
//        System.out.println("enter the size of array:");
//        int n = sc.nextInt();
//        System.out.print("Enter the array elements: ");
//        for(int i =0; i<n; i++) {
//            int a = sc.nextInt();
//            A.add(a);
//        }
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();

        A.add(1); A.add(2); A.add(3);
        System.out.println(generate(A,0,a));
    }
}
