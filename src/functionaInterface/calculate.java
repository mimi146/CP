package functionaInterface;

public class calculate {



    public static void main(String[] args) {
        square ans = (int a) ->   (a*a);   // for single line no need to add return statement;
                                          // lamda expression



        System.out.println(ans.findsquare(4));
    }


}
