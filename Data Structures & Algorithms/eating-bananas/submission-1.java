class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = maxValue(piles);
        int result = 0;
        while (l <= r) {
            int m = l + ((r - l) / 2);
            int eats = 0;
            for (int p : piles) {
                eats += Math.ceil((double) p / m);
            }
            if (eats > h) {
                l = m + 1;
            } else if (eats <= h) {
                r = m - 1;
                result = m;
            }

        }
        return result;

    }

    public int maxValue(int [] piles) {
        int max = 0;
        for (int p : piles) {
            max = Math.max(max,p);
        }
        return max;
    }
}
