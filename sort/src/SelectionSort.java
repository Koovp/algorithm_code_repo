/**
 * 选择排序
 * 基本思想：每一趟从待排序的数据元素中选择最小（或最大）的一个元素作为首元素，直到所有元素排完为止。
 * 给你一个整数数组 nums，请你将该数组升序排列。
 * @author Koovp
 */
public class SelectionSort {

    public static int[] nums = {9,6,4,5,8,7,2,3,1,0};

    public static void main(String[] args) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1 ; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
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
