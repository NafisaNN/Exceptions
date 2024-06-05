public class ExceptionD {
    public static void main(String args[]) {
          int n=0;
         try {
           n=5/0;
          
         }
         catch(Exception e) {
           System.out.println("You are not supposed to divide a no by zero");
           e.printStackTrace();
         }
           System.out.println("your result is ");

            System.out.println("Hello ur no is " + n);
        }
    
}
