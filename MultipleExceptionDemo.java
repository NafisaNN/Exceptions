public class MultipleExceptionDemo {

     public static void main(String args[]) {
           int n1,n2,n=0;
           try {
           n1=Integer.parseInt(args[0]);   
           n2=Integer.parseInt(args[1]);     
           n=n1/n2;
          }  
          catch(Exception e) {
            System.out.println(e.getMessage());
          }
         /*  catch(ArithmeticException e) {
            System.out.println("you are trying to divide the no by zero");
             }
             catch(NumberFormatException e1) {
                System.out.println("Argument should be of integer type");
             }
             catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("No index exists");
             }*/
             finally {
               System.out.println("division :" + n);
             }
     }
    
}
