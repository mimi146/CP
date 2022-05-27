import java.util.ArrayList;

public class ReverseString {

    public static String solve(String A) {
        String ans = "";
       // ArrayList<String> arr = new ArrayList<String>();
        String word = "";
        char m=' ';
        String[] arr=A.split(" ");

//        for (int i = 0; i < A.length(); i++) {
//           // System.out.println(A.charAt(i));           //"the sky is blue"
//            if (A.charAt(i) ==' ') {
//                if (word.isEmpty()){
//                    System.out.println("here");
//                   }
//                else {arr.add(word);
//                word = "";}
//            } else {
//                word += A.charAt(i);
//            }
//
//        }

        for(int j=arr.length-1;j>=0;j--)
        {
          if(j== arr.length-1 ) {
              ans+=arr[j];
          }
           else{
               ans+=" ";
            ans+=arr[j];
        }
        }


        for (String a : arr) System.out.println(a);
        System.out.println(A.length());

        return ans;
    }

    public static void main(String[] args) {
        String A = "fwbpudnbrozzifml osdt ulc jsx kxorifrhubk ouhsuhf sswz qfho dqmy sn myq igjgip iwfcqq";
        System.out.println(solve(A));
    }

}
