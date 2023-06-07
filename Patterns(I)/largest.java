
//Smallest and Largest values in array

import java.util.*;

public class largest {
    public static void main(String args[]){
        int number[] = {5, 6, 8, 10, 3, 5};

        System.out.println("Largest number = " + largest_number(number)); //call the function
    }

    public static int largest_number(int number[]){

        //Largest
        int largest = Integer.MIN_VALUE; //intialize -infinity

        //Smallest
        int smallest = Integer.MAX_VALUE; //intialize +infinity


        for(int i=0; i<number.length; i++){

            //Largest
            if(largest < number[i]){ 
                largest = number[i];
            }

            //Smallest
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest Value is " + smallest);
        return largest; //only one thing can return
        
    }
    
}
