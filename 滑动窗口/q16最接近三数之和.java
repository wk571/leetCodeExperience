class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sumTemp = nums[0] + nums[1] + nums[2];
        int sum = sumTemp;
        int minDiff = Math.abs(sumTemp - target);
        for(int i = 0;i < nums.length - 2;i ++){
            //if(nums[i] > target) break;
            int L = i + 1, R = nums.length - 1;
            while(L != R){
                sumTemp = nums[i] + nums[L] + nums[R];
                if(minDiff > Math.abs(sumTemp - target)){
                    minDiff = Math.abs(sumTemp - target);
                    sum = sumTemp;
                }
                if(sumTemp > target) R--;
                else L++;
            }
        }
        return sum;
    }
}
