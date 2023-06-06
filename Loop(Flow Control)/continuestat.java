// to skip an iterator

// import java.util.Scanner;
// public class continuestat{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("N = ");
//         int n = sc.nextInt();
//         for(int i=1 ; i<=n; i++ ){
//             if(i == 3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

// Q. Display all numbers entered  by user except multiple of 10
// import java.util.Scanner;
// public class continuestat{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.print("N = ");
//             int n = sc.nextInt();
//             if((n%10)==0){
//                     continue;
//             }
//             System.out.println(n);
//         }while(true);
//     }
// }

// //Q. check number is prime or not
// import java.util.Scanner;
// public class continuestat{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Number = ");
//         int n = sc.nextInt();
//         if(n == 2){
//             System.out.println("Prime number");            
//         }
//         else{
//             boolean isprime = true;
//             for(int i =2; i<= Math.sqrt(n); i++){
//                 if((n % i)==0){           //composite if i%10 ==0
//                     isprime = false;
//                 }
//             }
//             if(isprime == true){
//                 System.out.println("Prime number");
//             }
//             else{
//                 System.out.println("Not prime number");
//             }
//         }
//     }
// }
