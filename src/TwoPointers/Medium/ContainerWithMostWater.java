package TwoPointers.Medium;

public class ContainerWithMostWater {
    public static int firstSolution(int[] height) {
        int left = 0;
        int right = 1;
        int max = 0;

        while (left != height.length - 1) {
            int distance = right - left;
            while (right < height.length) {
                if (height[left] > height[right]) {
                    if (height[right] * distance > max) {
                        max = height[right] * distance;
                    }
                } else {
                    if (height[left] * distance > max) {
                        max = height[left] * distance;
                    }
                }
                right++;
                distance = right - left;
            }
            left++;
            right = left + 1;
        }
        return max;
    }

    public static int secondSolution(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int max = 0;
        while (left < right) {
            int distance = right - left;
            if (height[left] > height[right]) {
                if (height[right] * distance > max) {
                    max = height[right] * distance;
                }
                right --;
            } else {
                if (height[left] * distance > max) {
                    max = height[left] * distance;
                }
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(secondSolution(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(secondSolution(new int[]{1, 2, 1}));
        System.out.println(secondSolution(new int[]{2, 3, 10, 5, 7, 8, 9}));
        System.out.println(secondSolution(new int[]{1, 3, 2, 5, 25, 24, 5}));
        System.out.println(secondSolution(new int[]{1, 1}));

    }
}
