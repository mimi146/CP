import java.util.HashMap;
import java.util.Scanner;

public class subarray {

    public static int solve(int[] A) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum=0; int ans=0;
         map.put(0,-1);

        for(int i=0;i<A.length;i++) {
            if(A[i]==1) sum++;
            else sum--;
            if(map.containsKey(sum)){
                int temp=i-map.get(sum);
                System.out.println(map.containsKey(sum));
                ans=Math.max(ans,temp);
            }
            else{
               map.put(sum,i);
            }
        }
    return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int length=sc.nextInt();
        int[] A=  new int[length];
        System.out.println("enter the array element");

        for(int i=0;i<length;i++){
            A[i]=sc.nextInt();
        }

        //int[] A={ 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0};
       // int[] A={1,1,0,0,1};
        System.out.println(solve(A));   }
}
