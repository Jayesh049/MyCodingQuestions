
class lamp{
    boolean isON;

        void turnOn() {
            boolean isOn = false;
            System.out.println("Light on? "+ isOn);
        }

        public static void main(String[] args) {
            lamp led =new lamp();
            led.turnOn();
        }
    }

