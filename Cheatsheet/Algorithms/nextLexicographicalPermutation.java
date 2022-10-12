package Algorithms;

public class nextLexicographicalPermutation {
    public static int[] swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return arr;
    }

    public static int[] reverse(int[] arr,int left,int right) {
        while (left<right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }

        return arr;
    }

    public static boolean findNextPermutation(int arr[]) {
        if (arr.length<=1) {
            return false;
        }

        int last = arr.length - 2;

        while(last>=0){
            if (arr[last] < arr[last+1]) {
                break;
            }
            last--;
        }

        if (last<0) {
            return false;
        }

        int nextGreater = arr.length - 1;
        for (int i = arr.length - 1; i >last; i--) {
            if (arr[i]>arr[last]) {
                nextGreater = i;
                break;
            }
        }

        arr = swap(arr, nextGreater,last);
        arr = reverse(arr, last+1,arr.length-1);

        return true;
    }
}
