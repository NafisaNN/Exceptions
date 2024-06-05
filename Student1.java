
import java.util.Scanner;
public class Student1 {
    public static void main(String[] args) {
        String cont = "y";
        run(cont);
    }
    static void run(String cont) {
        Scanner scan = new Scanner(System.in);
        while( cont.equalsIgnoreCase("y")) {
           try {
               System.out.println("Enter an integer: ");
               int marks = scan.nextInt();
               if (marks < 0 || marks > 100)
                  throw new IllegalArgumentException("value must be non-negative and below 100");
               System.out.println( marks);
            }
            catch(IllegalArgumentException i) {
               System.out.println("out of range encouneterd. Want to continue");
               cont = scan.next();  
               if(cont.equalsIgnoreCase("Y"))
                   run(cont);
               }
          }
     }
}