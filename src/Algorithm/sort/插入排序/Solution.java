package Algorithm.sort.插入排序;

public class Solution {
    public int[] sortArray(int[] nums){
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            int tmp = nums[i];
            int j;
            for (j = i - 1;  j >= 0 ; j--) {
                if (tmp < nums[j]){
                    nums[j + 1] = nums[j];
                    continue;
                }
                break;
            }
            nums[j+1] = tmp;
        }
        return nums;
    }
}
