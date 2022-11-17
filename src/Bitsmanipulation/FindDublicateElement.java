package Bitsmanipulation;


//Now XOR of a and b will be :
//        a       = 0 1 1 1		(I have expressed the representation by spaces just for easy understanding)
//        b       = 1 0 1 0
//        XOR= 1 1 0 1
//        i.e we find XOR for each corresponding bits.
//        First lets see the rules for XOR
//        Rule 1 : If both bits are 1 then XOR’ed bit will be 0.
//        Rule 2 : If both bits are 0 then XOR’ed bit will be 0.
//        Rule 3 : If one bit is 0 and one bit is 1 XOR’ed bit will be 1.

public class FindDublicateElement {

    public static int findDublicate(int[] A) {
        int xor = A[0];
        for(int i =1; i<A.length; i++){

            xor = xor ^ A[i];        // xor is done ins bit leve;

        }

        return  xor;
    }


    public static void main(String[] args) {
        int[] A = {1,2,3,1,2,4,4};

        int ans = findDublicate(A);
        System.out.println(ans);


    }
}
