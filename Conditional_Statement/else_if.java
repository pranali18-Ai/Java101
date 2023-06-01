//Syntax 
/*
if(condition1){
}
else if(condition2){
}
else(condition3){
}
 */

//Q.1 Check Whether the person is child, teenager or adult
/*import java.util.Scanner;
public class else_if{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Age= ");
        int age = sc.nextInt();
        if(age < 13){
            System.out.println(age + "yrs" + "= " + "Child");
        }
        else if(age >= 13 && age<=19){
            System.out.println(age + "yrs" + "= " + "Teenager");
        }
        else{
            System.out.println(age + "yrs" + "= " +  "Adult");
        }
    }
}
*/

/*
//The person who have largest amount of chocolate
import java.util.*;
public class else_if{
    public static void main (String[]args){
        int Prince = 11, Kiara= 20, Pratik = 5;
    
        if(Prince>=Kiara && Prince>=Pratik){
            System.out.println("Prince Has largest amount of chocolate ="+ Prince);
        }
        else if(Kiara>=Pratik){
            System.out.println("Kiara has largest amount of chocolate =" + Kiara);
        }
        else{
            System.out.println("Pratik has largest amount of cholates = "+ Pratik);
        }
        
    
    }
}
*/

import java.util.Scanner;
public class else_if{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your temperature = ");
        double temp = sc.nextDouble();
        if(temp>100){
            System.out.println("You have fever");
        }
        else 
            System.out.println("You don't have fever");
        

}
}
