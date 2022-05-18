/**
 * 归并排序
 * 基本思想：使用分治法（Divide and conquer）策略来把一个串行（list）分为两个子串行（sub-lists）。
 *
 * @author Koovp
 */
public class MergeSort {

    public static void sort(int[] nums){
        if (nums.length>1) {
            process(nums, 0, nums.length - 1);
        }
    }

    public static void process(int[] nums,int l,int r){
        if(l>=r){
            return;
        }
        int m = l+((r-l)>>1);
        process(nums,l,m);
        process(nums,m+1,r);
        mergeSort(nums,l,m,r);
    }

    public static void mergeSort(int[] nums,int l,int m,int r){
        int[] help = new int[r-l+1];
        int p1=l;
        int p2=m+1;
        int i=0;
        while(p1<=m&&p2<=r){
            help[i++] = nums[p1]<nums[p2]?nums[p1++]:nums[p2++];
        }
        while(p1<=m){
            help[i++] = nums[p1++];
        }
        while(p2<=r){
            help[i++] = nums[p2++];
        }
        for(int a=0;a<help.length;a++){
            nums[l+a]=help[a];
        }
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int n = 20;
        int[] arr = SortTestHelper.generateRandomArray(n, 0, 100000);
        SortTestHelper.printArray(arr);
        MergeSort.sort(arr);
        SortTestHelper.printArray(arr);
    }
}
