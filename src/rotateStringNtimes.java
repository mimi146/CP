public class rotateStringNtimes {

    public static String solve(String A, int B) {

        //if(B==A.length()) return A;

        char[] arr =A.toCharArray();  //best way to rotate string
        int n =arr.length;
        int end =n-1;
        //String rev="";
        int start=0;

        B=B%n;
        while(start<end)
        {
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
        start=0;
        end =B-1;
        while(start<end)
        {
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
        start=B; end=n-1;
        while(start<end)
        {
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }


        StringBuilder rev = new StringBuilder();
        for(char c:arr){
            rev.append(c);
        }
        return rev.toString();
    }
    public static void main(String[] args){
        String A ="scaler";
        int B=6;
        System.out.println(solve(A,B));
    }
}
