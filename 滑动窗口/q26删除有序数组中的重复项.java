package code.SlidingWindow;

import org.junit.Test;
/*
这道题做了一下午，错很多次，其中：
1，遍历数组时的终止条件没设置好
2，指针和返回的答案还是分开较好
 */

public class LC26 {
    @Test
    public void test01(){
        int[] nums = new int[]{1,1,1};
        int answer = removeDuplicates(nums);
        System.out.println(answer);
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        if(nums.length == 2) return nums[0] == nums[1] ? 1 : 2;
        int slowerPoint = 1;
        int fasterPoint = 1;
        int length = slowerPoint;
        while (fasterPoint < nums.length - 1){
            while(slowerPoint < nums.length - 1 && nums[slowerPoint] > nums[slowerPoint - 1]) slowerPoint++;
            length = slowerPoint;
            while(fasterPoint < nums.length - 1 && nums[fasterPoint] <= nums[slowerPoint - 1]) fasterPoint++;
            if(nums[fasterPoint] > nums[slowerPoint - 1] ) {
                nums[slowerPoint] = nums[fasterPoint];
                length = slowerPoint + 1;
            }
        }
        return nums[0] == nums[1] ? 1 : length;
    }
}
