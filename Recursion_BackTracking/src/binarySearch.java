public class binarySearch {

    public static void main(String[] args) {
         int[] jam = {20 , 35 ,50 ,55,75 ,82 , 85, 90 };

        System.out.println(binarySearch(jam,0,jam.length ,85));
    }

    public static int binarySearch(int arrayOfElements[] , int low , int high , int elementToBeSearched){
        if(low <= high){
            int mid = (low +high) / 2 ;
            if(arrayOfElements[mid] == elementToBeSearched){
                return mid;
            }
            if(arrayOfElements[mid] <elementToBeSearched){
                return binarySearch(arrayOfElements , mid +1 ,high , elementToBeSearched);

            }
            return  binarySearch(arrayOfElements , low , mid -1 ,elementToBeSearched);
        }
        return -1;
    }
}
