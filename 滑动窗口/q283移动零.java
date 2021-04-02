import java.util.List;

class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i = 0, j = 0;

        for(i = 0;i < length; i++){
            if(nums[i]!= 0){
                nums[j++] = nums[i];
                
            }
        }
        while(j<length){
            nums[j++] = 0;
        }
    }
}
