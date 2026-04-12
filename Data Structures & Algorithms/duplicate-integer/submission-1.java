class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> exists = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (exists.contains(nums[i]))
                return true;
            else 
                exists.add(nums[i]);
        }
        return false;
    }
}
