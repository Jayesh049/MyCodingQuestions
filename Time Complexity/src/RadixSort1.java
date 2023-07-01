public class RadixSort1 {

    public static void radixSort(int[]arr){
        int max = arr[0];
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }

        }
        int place =1 ;
        while(max/place >0){
            countSort(arr , place);
            place = place *10;
        }
    }

    public static void countSort(int[]arr , int exp){
        int[]farr = new int[10];
        int[]ans = new int[arr.length];

        //collecting the frequencies
        for(int i = 0 ; i<arr.length ;i++){
            int val = arr[i] /exp %10;
            farr[val]++;
        }

        //convert freq to psa
        for(int i = 1 ;i<farr.length;i++){
            farr[i] += farr[i-1];
        }

        ///fill the answer
        for(int i = arr.length-1; i>=0;i--){
            int val = arr[i] / exp %10;
            int pos = farr[val];
            ans[pos-1] =arr[i];
            farr[val]--;
        }

        //fill the original array
        for(int i = 0 ; i<ans.length ; i++){
            arr[i] = ans[i];
        }
    }
}
