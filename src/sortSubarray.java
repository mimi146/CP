import java.util.Arrays;

public class sortSubarray {

    public static int solve(int[] A) {
        int ans=0;
        int[] arr = Arrays.copyOfRange(A, 0, A.length);
        Arrays.sort(arr);
       // for(int val:arr) System.out.println(val);
        int start=0; int end =0; boolean check =true; boolean check2=true;

      //  System.out.println(A[A.length-1]+"irr"+arr[arr.length-1]);
        for(int i=0;i<A.length;i++)
        {
            if(A[i]!=arr[i] && check) {
                System.out.println(i);
                start =i;
                check=false;
            }

               if( A[A.length-1-i]!=arr[arr.length-1-i] && check2)
               {  check2=false;
                   end=A.length-i;
                System.out.println(end);
            }
        }
        return end-start;
    }

    public static void main(String[] args){
        int[] A ={1,2,6,5,7};
        System.out.println(solve(A));
    }
}
