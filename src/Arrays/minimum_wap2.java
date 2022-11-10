package Arrays;

public class minimum_wap2 {

    public static int minswap(int[] A) {
        int n = A.length;
        int i,swap=0;
        int currentval,supposeVal,locationSupposeVal;
        int[] pos = new int[n+1];
       // pos[0] = -8;
        for(i =0; i<n;i++) {    // storing all the index of input array

            pos[A[i]] =i;
        }
        for(int k:pos) System.out.print(k);

        for(i =0; i<n ;i++) {
            currentval=A[i];
            supposeVal = i;                       //1, 2, 3, 4, 0
            locationSupposeVal = pos[supposeVal];

            if(currentval != supposeVal) {       // comparing current value of input array and index array pos;
                A[i] =supposeVal;
                A[locationSupposeVal] =currentval;

                pos[supposeVal] =i;
                pos[currentval] =locationSupposeVal;

                swap++;
            }

        }
        return swap;
    }

    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 0};
//        int[] pos = new int[a.length+1];
//
//        for(int i=0; i<a.length;i++) {
//
//            pos[a[i]] =i;
//        }
        int pos = minswap(a);
      //  System.out.println(pos);
        //for(int k:pos) System.out.print(k);
    }
}
