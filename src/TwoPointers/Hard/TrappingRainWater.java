package TwoPointers.Hard;

import java.util.Arrays;

public class TrappingRainWater {

    // First solution to many memory
    static int solution(int[] height) {
        int commonWater = 0;
        int[][] layers = divideToLayers(height);
        for (int[] layer : layers ) {
            if (countLayerWater(layer) < 0){
                break;
            }
            commonWater += countLayerWater(layer);
        }
        return commonWater;
    }

    static int countLayerWater(int[] layer) {
        int left = 0;
        int right = layer.length - 1;
        int layerWatter = 0;
        System.out.println(Arrays.toString(layer));
        while (layer[left] != 1 || layer[right] != 1) {
            if (layer[left] == 0) {
                left++;
            }
            if (layer[right] == 0) {
                right--;
            }
        }
        if (right == left) return -1;

        for (int i = left; i <= right; i++) {
            if (layer[i] == 0) {
                layerWatter++;
            }
        }

        return layerWatter;
    }

    static int[][] divideToLayers(int[] height) {
        int max = Arrays.stream(height).max().getAsInt();
        int[][] layers = new int[max][height.length];
        for (int i = 0; i < layers.length; i++) {
            for (int j = 0; j < height.length; j++) {
                if (height[j] > i)
                    layers[i][j] = 1;
            }
        }
        return layers;
    }


    // second solution

    static int secondSolution(int [] height) {
        int sum = 0;
        int wall = 0;
        for (int i = 0; i < height.length; i++) {
            if (i > wall) {
                sum += 0;
            }
            if(height[i] > 0) {
                wall = i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {10527,740,9013,1300,29680,4898,13993,15213,18182,24254,3966,24378,11522,9190}));
    }
}
