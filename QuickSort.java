import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter array element");
        for(int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        sortArray(array);
        for(int element:array){
            System.out.print(element +" ");
        }
    }

    public static void sortArray(int[] nums) {
        int low = 0,high = nums.length-1;
        QuickSort(nums,low,high);
        //return nums;
    }
    public static void QuickSort(int[] nums,int low,int high) {
        if (low < high) {
            int pivot = partition(nums,low,high);
            QuickSort(nums,low,pivot-1);
            QuickSort(nums,pivot+1,high);
        }
    }

    public static int partition(int[]nums,int low,int high) {
        int pivot = nums[low];
        int i = low,j = high;
        while(i < j) {
            while(nums[i] <= pivot && i < j) i++;
            while(nums[j] > pivot) j--;
            if(i < j) swap(nums,i,j);
        }
        swap(nums,low,j);
        return j;
    }

    public static void swap(int[]nums,int low,int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}