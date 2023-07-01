public class main {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(5));
    }




     int number = 4;
    int finishNumber  = 20;

    while (number <= finishNumber){
        number++;
        if(!isEvenNumber(number)){
            continue;
        }
        System.out.println("even number " + number);
    }





    public static boolean isEvenNumber(int number){
        if (number % 2 ==0){
            return true;

        }
        else{
            return false;
        }
    }


}
