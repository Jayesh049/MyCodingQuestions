package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld {


           public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);

                int t = scn.nextInt();
                for(int i =1 ; i<=t; i++){
                    int n = scn.nextInt();

                    boolean isPrime = true ;

                    int div=2;
                    while( div*div <= n) {
                        int r = n % div;

                        if (r == 0) {
                            isPrime = false;
                            break;
                        }

                        div++;
                    }
                    if(isPrime){
                        System.out.println("prime");
                    }
                    else{
                        System.out.println("not prime");
                    }
                }
            }
        }



