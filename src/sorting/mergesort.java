package sorting;

public class mergesort {
  // public static int[]mA = new int[6];

    // public static void mergeit(int[]a, int l, int m, int r) {
    //     System.out.println(l +" "+ m + " "+ r );
    //     int[] mA = new int[r-l +1];
    //     int ind1 = l;
    //     int ind2 = m+1;
    //     int x =0;
    //     while(ind1 <= m && ind2<=r) {
    //         if(a[ind1] <= a[ind2]) {
    //             mA[x++] = a[ind1++];
    //         }
    //         else {
    //             mA[x++] = a[ind2++];
    //         }
    //     }

    //     while(ind1 <= m) {
    //         mA[x++] = a[ind1++];
    //     }

    //     while(ind2 <= r) {
    //         mA[x++] = a[ind2++];
    //     }
    //    // System.out.println("test");

    //     for(int i =0, j=l;i<mA.length;i++,j++) {

    //         a[j] = mA[i];
    //     }

    // }
    public static int mergeit(int[]a, int l, int m, int r) {  // both the merge solution  works 
        int n1 = m-l+1;
        int n2 = r - m;
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        int inv =0;

        for(int i =0; i<n1; i++) {
            a1[i] = a[l+i];
        }
        for(int i =0; i<n2;i++) {

            a2[i] = a[m + i + 1];
        }

        int i =0,j =0,k=l;
        while(i < n1 && j < n2) {

            if(a1[i]<= a2[j]) {
                a[k] = a1[i];
                i++;k++;
            }
            else {
                a[k] = a2[j];
                j++;k++;
                inv += n1 -i;

            }
        }

        while(i<n1) {
            a[k] =a1[i];
            i++;k++;
        }
        while(j<n2){
            a[k] = a2[j];
            k++;j++;
        }
       return inv;

    }

    public static int sortmerge(int[] a, int l, int r) {

        int inv =0;

        if(l< r) {
          
        //int m = (l + r) /2;
        int m = l +(r - l) /2;

        inv += sortmerge(a, l, m);
        inv += sortmerge(a, m+1, r);
        inv+=  mergeit(a, l, m, r);
        }
        return inv;
    }

    public static void main(String[] args) {

        int[] a = {3,5,6,9,1,2,7,8};

   int x = sortmerge(a,0,a.length-1);
   System.out.println(x);;

    for(int n : a) {
        System.out.println(n);
    }

    }
    
}
