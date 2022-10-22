public class Subaary {


    static void printSubarray(int[]a, int s, int e) {
        System.out.print("{");;
        for(int i =s; i<=e; i++) {
            System.out.print(a[i]);
        }
        System.out.println('}');
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int n = a.length;
        for ( int i =0; i<n; i++) {
           // System.out.print(a[i]);
            for(int j = i; j<n; j++) {
                printSubarray(a,i,j);
            }
        }
    }
}
