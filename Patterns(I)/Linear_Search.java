//Time Complexity = O(n)


import java.util.Scanner;

public class Linear_Search {
    public static void main(String args[])
    {   
        //Array
        String fruits[] = {"Mango", "Apple", "Strawberry", "Orange", "Banana"};

        //taking the input
        System.out.print("Fruit you wanna find: ");
        Scanner sc = new Scanner(System.in); //Scanner object
        String block = sc.nextLine();

        int index = linearSearch(fruits, block);
        if(index == -1){
            System.out.print("Not Available");
        }
        else{
            System.out.print("Fruit is in " + index + " block"); 
        }


    }  
    
    public static int linearSearch(String fruits[], String block)
    {
        for(int i=0; i<fruits.length; i++){
            if(fruits[i].equals(block)){ //use equals() for string comparison
                return i;
            }
        }
        return -1;
    }

}
