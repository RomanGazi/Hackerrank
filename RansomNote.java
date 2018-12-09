package HashMap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void ransomNote(String [] magazine, String [] note){
        if(magazine.length < note.length){
            System.out.println("No");
            return;
        }
        Map<String, Integer> map = new HashMap<>();
        for(String s : magazine){
            if (!map.containsKey(s)){
                map.put(s,1);
            }else {
                map.put(s,map.get(s) + 1);
            }
        }
        for(String s : note){
            if (map.containsKey(s)){
                map.put(s,map.get(s) - 1);
                if (map.get(s) < 0){
                    System.out.println("No");
                    return;
                }
            }else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    public static void main(String[] args) {
        String [] magazine = {"give","me", "one", "grand", "today", "night"};
        String [] note = {"give","one","grand","today"};
        ransomNote(magazine,note);
    }
}
