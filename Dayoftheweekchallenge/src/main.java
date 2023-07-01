public class main {


    public static void main(String[] args) {

        DayOfTheWeekChallenge(1);
    }
        public static void DayOfTheWeekChallenge ( int day ){

            day = '1'; //as i have already mention this so we dont have to mention the datatype in this variable
            switch (day) {
                case '1':
                    System.out.println("Sunday");
                    break;
                case '2':
                    System.out.println("monday");
                    break;
                case '3':
                    System.out.println("tuesday");
                    break;
                case '4':
                    System.out.println("wednesday");
                    break;
                case '5':
                    System.out.println("thursday");
                    break;
                case '6':
                    System.out.println("friday");
                    break;
                case '7':
                    System.out.println("saturday");
                    break;
                default:
                    System.out.println("invalid value");
                    break;



//                private static void printDayOfTheWeek(int day) {
//
//                    if(day == 0) {
//                        System.out.println("Sunday");
//                    } else if(day == 1) {
//                        System.out.println("Monday");
//                    } else if(day == 2) {
//                        System.out.println("Tuesday");
//                    } else if(day == 3) {
//                        System.out.println("Wednesday");
//                    } else if(day == 4) {
//                        System.out.println("Thursday");
//                    } else if(day == 5) {
//                        System.out.println("Friday");
//                    } else if(day == 6) {
//                        System.out.println("Saturday");
//                    } else {
//                        System.out.println("Invalid day");
//                    }
            }

        }
    }
