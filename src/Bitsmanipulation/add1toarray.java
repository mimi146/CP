package Bitsmanipulation;

public class add1toarray {

    public static int[] add1tonum(int[] Arr) {

        int index = Arr.length-1;
        while(index >= 0) {

            if(Arr[index] != 9) {
                Arr[index] = Arr[index] +1;
                return Arr;
            }
            else {
                Arr[index] = 0;
                index--;
            }
        }
        if(index < 0) {
            int[] ans = new int[Arr.length+1];  // as we are concern for 999 case which must return 1000;
            ans[0]=1;                       // so we dont care about other numbers.
            return ans;
        }



       return Arr;
    }


    public static void main(String[] args){

        int[] A = {9,9,9};

        int[] a=  add1tonum(A);

        for(int i :a) System.out.print(i);


    }

}
