package TwoPointers.Medium;

import java.util.Arrays;

public class TwoSumSortedArray {
    public static int[] solution(int[] numbers, int target) {
        int n = numbers.length;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            if (numbers[l] + numbers[r] == target && r != l) {
                return new int []{l,r};
            } else {
                if(numbers[l] + numbers[r] > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return new int[]{0,1};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2,7,11,15}, 9)));
    }
}
