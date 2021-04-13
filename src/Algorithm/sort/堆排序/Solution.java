package Algorithm.sort.堆排序;

public class Solution {
    public int[] sortArray(int[] nums){
        int len = nums.length;
        int[] a = new int[len+1];
        for (int i = 1; i < len + 1; i++) {
            a[i] = nums[i-1];
        }
        //下沉建堆
        for (int i = len / 2; i >= 0; i--) {
            sink(a,i,len);

       }
        int k = len;
        //排序
        while (k > 1){
            swap(a,1,k--);
            sink(a,1,k);
        }
        for (int i = 0; i < len; i++) {
            nums[i] = a[i+1];
        }
        return nums;

    }

    private void sink(int[] a, int i, int len) {
        //下沉
        while (2 * i <= len){
            int j = 2 * i;
            if (j + 1<=len && a[j+1] > a[j]){
                j++;
            }
            if (a[j] > a[i]){
                swap(a,i,j);
            }else {
                break;
            }
            i = j;
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
