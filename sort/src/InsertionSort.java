/**
 * 插入排序
 * 基本思想：每一步将一个待排序的数据插入到前面已经排好序的有序序列中，直到插完所有元素为止。
 * 给你一个整数数组 nums，请你将该数组升序排列。
 * @author Koovp
 */
public class InsertionSort {

    public static void sort(int[] nums){

        int temp;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<nums[i-1]){
                temp = nums[i];
                for (int j = i ; j >=0 ; j--) {
                    if (j > 0 && temp < nums[j-1]) {
                        nums[j] = nums[j-1];
                    } else {
                        nums[j] = temp;
                        break;
                    }
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
