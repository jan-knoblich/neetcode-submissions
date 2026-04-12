class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>(); // index, height

        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stack.empty() && stack.peek()[1] > heights[i]) {
                int[] vals = stack.pop();
                maxArea = Math.max(maxArea, (i - vals[0]) * vals[1]);
                start = vals[0];
            }
            stack.push(new int[]{start, heights[i]});
        }
        for (int[] pair : stack) {
            int index = pair[0];
            int height = pair[1];
            maxArea = Math.max(maxArea, height * (heights.length - index));
        }
        return maxArea;
    }
}
