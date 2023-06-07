//Time Complexity = O(n)
//Space Complexity = O(1)

import java.util.*;

public class reverse_array {
    public static void main(String[] args){

    //    //reverse number array
    //     int num[] = {1,2,3,4,5,6,7,8,9,10};
    //     reverse(num);
    //     for(int i=0; i<num.length; i++){
    //         System.out.print(num[i] + " " );
    //     }         
    //     System.out.println();

    
    //     //reverse string array
           String Fruits[] = {"Mango", "Apple", "Orange","Banana", "Grapes"};
           reverse(Fruits);
           for(int i=0; i<Fruits.length; i++){
            System.out.print(Fruits[i] + " " );
            }
            System.out.println();

    }  

    //reverse number array
    public static int reverse(int num[]){
        int start = 0, end = num.length -1;
        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
        return -1;
    }

    //reverse string array
    public static void reverse(String Fruits[]){
        int start = 0, end = Fruits.length -1;
                while(start < end){
                    String temp = Fruits[start];
                    Fruits[start] = Fruits[end];
                    Fruits[end] = temp;
                    start++;
                    end--;
                }
    }
}
