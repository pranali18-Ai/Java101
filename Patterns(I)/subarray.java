import java.util.*;

public class subarray {
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8};
        subarrays(numbers);
    }

    public static void subarrays(int numbers[]){
        int ts = 0;
        int maximum = Integer.MAX_VALUE;
        int minimum = Integer.MIN_VALUE;

        for(int i = 0; i< numbers.length; i++){
            int start = i;

            for(int j = i; j<numbers.length; j++){
                int end = j;
                int sum = 0;

                for(int k = start; k<= end; k++){  //print
                    System.out.print(numbers[k]+ " "); //subarrays
                    sum = sum + numbers[k];  //sum
                }
                System.out.println(); 

                System.out.println("Sum of subarray = " + sum );

                minimum = Math.min(minimum, sum);
                maximum = Math.max(maximum, sum);

                
                ts++;
            }
            System.out.println("----------------------------------------------------");//after each subarray
        }
        System.out.println("Total Subarray = " + ts );  //total number of subarray
        System.out.println("Minimum sum = " + minimum ); //minimum sum
        System.out.println("Maximum sum = " + maximum );  //maximum sum
    }
}


