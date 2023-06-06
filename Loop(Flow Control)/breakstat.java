//break

//Q. break the loop at when price is 5
// import java.util.*;
// public class breakstat{
//         public static void main(String[] args){
//             for(int price=1; price<=10; price++){
//                 if(price==5){
//                     break;
//                 }
//                 System.out.println(price);
//             }
//             System.out.println("I am out");
//         }
// }

//Q. Keep entering the numbers till the user enters a multiple of 10

import java.util.Scanner;
public class breakstat{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Number: ");
            int n = sc.nextInt();
            
            if(n%10 ==0){
                break;
            }
            System.out.println(n);
        }while(true);

        System.out.println();
        System.out.println("Multiple of 10");
    }
}