import java.io.*;
import java.util.*;
public class PaintHouseManyColors {



        public static void main(String[] args) throws Exception {
// i th is color
// j th is house
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int c = scn.nextInt();

            int[][]arr = new int[n][c];
            for(int i = 0 ; i < arr.length ; i++){
                for(int j = 0 ; j< arr[0].length; j++){
                    arr[i][j] = scn.nextInt();
                }
            }

            int[][]dp = new int[arr.length][arr[0].length];

            int least = Integer.MAX_VALUE;
            int sleast = Integer.MAX_VALUE;





            for(int j = 0 ; j < arr[0].length ; j++){
//j ke upar mtlb house ke upar loop lagaya, j vary kareega
                dp[0][j] =arr[0][j];
//jo 0th row ke andar jo value padi hui hai
//wo dp ke 0th row me daal denge

//agar array ke 0th row ke andar vary karte hue column ke andar least value padi
                if(arr[0][j] <= least){
                    sleast = least;
                    least = arr[0][j];

                }
                else if(arr[0][j] <= sleast){
                    sleast = arr[0][j];
                }
            }







            for(int i = 1; i < dp.length ; i++){

                int nleast = Integer.MAX_VALUE;
                int nsleast = Integer.MAX_VALUE;
//i ke 1 se start karenge
                for(int j = 0 ; j < dp[0].length ; j++){

                    //hum logo ne house ke upar loop lagaya 0 se matlab starting se
                    if(least == dp[i -1][j]){
                        //agar dp ke piche row[i - 1] ke same column me[j] leastt pade hue hai

                        dp[i][j] = sleast + arr[i][j];
                        //toh jo current dp hai usme hum secondleast ko add karenge

                    }else{//agar pichle row me least nahi hai toh
                        dp[i][j] = least + arr[i][j];
                        //current dp me least add karenge;
                    }






                    //ab hum jiss current dp me hai unke newleast aur newsecondleast nikal lete hai






                    if(dp[i][j] <= nleast){
                        //agar current dp me chota hai newleast se
                        nsleast = nleast;
                        //newsecondleast me newleast daal denge kyunki newleast ki value abhi change hui hai
                        nleast = dp[i][j];

                        //newleast me current dp me jo chota value aayi hai
                        //nleast ke andar current small value daal denge joki dp[i][j] hai

                    }
                    else if(dp[i][j] <= nsleast){
                        //agar dp[i][j] value chhoti hai nsleast se
                        nsleast = dp[i][j];
                        //nsleast me dp[i][j] ki value daal denge;
                    }
                }
                //last me nleast ko least kar denge aur nsleast ko sleast kar denge

                least = nleast ;
                sleast = nsleast;
            }
            System.out.println(least);
        }
    }





