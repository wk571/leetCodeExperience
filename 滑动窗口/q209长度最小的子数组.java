package code.SlidingWindow;

import org.junit.Test;

public class LC209 {
    /*
    感觉滑动窗口的题型非常重要的一点是选择如何调整前后两个指针，能够消去一些无意义的情况
     */

    @Test
    public void test01(){
        int target = 11;
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(minSubArrayLen(target,nums));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int slow = 0;
        int fast = 0;
        int minLength = nums.length + 1;
        int sum = nums[slow];
        while (slow != nums.length - 1){
            if(sum < target) {
                if(fast < nums.length - 1)
                    sum += nums[++fast];
                else break;
            }

            if(sum >= target && fast != slow) {
                minLength = minLength < fast - slow + 1 ? minLength : fast - slow + 1;
                sum -= nums[slow++];
            }
            if(fast == slow && sum >= target) return 1;
        }
        if(minLength > nums.length) return 0;
        return minLength;
    }
}
