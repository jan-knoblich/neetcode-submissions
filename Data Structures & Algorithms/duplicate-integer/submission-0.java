class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer, Boolean> exists = new HashMap<Integer, Boolean>();
        for (int i = 0; i < nums.length; i++) {
            if (exists.get(nums[i]) != null)
                return true;
            else 
                exists.put(nums[i], true);
        }
        return false;
    }
}
