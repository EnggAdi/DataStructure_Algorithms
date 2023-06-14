public class SortingAnArray {
    public static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap current element with the element at the low pointer
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                // Move to the next element
                mid++;
            } else {
                // Swap current element with the element at the high pointer
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arrNum = {0, 2, 1, 2, 1};
        sortArray(arrNum);

        // Print the sorted array
        for (int num : arrNum) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
