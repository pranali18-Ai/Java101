/*
//Tax calulator
import java.util.Scanner;
public class tax_calculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your income is = ");
        int income = sc.nextInt();
        int tax;

        if(income<500000){
            tax = 0;
        }
        else if (income>=500000 && income<1000000){
            tax = (int) (income * 0.2);
        }
        else{
            tax = (int)(income * 0.3);
        }
        System.out.println("Your tax is = " + tax + " " + "Rs");
    
    }
}
*/

//Checking the leap Year
import java.util.Scanner;
public class tax_calculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Year = ");
        int year = sc.nextInt();
        
        if(((year%4)==0) && (((year%100)!= 0) || ((year%400)==0))){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not leap Year");
        }
}
}