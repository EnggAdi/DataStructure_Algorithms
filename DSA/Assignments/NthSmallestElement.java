import java.util.Scanner;

public class NthSmallestElement {
    public static int findNthSmallest(int[] arr, int N) {
        int length = arr.length;
        if (N <= 0 || N > length) {
            System.out.println("Invalid value of N");
            return -1;
        }

        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            if (i == N - 1) {
                return arr[i];
            }
        }

        System.out.println("Unable to find Nth smallest element");
        return -1;
    }

    public static void main(String[] args) {
        int[] arrNum = {15, 22, 51, 28, 13, 24, 5, 12,10};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        scanner.close();

        int result = findNthSmallest(arrNum, N);
        System.out.println(result);  // Output: Nth smallest element
    }
}

