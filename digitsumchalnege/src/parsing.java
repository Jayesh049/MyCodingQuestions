public class parsing {

            public static void main(String[] args) {
//            String numberAsString = "2018.125";
//            System.out.println("numberAsString= " + numberAsString);
//
//            double number = Double.parseDouble(numberAsString);
//            System.out.println("number = " + number);
//
//            numberAsString += 1;
//            number += 1;
//
//            System.out.println("numberAsString = " + numberAsString);
//            System.out.println("number = " + number);

                System.out.println(canPack(5,0,1));

      }


        public static boolean canPack(int bigCount, int smallCount, int goal){
            if (bigCount < 0 || smallCount < 0 || goal < 0) {
                return false;
            }
            if ((bigCount * 5) + smallCount < goal) {
                return false;
            }

                if (smallCount >= goal) {
                    return true;
        }
        int remainderOfBig = goal % 5;
        return (smallCount >= remainderOfBig);
    }
}


