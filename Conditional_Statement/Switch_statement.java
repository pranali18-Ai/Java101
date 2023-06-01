//Syntax 
/*
switch (variable){
case 1:
break;
case 2:
break;
case 3:
default:  
}
*/
/* 
//Vending Machine
import java.util.Scanner;
public class Switch_statement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Press the button = ");
        int num = sc.nextInt();
        switch(num){
            case 1: System.out.println("Lays");
                   break;
            case 2: System.out.println("Kurkure");
                   break;
            case 3: System.out.println("Pepsi");
                   break;
            case 4: System.out.println("Product is unavailable!");
        }
    }
}
*/

//Q. input week number(1-7)and print day of week name using switch statement
import java.util.*;
public class Switch_statement{
    public static void main(String[] args){
        int num = 1;
        switch(num){
            case 1: System.out.println("Sunday");
            case 2: System.out.println("MOnday");
            case 3: System.out.println("Tuesday");
            case 4: System.out.println("Wednesday");   
            case 5: System.out.println("Thursday");
            case 6: System.out.println("Friday");
            case 7: System.out.println("Saturday");
        
        }
    }
}
