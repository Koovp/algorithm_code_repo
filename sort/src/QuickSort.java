/**
 * 快速排序
 * 基本思想：多次比较和交换来实现排序，在一趟排序中把将要排序的数据分成两个独立的部分，对这两部分进行排序使得其中一部分所有数据比另一部分都要小，然后继续递归排序这两部分，最终实现所有数据有序。
 *
 * @author Koovp
 */
public class QuickSort {

    public static void sort(int[] nums){
        if(nums.length>1){
            quickSort(nums,0,nums.length-1);
        }
    }

    private static void quickSort(int[] nums, int l, int r) {
        if(l<r){
            swap(nums, l + (int) (Math.random() * (r - l + 1)), r);
            int[] p = partition(nums,l,r);
            quickSort(nums,l,p[0]-1);
            quickSort(nums,p[1]+1,r);
        }
    }

    public static int[] partition(int[] nums,int l,int r){
        int less = l-1;
        int more = r;
        while(l<more){
            if(nums[l]<nums[r]){
                swap(nums,++less,l++);
            }else if(nums[l]>nums[r]){
                swap(nums,--more,l);
            }else{
                l++;
            }
        }
        swap(nums,more,r);
        return new int[] { less + 1, more };
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int n = 20;
        int[] arr = SortTestHelper.generateRandomArray(n, 0, 100000);
        SortTestHelper.printArray(arr);
        QuickSort.sort(arr);
        SortTestHelper.printArray(arr);
    }
}
