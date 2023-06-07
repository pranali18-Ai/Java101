import java.util.*;

public class arrays_function{
    public static void update(int marks[], int nonChangeble){
        nonChangeble = 10;
        for(int i=0; i<marks.length; i++ ){
            marks[i] = marks[i] + 1;
        }
    }
    
public static void main(String args[]) {
    int marks[] = {97, 98, 99};
    int nonChangeble = 5; // remain 5
    update(marks, nonChangeble);
    System.out.println("Update = " + nonChangeble); //update value will not change

    //print our marks
    for(int i=0; i<marks.length; i++){
        System.out.print("Updated Marks = " + marks[i] + " ");
    }
    System.out.println(); // next line
    
}
}