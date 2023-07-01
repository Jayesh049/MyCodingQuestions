


public  class Person {
    String name;
    int love;

    void propose() {
        if (this.love > 97) {
            System.out.println("Isha loves " + this.name);
        } else {
            System.out.println("Ishika loves " + this.name);
        }

    }



        public static void main(String[] args) {
            // Write your code here
            Person p1;

            p1 = new Person();
            p1.love = 98;
            p1.name = "Jayesh";
            p1.propose();

            Person p2;
            p2 = new Person();
            p2.love =97;
            p2.name = "jAYESH";
            p2.propose();


          Person p3 = p2;
          p3.love = 22;
          p3.name="jamp";
          p3.propose();
          p3.propose();


        }
    }


