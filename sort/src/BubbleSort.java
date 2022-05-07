/**
 * 冒泡排序
 * 基本思想：比较相邻两元素，将值大的交换到右边（从小到大排序，也可从大到小排序）。
 * 给你一个整数数组 nums，请你将该数组升序排列。
 *
 * @author Koovp
 */
public class BubbleSort {

    public static void sort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
            for (Integer integer : nums) {
                System.out.print(integer);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 20;
        int[] arr = SortTestHelper.generateRandomArray(n, 0, 100000);
        for (Integer integer : arr) {
            System.out.print(integer);
            System.out.print(' ');
        }
        System.out.println();
        BubbleSort.sort(arr);
        for (Integer integer : arr) {
            System.out.print(integer);
            System.out.print(' ');
        }

    }

    public static void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
