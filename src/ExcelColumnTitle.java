public class ExcelColumnTitle {
    public static String convertToTitle(int A) {
        int x = A;
        String no = "";
        int remainder = 0;
        String[] alpha = new String[]{"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        while (x > 26) {
            remainder = x % 26;

            no += alpha[remainder];
            System.out.println(x % 26);
            if (remainder == 0) {
                x = ((x / 26) - 1);
            } else {
                x = x / 26;
            }
        }

        no += alpha[x];
        String ans = "";

        for (int i = no.length() - 1; i > -1; i--) {
            ans += no.substring(i, i + 1);

        }
        return ans;
    }
public static void main(String[] args)
{
  int a=26;
    System.out.println(convertToTitle(a));
}

}
