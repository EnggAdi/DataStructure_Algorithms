package PreRead_Assignment;

import java.util.Arrays;

public class DuplicateElement_deletion {
    public static int removeDuplicateElements(int arr[], int n) {
        int new_length = 0;   
        // checking if the length of the array is 0 or if 1, as in these cases duplicate element is not possible
        if (n == 0 || n == 1) {
            System.out.println("Not a valid length");
        }else{

        int[] temp = new int[n]; // store unique value
        
        boolean[] visited = new boolean[n];// initially visited={false,false,false..n-1}
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                temp[new_length++] = arr[i];

                for (int k = i + 1; k < n; k++) {
                    if (arr[i] == arr[k]) {
                        visited[k] = true; //element already checked as duplicate is marked as visited
                    }
                }
            }
        }
        //System.out.println("The temporary array "+ Arrays.toString(temp));
        for (int i = 0; i <new_length; i++) {
            arr[i] = temp[i];
        }}
        return new_length;
    }

    public static void main(String[] args) {
        int arr[] = {110, 220, 200, 350, 200, 140, 530, 525};
        int new_length1= removeDuplicateElements(arr, arr.length);
        System.out.println("The New array with duplicates removed");
        for (int i = 0; i< new_length1; i++)
            System.out.print(arr[i] + " ");
    }
}       
     

