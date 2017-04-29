package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int temp;
        for (int i = 1; i <array.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        
        
        int temp = 0;
        
        for(int i=0; i <array.length; i++){
                for(int j=1; j < (array.length-i); j++){
                       
                        if(array[j-1] > array[j]){
                                //swap the elements!
                                temp = array[j-1];
                                array[j-1] = array[j];
                                array[j] = temp;
                        }
                }
        }
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    

    public int [] quickSort(int [] array, int low, int high){
        int [] list = array;
        //implement here
        int i = low, j = high;
        int temp;
        int pivot = array[(low + high) / 2];
 
        /** partition **/
        while (i <= j) 
        {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j) 
            {
                /** swap **/
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
 
                i++;
                j--;
            }
        }
        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        int inner, outer;
        int temp;
     
        int h = 1;
        while (h <= list.length / 3) {
          h = h * 3 + 1;
        }
        while (h > 0) {
          for (outer = h; outer < list.length; outer++) {
            temp = list[outer];
            inner = outer;
     
            while (inner > h - 1 && list[inner - h] >= temp) {
              list[inner] = list[inner - h];
              inner -= h;
            }
            list[inner] = temp;
          }
          h = (h - 1) / 3;
        }
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
