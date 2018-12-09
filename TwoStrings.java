package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoStrings {
    public static void main(String[] args) {
        String s1 = "Roman";
        String s2 = "Shkil";
        Set<Character> a = new HashSet<>();
        Set<Character> b = new HashSet<>();
        for (int i = 0; i < s1.length(); i++){
            a.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++){
            b.add(s2.charAt(i));
        }

        b.retainAll(a);
        if (a.size() > 0){
            System.out.println("YES");
        }else
            System.out.println("NO");

    }
}
