class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 1;
        int longest = 0;
        int[] hashTable = new int[95];
        hashTable[(int)chars[start] - 32] = start + 1;
        for(;end < chars.length; end ++){
            if(hashTable[(int)chars[end] - 32] != 0){
                start = start < hashTable[(int)chars[end] - 32] ?
                        hashTable[(int)chars[end] - 32]: start;
            }
            hashTable[(int)chars[end] - 32] = end + 1;
            longest = longest > (end - start + 1) ? longest : (end - start + 1);
        }
        return longest;
    }
}
/*
使用哈希表可减少查询与计算时间
错误：
1，双指针式要考虑清楚指针是单向移动的还是双向移动的
2，在有end得到新的位置时要记得更新
*/
