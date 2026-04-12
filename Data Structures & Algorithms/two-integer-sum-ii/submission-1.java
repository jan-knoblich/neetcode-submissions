class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lft = 0;
        int rght = numbers.length -1;
        while(lft != rght) {
            if (numbers[lft] + numbers[rght] < target) {
                lft++;
            } else if (numbers[lft] + numbers[rght] > target) {
                rght--;
            } else {
                return new int[]{lft + 1,rght + 1};
            }
        }
        return new int[]{0,0};
    }
}
