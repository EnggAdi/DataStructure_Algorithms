import java.util.Arrays;

public class insertionsorting {
    
    // Sorting methods do not return any value
    public static void insertion(int arr[]){
        for(int index=1;index<=arr.length-1;index++){
            int current= arr[index];
            int j=index-1; //
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j=j-1;

            }
        arr[j+1]=current;    
        }
    }

    public static void main(String[] args) {
        int arr1[]={20,10,30,5,7};
        insertion(arr1);
        //System.out.println(Arrays.toString(arr1));
        for(int i=0;i<=arr1.length-1;i++){
            System.out.print(arr1[i]+",");
        }
        
    }
}
