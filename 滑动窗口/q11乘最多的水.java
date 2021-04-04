class Solution {
    public int maxArea(int[] height) {
        if(height.length < 2) return 0;
        int maxContent = (height.length - 1) * Math.min(height[0],height[height.length - 1]);
        int maxTemp = 0;
        int length = height.length;
        for (int i = 0,j = length - 1;i != j;){
            if(height[i] < height[j]) i ++;
            else j--;
            maxTemp = (j - i) * Math.min(height[i],height[j]);
            maxContent = Math.max(maxContent,maxTemp);
        }
        return maxContent;
    }
}
/*
事实证明基本上每道题都会有时间效率高的解法，
比如这道题我一开始想的就是时间复杂度O(n^2)的暴力破解
但是这道题的确有时间复杂度O(n)的解法
*/
