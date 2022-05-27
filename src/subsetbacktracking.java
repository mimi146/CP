import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subsetbacktracking {

    public static List<List<Integer>>  generate(List<List<Integer>> subsets, int index, ArrayList<Integer> temp, ArrayList<Integer> test){
        if(index==test.size()){
            subsets.add(temp);
            return subsets;
        }
        generate(subsets,index+1, temp,test);

        temp.add(test.get(index));
       // System.out.println(test);
        generate(subsets,index+1, temp,test);
       temp.remove(temp.size()-1);
       // System.out.println(s);

        return subsets;
    }

    ArrayList<ArrayList<Integer>> subsets= new ArrayList();

    public static void main(String[]args){

        ArrayList<Integer> test = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int index=0;
       List<List<Integer>> subsets = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            test.add(i);
        }

       generate( subsets, index, temp, test);
        System.out.println(subsets);

    }
}
