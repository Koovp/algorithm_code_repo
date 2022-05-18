/**
 * 堆排序
 * 基本思想：
 * 1、将带排序的序列构造成一个大顶堆，根据大顶堆的性质，当前堆的根节点（堆顶）就是序列中最大的元素；
 * 2、将堆顶元素和最后一个元素交换，然后将剩下的节点重新构造成一个大顶堆；
 * 3、重复步骤2，如此反复，从第一次构建大顶堆开始，每一次构建，我们都能获得一个序列的最大值，然后把它放到大顶堆的尾部。最后，就得到一个有序的序列了。
 *
 * @author Koovp
 */
public class HeapSort {

    public static void sort(int[] nums) {
        if (nums.length > 1) {
            for (int i = nums.length - 1; i >= 0; i--) {
                heapify(nums, i, nums.length);
            }
            int heapSize = nums.length;
            swap(nums, 0, --heapSize);
            while (heapSize > 0) {
                heapify(nums, 0, heapSize);
                swap(nums, 0, --heapSize);
            }
        }
    }

    public static void heapify(int[] nums, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && nums[left] < nums[left + 1] ? left + 1 : left;
            largest = nums[index] > nums[largest] ? index : largest;
            if (largest == index) {
                break;
            }
            swap(nums, index, largest);
            index = largest;
            left = index * 2 + 1;
        }
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
        HeapSort.sort(arr);
        SortTestHelper.printArray(arr);
    }
}
