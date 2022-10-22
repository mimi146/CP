package patterns;

public class patters {

    public static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {

            for (int col = 1; col <=row; col++) {

                System.out.printf("*" + " ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for (int row = n; row >0 ; row--) {

            for (int col = 1; col <=row; col++) {

                System.out.printf("*" + " ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int row = 1; row <= 2 * n ; row++) {

            int totrow = row > n ? 2 * n - row : row;
            for (int col = 1; col <=totrow; col++) {

                System.out.printf("*" + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
       pattern3(4);
    }
}
