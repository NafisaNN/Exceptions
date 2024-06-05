public class ThrowPreExample {
    public static void main(String args[]) {

        int n=10;
        try {
        if(n<0)
           throw new ArithmeticException("No is negative");
        else 
           System.out.println("You no is :" + n);
        }catch(ArithmeticException e) {
            System.out.println(e);

        }

    }
}
