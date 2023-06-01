
import java.util.Scanner;  // Import the Scanner class

public class take {
  public static void main(String args []) {
    try (Scanner sc = new Scanner(System.in)) {
        String name = sc.next();  // Read user input
        System.out.println(name);  // Output user input
    }
  }
}