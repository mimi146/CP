package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagram {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> index = new ArrayList<>();
        HashMap<Character,Integer> pchar = new HashMap<>();
        HashMap<Character,Integer> schar = new HashMap<>();


        for(int i =0; i<p.length();i++) {


            if(pchar.containsKey(p.charAt(i) ) ) {
                System.out.println(i);
             //  pchar.put(p.charAt(i), pchar.get(p.charAt(i))+1 );      //aab

                pchar.put(p.charAt(i), pchar.get(p.charAt(i)) +1 ) ;
            }
            else {
                pchar.put(p.charAt(i),1 );
            }

        }
        System.out.println(pchar);

        int left =0;
        int plength = p.length();

        for(int right=0; right<s.length();right++) {


            if(pchar.equals(schar)) {
                index.add(left);
            }
                                                                    //"ababababab";
            if( (right-left +1) > plength) {
                char throwchar = s.charAt(left);
                schar.put(throwchar, schar.get(throwchar)-1);
                left++;

            }
            System.out.println(schar);

            if(schar.containsKey(s.charAt(right))) {            //String s ="cbacbabacd";String p ="abc";

                schar.put(s.charAt(right), schar.get(s.charAt(right)) +1 ) ;
            }
            else {
                schar.put(s.charAt(right),1);
            }
            System.out.println(schar);

        }


        return index;

    }

    public  static void main(String[] args) {
        String s = "ababababab";

        String p ="aab";
        List<Integer> t =findAnagrams(s,p);
        System.out.println(t);

    }
}
