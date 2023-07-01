public class sumof3and5 {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for(int i=1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if(count == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sum);

    }
}

/*a year ago
13
13 upvotes
Hi Sam,

The point of the "sum" variable is to add up the first 5 numbers that we find that are between 1 and 1000 that are evenly divisible by both 3 and 5. The first 5 numbers that we find that are divisible by both 3 and 5 evenly are 15, 30, 45, 60, and 75. Since we are supposed to add the first 5 numbers together, we create the "sum" variable.



We set "sum" = 0 at the beginning because we haven't found our first number yet. But when we find our first number, which is 15, we add 15 into the "sum" variable.



So, we use sum+=i to throw in the number that works into the sum variable when the conditions are met (i is divisible by both 3 and 5 evenly with no remainder).



Since we know the first 5 numbers are 15, 30, 45, 60 and 75 this is how 'sum+=i' works:



At first: sum=0

(1st number) Find 15 works: sum+=15 ------> sum is now equal to 15 (0+15)

(2nd number) Find 30 works: sum+=30 ------> sum is now equal to 45 (0+15+30)

(3rd number) Find 45 works: sum+=45 ------> sum is now equal to 90 (0+15+30+45)

(4th number) Find 60 works: sum+=60 ------> sum is now equal to 150 (0+15+30+45+60)

(5th number) Find 75 works: sum+=75 ------> sum is now equal to 225 (0+15+30+45+60+75)

(stop the loop here with "break;" since we found our first 5 numbers)

Lastly, we created the "count" variable because we are only supposed to add up the first 5 numbers that work. If we didn't create the "count" variable, we would be adding up a lot more numbers between 1 and 1000 that are evenly divisible by both 3 and 5. So, since we only care about the first 5 numbers between 1 and 1000 that work, we need the "count" variable to keep track of how many numbers we have found so far. We also set the "count" variable equal to 0 since we haven't found any numbers yet. We then use "count++" to increase the value of count every time we find a number. Once we have found 5 numbers, "count" will be equal to 5 and then we use "break" to end the loop since we found our 5 numbers. If we wanted to add up the first 10 numbers that work, we would use: "if (count == 10) { break;}



I hope this helps! Let me know if you're still unsure as to how this all works!