public class binary_recurssion {

    // recurssion search is risky as it can lead to enless loop
    // break out condition  is must needed
    public static int binarytypesearch(int start, int end,int arr[],int value){
         while(start<=end){
             int middle_value=(start+end)/2; // this is index
             if(arr[middle_value]==value){
                
                 return middle_value;

             }
             if(arr[middle_value]>value){
                return binarytypesearch(start, middle_value-1, arr, value);
            //             end=middle_value-1;
             }else{
                return binarytypesearch(middle_value+1, end, arr, value);
            //             start=middle_value+1;

            }
        }
        return -1;
    
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8};
        int value1=6;
        System.out.println("Index of the value in the array is: "+binarytypesearch(0, arr1.length, arr1, value1));

        
    }
}
