public class StringbuilderIntroduction {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        System.out.println(sb);

        char ch = sb.charAt(0);//get(matlab uss element par kya hai)
        System.out.println(ch);

        sb.setCharAt(0 ,'d');//update(set karne ke liye matlab uss jagah )
        System.out.println(sb);

        sb.insert(2 , 'y');//insert(insert karne  ke liye )
        System.out.println(sb);

        sb.deleteCharAt(3);  //remove(delete karne ke liye)
        System.out.println(sb);


        sb.append('g');//append(insert at last)
        System.out.println(sb);

        System.out.println(sb.length());//length janne ke liye
    }
}
