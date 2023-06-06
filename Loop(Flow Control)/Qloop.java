// //Q.1 Read a set of integers,and then prints the sum of the even and odd integers.
// import java.util.Scanner;
// public class Qloop{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num;
//         int choice;
//         int evensum = 0;
//         int oddsum = 0;
//         do{
//             System.out.print("Enter the  number:  ");
//             num = sc.nextInt();
//             if((num%2) ==0){
//                 evensum += num;
//             }
//             else{
//                 oddsum += num;
//             }
//             System.out.println("Do you want to continue? Press 1 if yes or pres 0 for not ");
//             choice = sc.nextInt();
//         }while(choice == 1);
//         System.out.println("Sum of even numbers: " + evensum);
//         System.out.println("Sum of odds numbers: " + oddsum);     
//     }
// }

// //Q.2 Find the factorial of any number entered by the user
// import java.util.Scanner;
// public class Qloop{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num; // to hold the number
//         int fact = 1; // to hold the factorial
//         System.out.print("Enter the number: ");
//         num = sc.nextInt();
//         for(int i = 1; i<=num; i++){
//             fact*=i; // factorial = factorial * 1
//         }
//         System.out.println("Factorial: "+ fact);
//     }
// }

// // Q.3 Print the multiplication table of a number N, entered by the user.
// import java.util.Scanner;
// public class Qloop{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num;  // jiska table bana hai
//         int multi; // for multiplication table
//         System.out.print("Display the table of : ");
//         num = sc.nextInt();
//         for(int i = 1; i<= 10; i++){ 
//             System.out.println(num + "*" + i + " = " + num*i );
//         }
//         System.out.println("Table succesfully printed! ");        
//     }
// 
//     }


    