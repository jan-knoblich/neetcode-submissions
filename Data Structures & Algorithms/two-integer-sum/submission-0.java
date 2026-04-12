class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> contains = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++){
            Integer n = contains.get(target - nums[i]);
            if (n != null) {
                return new int[]{n, i};
            } else {
                contains.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}
