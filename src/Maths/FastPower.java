package Maths;

public class FastPower {
    int ans;
     static int mod = 1000000007;
    public static int F_power(int x, int y) {  // recursive

        if(y==0) return 1;

        if((y & 1) == 0) {
            return F_power( (x*x)%mod, (y >> 1) );
        }
        else {
            return (x * F_power((x*x) %mod, y >> 1));
        }
    }

    public static int F_power1(int x, int y) {
        int ans =1;
        while (y >0) {

            if(y % 2 != 0) {
                ans = ((ans * x) % mod);

            }
                y = y/2;
                x= ((x * x) % mod);

            System.out.println(ans);

        }
        return ans;
    }
    public static void main(String[] args){

        System.out.println(F_power1(2,382719278));
    }
}
