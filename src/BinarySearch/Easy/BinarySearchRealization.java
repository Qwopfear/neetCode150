package BinarySearch.Easy;

public class BinarySearchRealization {

    public static int solution(int [] array, int target) {
        int current = array[array.length / 2];
        int start = 0;
        int end = array.length - 1;
        if (current != target) {
            while (start <= end) {
                int mid = (start + end) / 2;
                current = array[mid];
                if (current > target) {
                    end = mid - 1;
                } else if (current < target){
                    start = mid + 1;
                } else {
                    return mid;
                }
                System.gc();
            }
            return -1;
        } else {
            return array.length / 2;
        }

    }

    public static void main(String[] args) {
        int sol = solution(new int[] {-1,0,5}, 5);
        System.out.println(sol);
    }
}
