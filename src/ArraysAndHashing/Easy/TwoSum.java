package ArraysAndHashing.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] solution(int[] nums, int target) {
        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                System.gc();
                return new int[]{map.get(diff), i};
            }
        }
        return new int[]{0,1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(solution(new int[]{2,7,11,25}, 9)));
    }
}
