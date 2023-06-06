//Syntax
/*
while(condition){
    //do something
}
 */
/* 
//Q.1 Print bye world! 100 times
import java.util.*;
public class whileloop{
    public static void main(String[] args){
        int counter = 0;    // starting
        while(counter<10){
            System.out.println("Bye world");
            counter++; // to increase the value of counter by 1
        }
        System.out.println("Sucessfully printed bye world 100x");

    }

}
*/
/*
// Q.2Print number from 1 to 100
import java.util.*;
public class whileloop{
    public static void main(String[] args){
        int counter = 1; // starting
        while(counter<=100){
            System.out.print(counter + " ");  // " " for space
            counter++;
        }
        
    }

}
*/

 /*
// Q.3 Print number from 1 to n
import java.util.Scanner;
public class whileloop{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Range =  " );
        int Range = sc.nextInt();
        int counter = 1;
        while(counter <= Range){
        System.out.println(counter);
        counter++;
        }
    }
}
 */

// Q.4 Print sum of number from 1 to n
// import java.util.Scanner;
// public class whileloop{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("N = " );
//         int n = sc.nextInt();
//         int i = 1;  //counter, also called as itrator(loop)
//         int sum = 0;
//         while(i<=n){
//             sum += i;
//             i++;
//         }
//         System.out.println("Sum of n numbers = " + sum);
//     }
// }

// Q.5 Print Square pattern
// import java.util.*;
// public class whileloop{
//     public static void main(String[]args){
//         int line = 0;
//         while(line<=4){
//             System.out.println("****");
//             line++;
//         }
//     }
// }

// Q.6 Print reverse 10899 number
import java.util.*;
public class whileloop{
    public static void main(String[]args){
        int n = 10899;
        int rev = 0;
        while(n>0){
             int lastdigit = n % 10;
             rev = (rev*10) + lastdigit;
             n = n/10;
        }
        System.out.println(rev);
    }
}