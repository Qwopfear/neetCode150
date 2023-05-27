package ArraysAndHashing.Medium;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int current = 1;
        int max = 0;
        for(int i = 0;i < nums.length - 1; i++) {
            if(nums[i + 1] == nums[i] + 1  ) {
                current++;
            } else {
                if (nums[i + 1] == nums[i]) {
                    continue;
                }
                max = Math.max(current,max);
                current = 1;
            }

        }
        return Math.max(max, current);
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{9,1,-3,2,4,8,3,-1,6,-2,-4,7}));
    }
}
