package ArraysAndHashing.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer>, List<String>> map = new HashMap<>();
        for (String str: strs) {
            Map<Character, Integer> currentString = countSymbols(str);
            if (map.containsKey(currentString)) {
                map.get(currentString).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(currentString,list);
            }
        }
        return new ArrayList<>(map.values());
    }

    private Map<Character, Integer> countSymbols(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) ,map.get(s.charAt(i)) + 1) ;
            } else {
                map.put(s.charAt(i),0);
            }
        }
        return map;
    }
}
