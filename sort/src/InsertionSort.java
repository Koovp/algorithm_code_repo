/**
 * 插入排序
 * 基本思想：每一步将一个待排序的数据插入到前面已经排好序的有序序列中，直到插完所有元素为止。
 * 给你一个整数数组 nums，请你将该数组升序排列。
 * @author Koovp
 */
public class InsertionSort {

    public static int[] nums = {9,6,4,5,8,7,2,3,1,0};

    public static void main(String[] args) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0 ; j < i; j++) {
                if (nums[i] < nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
        for (int i : nums){
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
