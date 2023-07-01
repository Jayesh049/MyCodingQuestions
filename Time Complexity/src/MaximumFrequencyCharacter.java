import java.util.Scanner;

public class MaximumFrequencyCharacter {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int[] farr = new int[26];//0 pe a ki freq , 1 pe b ki frequency

        for(int i = 0 ; i<str.length() ; i++){//string ke sabke upar for loop lagaaya
            char ch = str.charAt(i);  //character jo humne daala hai
            int idx = ch-'a';//inddex  = 'c' - 'a'=2 aajaega its an example
            farr[idx]++;//agar character jitne badhdte rahenge utne plus honge array me jaise 3 c to ++ ce 3
        }
        int maxIdx = 0;//index ko 0 initialise karenge
        for(int i =1 ; i<farr.length ; i++){
            if(farr[i] > farr[maxIdx]){// its like an # and * comparison
                maxIdx = i;//maxIdx chhota hua toh index ko # ko lag jaega(mtlb # me value daal denge)
            }
        }
        char mfc = (char)(maxIdx + 'a');//1 se b kaise bnau (mtlb number se character ka formula)
        System.out.println(mfc);
    }
}

/*
    String str = scn.nextLine();

    int[] farr = new int[26];

    for(int i = 0 ; i< str.length ; i++){
    char ch = str.charAt(i);
    int idx = ch - 'a';
    farr[idx]++;
    }

    int maxIdx = 0;
    for(int i = 0 ; i <farr.length ; i++){
    if(farr[i] > farr[maxIdx]){
    [maxIdx] = i;
    }
    }
    char mfc = (char)(maxIdx - 'a');
    System.out.println(mfc);

 }
 }




*/