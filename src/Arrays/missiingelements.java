package Arrays;

public class missiingelements {



    public static void main(String[] args) {
        int[] A = {1,2,1,1,4,6};

        int[] find = new int[A.length+1];

        for(int i:A) {
           // System.out.println(i);;
            find[i] =1;
        }

        for (int i = 1; i < find.length; i++) {
            System.out.println(find[i]);

            if(find[i] ==0) {
                //System.out.println("the missing no. are" + i);

        }
        }


    }


}
