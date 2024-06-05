
import java.util.Scanner;
public class Student2 {
    public static void main(String[] args) {
       
    
        Scanner scan = new Scanner(System.in);
       
           try {
               System.out.println("Enter an integer: ");
               int marks = scan.nextInt();
               if (marks < 0 || marks > 100)
                  throw new IllegalArgumentException("value must be non-negative and below 100");
               System.out.println( marks);
            }
            catch(IllegalArgumentException i) {
               System.out.println("out of range encouneterd");
               
          }
     }
}