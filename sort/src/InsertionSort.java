/**
 * 插入排序
 * 基本思想：每一步将一个待排序的数据插入到前面已经排好序的有序序列中，直到插完所有元素为止。
 * 给你一个整数数组 nums，请你将该数组升序排列。
 * @author Koovp
 */
public class InsertionSort {

    public static void sort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0 ; j < i; j++) {
                if (nums[i] < nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 20;
        int[] arr = SortTestHelper.generateRandomArray(n, 0, 100000);
        InsertionSort.sort(arr);
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
