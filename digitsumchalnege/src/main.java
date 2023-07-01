public class main{

    public static void main(String[] args) {
        System.out.println(sumDigits(15456468));
    }
        private static int sumDigits(int number) {

    if(number < 10) {
        return -1;
    }

    int sum = 0; //<----------------------------------------------- initialization

    // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
    while (number >0) {  //<----------------------------------------condition
        // extract the least-significant digit(according to  question)
        int digit = number % 10; //<----------------------------------formula
        sum += digit;//<---------------------------------------------increment

        // drop the least-significant digit(according to question and hont part
        number /= 10;   // same as number = number / 10;
    }

    return sum;
}
}

