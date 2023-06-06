//Syntax 
/*

do{
    do something
} while(condition);

 */

//Q.1 print hello world 10 times
import java.util.*;
public class dowhile{
    public static void main(String[] args){

        int i = 1;
        do{
            System.out.println("Hello world");
            i++;
        }while(i <= 10);
    }
}