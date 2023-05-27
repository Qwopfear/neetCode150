package ArraysAndHashing.Easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    static boolean solution(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        char [] charsS = s.toCharArray();
        char [] charsT = t.toCharArray();


        for (int i = 0; i < s.length(); i++) {
            if (mapS.get(charsS[i]) != null) {
                mapS.put(charsS[i], mapS.get(charsS[i]) + 1);
            } else {
                mapS.put(charsS[i], 0);
            }
            if (mapT.get(charsT[i]) != null) {
                mapT.put(charsT[i], mapT.get(charsT[i]) + 1);
            } else {
                mapT.put(charsT[i], 0);
            }
        }
        return mapS.equals(mapT);
    }

    public static void main(String[] args) {
        System.out.println((solution("anagram", "nagaram")));
    }
}
