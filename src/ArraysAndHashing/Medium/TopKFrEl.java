package ArraysAndHashing.Medium;

import java.util.HashMap;
import java.util.Map;

public class TopKFrEl {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums) {
            map.merge(n, 1, Integer::sum);
        }


        return map.keySet().stream()
                .sorted((a, b) -> Integer.compare(map.get(b), map.get(a)))
                .limit(k)
                .mapToInt(Integer::intValue)
                .toArray();

    }
}
