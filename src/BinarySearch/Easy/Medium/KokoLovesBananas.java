package BinarySearch.Easy.Medium;

import java.util.Arrays;

public class KokoLovesBananas {

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int median = piles[piles.length / 2];
        System.out.println(median);

        return -1;
    }

    public static void main(String[] args) {
        KokoLovesBananas kokoLovesBananas = new KokoLovesBananas();
        kokoLovesBananas.minEatingSpeed(new int[]{30,11,23,4,20}, 6);
    }
}
