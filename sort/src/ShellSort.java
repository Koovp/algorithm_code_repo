/**
 * 希尔排序
 * 基本思想：比较相邻两元素，将值大的交换到右边（从小到大排序，也可从大到小排序）。
 * 给你一个整数数组 nums，请你将该数组升序排列。
 *
 * @author Koovp
 */
public class ShellSort {

    public static void sort(int[] nums) {
        int len = nums.length;
        while (len != 0) {
            len = len / 2;
            for (int i = 0; i < len; i++) {
                for (int j = i + len; j < nums.length; j += len) {
                    int k = j - len;
                    int temp = nums[j];
                    while (k >= 0 && temp < nums[k]) {
                        nums[k + len] = nums[k];
                        k -= len;
                    }
                    nums[k + len] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = SortTestHelper.generateRandomArray(n, 0, 100000);
        ShellSort.sort(arr);
        SortTestHelper.printArray(arr);
    }

}
