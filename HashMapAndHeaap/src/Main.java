import java.io.*;
import java.util.*;

public class Main{

    public static class MyPriorityQueue {
        ArrayList<Integer> data;
//mai iss error ki wajah se 2 ghnte barbaad hue toh mai batata hu iss error ko maine kaise theek kiya , how I solved this error
        //Maine My Priority queue banayi thi khud se but
        //maine psvm function me apni arraylist waali priority queue use kari thi jo ki sirf integer values ko allow karta hai as a comparable i.e mypriorityqueue
        //error maine aise theek kiya maine priorityqueue ki default java pq use karaa jo as a pq dekhta hai
public MyPriorityQueue(){
    data = new ArrayList<>();
}
        public MyPriorityQueue(int [] arr){
            data = new ArrayList<>();
            for(int val: arr){
                data.add(val);
            }
            for(int i = data.size()/2 -1 ; i >=0 ;i--){
                downheapify(i);
            }
        }
        public void add(int val) {
            data.add(val);
            upheapify(data.size() - 1);
        }

        void upheapify(int i){
            if(i == 0){
                return;
            }

            int pi = (i - 1) / 2;
            if(data.get(pi) > data.get(i)){
                swap(pi, i);
                upheapify(pi);
            }
        }

        public int remove() {
            if(data.size() == 0){
                System.out.println("Underflow");
                return -1;
            }

            swap(0, data.size() - 1);
            int val = data.remove(data.size() - 1);

            downheapify(0);

            return val;
        }

        void downheapify(int i){
            int mini = i;

            int lci = 2 * i + 1;
            if(lci < data.size() && data.get(lci) < data.get(mini)){
                mini = lci;
            }

            int rci = 2 * i + 2;
            if(rci < data.size() && data.get(rci) < data.get(mini)){
                mini = rci;
            }

            if(mini != i){
                swap(i, mini);
                downheapify(mini);
            }
        }

        public int peek() {
            // write your code here
            if(data.size() == 0){
                System.out.println("Underflow");
                return -1;
            }
            return data.get(0);
        }

        public int size() {
            // write your code here
            return data.size();
        }

        void swap(int i, int j){
            int ith = data.get(i);
            int jth = data.get(j);
            data.set(i, jth);
            data.set(j, ith);
        }
    }
    static class Student implements Comparable<Student>{
        String name;
        int ht;
        int wt;

        Student(String name , int ht , int wt){
            this.name = name;
            this.ht = ht;
            this.wt = wt;
        }

        public String toString(){
            return this.name +"-> "+ this.wt +" , " + this.ht;
        }
        public int compareTo(Student other){
            return this.ht - other.ht;
        }//humne compareTo function ke andar height ke comparison ke hisaab se pq se output maanga hai

    }

    public static void main(String[] args) throws Exception {
        Student[] students= new Student[5];
        students[0] = new Student("A" , 180 , 75);
        students[1] = new Student("B" , 179 , 65);
        students[2] = new Student("C" , 165 , 68);
        students[3] = new Student("D" , 171 , 67);
        students[4] = new Student("E" , 169 , 66);

        PriorityQueue<Student> pq = new PriorityQueue<>();

        for(Student student: students){
            pq.add(student);
        }

        while(pq.size() > 0){
            Student student = pq.peek();
            pq.remove();
            System.out.println(student);
        }
    }
    }

    // we have learned to use comparable {we can  use comparable for comparison of 1 element}

//{Question arises-- what if we want to compare many elements/things at the same point we have to use Comparator
//COmparator

