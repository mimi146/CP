//Reverse integer
//        Problem Description
//
//        You are given an integer N and the task is to reverse the digits of the given integer. Return 0 if the result overflows and does not fit in a 32 bit signed integer
//
//        Look at the example for clarification.
//
//        Problem Constraints
//        N belongs to the Integer limits.

public class ReverseInteger {
  /*  public static int reverse(int A) {
         long rev=0;
         while(A!=0){
            int digit=A%10;
    //System.out.println(digit);
             rev = rev * 10 + digit;
             System.out.println(rev);
             A /= 10;
            System.out.println(A);
         }
    if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
            return (int)rev;
    }
    public static void main(String [] args)
    {
        int a=-1146467285;
        System.out.println(reverse(a));
    }
}

//OR
*/

    public static int reverse(int A) {
        boolean m=false;
        if(A<0)
        {
            m=true;
            A=-A;
            System.out.println(A+"hehe");
        }
        char [] res = String.valueOf(A).toCharArray();


        int n =res.length;

        for(int i=0;i<res.length/2;i++){

            char temp=res[i];
            res[i]=res[n-i-1];
            res[n-i-1]=temp;
        }
        long number = Long.parseLong(new String(res));
        if(number>Integer.MAX_VALUE) return 0;
        if(m) number=-number;
        return (int)number;
    }
    public static void main(String [] args)
    {
        int a=-123;
        System.out.println(reverse(a));
    }
}

