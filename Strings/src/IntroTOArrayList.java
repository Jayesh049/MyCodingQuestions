import java.util.ArrayList;

public class IntroTOArrayList {


    public static void main(String[] args) {
        ArrayList<Integer> list; //declare

        list = new ArrayList<>(); //define

        System.out.println( list.size() + " -> " + list); //0 -> []

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.size() + " -> " + list); //3 -> [10 , 20 , 30]

        list.set(1 , 200);// changes values,does not add a new value
        System.out.println(list.size() + " -> " + list);//3 ->[10 , 200, 30]

        list.add(1 , 2000);//adds a new value is different from set
        System.out.println(list.size() + " -> " + list);// 4 -> [10 , 2000 ,200 ,30]

        int val = list.get(1);
        System.out.println(val); //you will get 2000 (list[1] will not work you have to do list.get(1))
        System.out.println(list.size() + " -> "+ list);// 4 -> [10 ,2000 ,200, 30]

         list.remove(1); //deletes the values at index 1
        System.out.println(list.size() + " -> " + list); //3 -> [10 , 200 ,30]

        for(int i = 0 ;i <list.size() ; i++){
            int val1 = list.get(i);
            System.out.println(val1);
        }

        for(int val4: list){//This also work like forEach function( same works as for loop)
            System.out.println(val4);
        }



    }
}
