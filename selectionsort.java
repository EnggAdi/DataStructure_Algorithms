public class selectionsort {
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){ // assumed sorted array
            int min_index=i;

            for(int j=i+1;j<arr.length;j++){
                // finding smallest element index in the unsorted array
                if(arr[j]<arr[min_index]){
                    min_index=j;
                    
                }
                        
            }
            int temp= arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;

        }

    }

    public static void main(String[] args) {
        int arr1[]={20,10,30,5,7};
        selection(arr1);
        //System.out.println(Arrays.toString(arr1));
        for(int i=0;i<=arr1.length-1;i++){
            System.out.print(arr1[i]+",");
    }

    
    }}
