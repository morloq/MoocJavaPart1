public class BinarySearch {
    
    public static boolean search(int[] array, int searchedValue) {
        //SortArray sort = new SortArray(array);
        
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            //check if searchedValue is present at middle
            if (array[middle] == searchedValue) {
                
                return true;
            }
            if(array[middle] < searchedValue)//if value at middle is smaller than searached value, ignore left side
            {
                beginning = middle + 1;
            }
            else//if value at middle is greater than searched value, ignore right half
                end = middle -1;
        }   
        return false;
    }
}