import java.util.*;
public class FinallyDemo {
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int n1,n2,n;
        n1=sc.nextInt();
        n2=sc.nextInt();
        
        try {
        n=n1/n2;

        }catch(ArithmeticException e) {
             System.out.println("You are trying to divide the no by zero");
        }
        finally {
           
            System.out.println("Finally block code");
        }
    }
}
