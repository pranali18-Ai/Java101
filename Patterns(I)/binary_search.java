// Time Complexity = O(logn)


import java.util.Scanner;

public class binary_search{
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8};
        System.out.print("key = ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println("Index of key = " + binarySearch(num, key));

}
    public static int binarySearch(int num[], int key){
        int start = 0, end = num.length-1;  //array starts from 0 
        while(start <= end){ 
            int mid = (start + end) / 2;
            if(num[mid] == key){  //equals to mid 
                return mid;
            }
            else if(num[mid] < key){ //Right
                start = mid + 1;
            }
            else{  //Left
                end = mid - 1;
            }

            }
            return -1; // key is not found
    }

}