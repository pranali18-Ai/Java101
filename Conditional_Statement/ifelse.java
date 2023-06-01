//Syntax 
/*if (condition){
}
else{
}*/

//Q.1 Print largest of 2 numbers
/*import java.util.Scanner;
public class ifelse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); //I capital
        System.out.println("first number: " + a);
        System.out.println("second number: " + b);
        
        if (a >b){
            System.out.println("Largest number: " + a );
        }
        else{
            System.out.println("Largest number: " + b);
        }
        }
        
    }
*/
/* 
import java.util.Scanner;
public class ifelse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number = " );
        int a = sc.nextInt();

        if(a == 0){
            System.out.println(a + "= " + "Even number");
    }
        else{
            System.out.println(a + "= " +"Odd number");
        }
}
}
*/

//Get a number from the user and print whether it is positive or negative.
import java.util.Scanner;
public class ifelse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number= ");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("POSITIVE");
        }

        else{
            System.out.println("NEGATIVE");
        }
    }
}