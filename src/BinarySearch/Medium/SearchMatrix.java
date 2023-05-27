package BinarySearch.Medium;


public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int [] row = findRow(matrix, target);
        if(row.length == 0) {
            return false;
        }

        return checkRow(row,target);
    }

    private boolean checkRow(int[] row, int target) {
        int start = 0;
        int end = row.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (row[mid] == target) {
                return true;
            } else {
                if (row[mid] > target) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
        }

        return false;
    }

    private int[] findRow(int [][] matrix ,int target) {
        int start = 0;
        int end = matrix.length - 1;
        int last = matrix[0].length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(matrix[mid][0] <= target && matrix[mid][last] >= target) {
                return matrix[mid];
            } else {
                if (matrix[mid][0] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        SearchMatrix searchMatrix = new SearchMatrix();
        System.out.println(searchMatrix.searchMatrix(new int[][]{
                {1,3,5,7},{10,11,16,20},{23,30,34,60}
        }, 23));

    }
}
