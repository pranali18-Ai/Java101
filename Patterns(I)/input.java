import java.util.Scanner;

public class input{
    public static void main(String[] args){
        int marks[] = new int[100];
        
        //Length of array
        System.out.println("Length of array = " + marks.length);
        
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //maths
        marks[3] = sc.nextInt(); //bio
        
        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);
        System.out.println("Biology : " + marks[3]);
        
        //Update the values
        marks[2] = 100;
        marks[1] = marks[1] + 4;
        System.out.println("Chemistry updated : " + marks[1]);
        System.out.println("Maths update : " + marks[2]); //update the marks
         
        //percentage
        float  percentage = (marks[0] + marks[1] + marks[2] + marks[3])/4;
        System.out.println("Percentage = " + percentage + "%");
    
    }
}
