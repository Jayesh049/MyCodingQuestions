


import java.util.*;

import java.util.Comparator;

public class Comparator3 {
    public static class MyPriorityQueue<T> {
        ArrayList<T> data;
        Comparator cmptr;

        public MyPriorityQueue(){
            data = new ArrayList<>();
            cmptr = null;
        }

        public MyPriorityQueue(Comparator cmptr){
            data = new ArrayList<>();
            this.cmptr = cmptr;
        }
//        public MyPriorityQueue(int [] arr){
//            data = new ArrayList<>();
//            for(int val: arr){
//                data.add(val);
//            }
//            for(int i = data.size()/2 -1 ; i >=0 ;i--){
//                downheapify(i);
//            }
//        }

        public void add(T val) {
            data.add(val);
            upheapify(data.size() - 1);
        }

        void upheapify(int i){
            if(i == 0){
                return;
            }

            int pi = (i - 1) / 2;
            if(isSmaller(i , pi)){
                swap(pi, i);
                upheapify(pi);
            }
        }

        public T remove() {
            if(data.size() == 0){
                System.out.println("Underflow");
                return null;
            }

            swap(0, data.size() - 1);
            T val = data.remove(data.size() - 1);

            downheapify(0);

            return val;
        }

        void downheapify(int i){
            int mini = i;

            int lci = 2 * i + 1;
            if(lci < data.size() && isSmaller(lci , mini ) == true){
                mini = lci;
            }

            int rci = 2 * i + 2;
            if(rci < data.size() && isSmaller(rci , mini) == true){
                mini = rci;
            }

            if(mini != i){
                swap(i, mini);
                downheapify(mini);
            }
        }

        public T peek() {
            // write your code here
            if(data.size() == 0){
                System.out.println("Underflow");
                return null;
            }
            return data.get(0);
        }

        public int size() {
            // write your code here
            return data.size();
        }

        void swap(int i, int j){
            T ith = data.get(i);
            T jth = data.get(j);
            data.set(i, jth);
            data.set(j, ith);
        }
        boolean isSmaller(int i , int j ){
            T ith = data.get(i);
            T jth = data.get(j);

            if(cmptr != null){
                if(cmptr.compare(ith,jth) <0){
                    return true;
                }
                else {
                    return false;
                }
            }else{
                Comparable cith = (Comparable)ith ;
                Comparable cjth = (Comparable)jth;
                if(cith.compareTo(cjth)<0){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
    static class Student implements Comparable<Student> {
        String name;
        int ht;
        int wt;
        int marks;

        Student(String name, int ht, int wt, int marks) {
            this.name = name;
            this.ht = ht;
            this.wt = wt;
            this.marks = marks;
        }

        public String toString() {
            return this.name + "-> " + this.wt + " , " + this.ht + "->" + this.marks;
        }

        public int compareTo(Student other) {
            return this.ht - other.ht;
        }//humne compareTo function ke andar height ke comparison ke hisaab se pq se output maanga hai

    }
    static class StudentWeightComparator implements java.util.Comparator<Student> {
        public int compare(Student s1 , Student s2){
            return s1.wt - s2.wt;
        }
    }


    static class StudentComparableMarks implements java.util.Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.marks - s2.marks;
        }
    }




    public static void main(String[] args) throws Exception {
        Student[] students= new Student[5];
        students[0] = new Student("A" , 180 , 75, 79);
        students[1] = new Student("B" , 179 , 65, 85);
        students[2] = new Student("C" , 165 , 68,95);
        students[3] = new Student("D" , 171 , 67,99);
        students[4] = new Student("E" , 169 , 66,78);

        MyPriorityQueue<Student> pqHt = new MyPriorityQueue<>();
        MyPriorityQueue<Student> pqWt = new MyPriorityQueue<>(new StudentWeightComparator());
MyPriorityQueue<Student> pqMarks = new MyPriorityQueue<>(new StudentComparableMarks());
        for(Student student: students){
            pqHt.add(student);
            pqWt.add(student);
            pqMarks.add(student);
        }

        System.out.println("on the basis of height");
        while(pqHt.size() > 0){
            Student student = pqHt.peek();
            pqHt.remove();
            System.out.println(student);
        }

        System.out.println("on the basis of Weight");
        while(pqWt.size() > 0){
            Student student = pqWt.peek();
            pqWt.remove();
            System.out.println(student);
        }
        System.out.println("on the basis of Marks");
        while(pqMarks.size() > 0){
           Student student = pqMarks.peek();
            pqMarks.remove();
            System.out.println(student);
        }
    }
}


