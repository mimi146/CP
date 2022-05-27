import java.util.ArrayList;

public class paranthesis {
    // String n;
    int c=0;
    static void generate(String str, int open, int close, int A, ArrayList ans) {

        if (close == A && open == A) {
            ans.add(str);
            return;
        }
        //if(open+close==2*A) return;
        if (open < A) {

            str = str + "(";
            System.out.println(str);
            generate(str, open + 1, close, A, ans);
            //System.out.println("c");
            System.out.println("after opeen fun");
            System.out.println("after backtracking");

            str = str.substring(0, str.length() - 1); //backtracking
        }
        if (open > close) {
            if (close < A) {
                str = str + ")";
                System.out.println("added )");
                generate(str, open, close + 1, A, ans);
                System.out.println("after close fun");
                str = str.substring(0, str.length() - 1);//backtracking
                System.out.println("after close backtracking");
            }
        }
    }

    public static ArrayList<String> generateParenthesis(int A) {
        String str = "";
        int open = 0;
        int close = 0;
        ArrayList<String> ans = new ArrayList<String>();
        generate(str, open, close, A, ans);

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(generateParenthesis(3));
    }
}

