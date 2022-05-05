/**
 * 选择排序
 * 基本思想：每一趟从待排序的数据元素中选择最小（或最大）的一个元素作为首元素，直到所有元素排完为止。
 * 给你一个整数数组 nums，请你将该数组升序排列。
 *
 * @author Koovp
 */
public class SelectionSort {

    public static void sort(Integer[] nums) {

        int min;

        for (int i = 0; i < nums.length; i++) {

            min = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }

            if (min != i){
                swap(nums,i,min);
            }
        }
    }

    public static void main(String[] args) {
        int n = 20;
        Integer[] arr = SortTestHelper.generateRandomArray(n, 0, 100000);
        SelectionSort.sort(arr);
        for (Integer integer : arr) {
            System.out.print(integer);
            System.out.print(' ');
        }
    }

    public static void swap(Integer[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
