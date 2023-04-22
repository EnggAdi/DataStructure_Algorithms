package PreRead_Assignment;

public class uniqueNumberFreqCount {
            //creating an int array  
            int arr[]={10,20,30,10,5,20};  
        
            //creating array count to store count of an element in the int array arr
            int count[] =new int [arr.length];
    
            int flag = -1;  
            
            for(int i = 0; i < arr.length; i++){  
                // Initialize count_index to 1, since the current element is counted at least once
                int count_index = 1;  
                // Loop through the rest of the array to find duplicates of the current element
                for(int j = i+1; j < arr.length; j++){  
                    if(arr[i] == arr[j]){  
                        // Increment count_index for each duplicate element
                        count_index++;  
                        // To avoid counting same element again, mark the duplicate element as visited
                        count[j] = flag;  
                    }  
                }  
                // If the current element has not been visited, store its frequency count in count[i]
                if(count[i] != flag)  
                    count[i] = count_index;  
            } 
            
            //Displays the frequency of each element present in array  
            for(int i = 0; i < count.length; i++){  
                if(count[i] != flag)  
                    System.out.println("The number " + arr[i] + " is occuring " + count[i] + " times.");  
            }   
        }  
}