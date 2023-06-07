//Time complexity = O(n^2)

import java.util.*;

public class pairs {
    public static void main(String[] args){
        int num[] = {2, 3, 4, 6, 8};

        pair(num);
        

    } 

    public static int pair(int num[]){
        int tp = 0;
        for(int i = 0; i<num.length; i++){
            int current = num[i]; //2, 3, 4, 6, 8
            for(int j = i+1 ; j<num.length; j++){

            System.out.print("("+ current + "," + num[j] + ")");
            tp++;   //(n*(n-1))/2
        }
        System.out.println();
        }
        System.out.println("Total number of Pairs = " + tp);
        return -1;
    }
 

}