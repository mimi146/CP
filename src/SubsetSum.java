import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsetSum {
    //Generate the sum of subset

   public static void addSubset(ArrayList<Integer> A,int n, int index, int sum, ArrayList<Integer> res){

        if(index==n){
            res.add(sum);
            return;
        }

        addSubset(A, n, index+1, sum+A.get(index),res);

        addSubset(A, n, index+1, sum,res);

    }




    public static void main(String[]args){

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            A.add(i);
        }

        addSubset(A, n, 0,0,res);
        //Collections.sort(res);
        System.out.println(res);


    }
}
