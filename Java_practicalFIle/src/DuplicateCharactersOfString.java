public class DuplicateCharactersOfString {
    public static void main(String[] args) {
        String str="PAAWAKBHOOP";
        char[] ch1=str.toLowerCase().toCharArray();
        int i, j, count;
        int len= ch1.length;
        System.out.println("Duplicate characters in "+ str);
        for (i=0; i<len; i++) {
            count =0;
            for (j =i+1; j <len; j++) {
                if (ch1[i] == ch1[j]) {
                    count++;
                }
            }
            if (count ==1)
                System.out.print(ch1[i] +" ");
        }
    }
}


