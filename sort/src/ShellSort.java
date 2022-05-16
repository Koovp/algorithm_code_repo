/**
 * 希尔排序
 * 基本思想：希尔排序(Shell Sort)是插入排序的一种，它是针对直接插入排序算法的改进。
 *
 * 希尔排序又称缩小增量排序，因 DL.Shell 于 1959 年提出而得名。
 *
 * 它通过比较相距一定间隔的元素来进行，各趟比较所用的距离随着算法的进行而减小，直到只比较相邻元素的最后一趟排序为止。
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
            SortTestHelper.printArray(nums);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = SortTestHelper.generateRandomArray(n, 0, 100000);
        SortTestHelper.printArray(arr);
        ShellSort.sort(arr);
        SortTestHelper.printArray(arr);
    }

}
