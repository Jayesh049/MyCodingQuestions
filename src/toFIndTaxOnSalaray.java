import java.util.Scanner;

public class toFIndTaxOnSalaray {

    public static void main(String[] args) {

        System.out.println("enter the salary");

        Scanner scn = new Scanner(System.in);
        int salary = scn.nextInt();
        int taxAmt = 0;

        if (salary <=50000){
            taxAmt=0;
            System.out.println("");
        }
         if (salary >50000 && salary<=60000){
                   taxAmt = (salary-50000)*10/100; //we have to pay tax on  addtional salary(10%)

        }
         if ( salary >60000 && salary <=150000){

            taxAmt = (salary-50000)*20/100;//(20/100=20%)

        }
        if(salary > 150000){

            taxAmt = salary*30/100;
        }
        System.out.println("the tax is "+ taxAmt);

    }
}

