 class InvalidAgeException extends Exception
     {
        InvalidAgeException(String str) {
        super(str);
        }
     }
public class AgeExceptionDemo {
       

    public static void main(String args[])  throws InvalidAgeException{
         int age=Integer.parseInt(args[0]);
         if(age<18)
            throw new InvalidAgeException("You are not eligible");
         /*try {
         if(age<18)
           throw new InvalidAgeException("You are below 18 years old");
         }catch(InvalidAgeException e) {
            System.out.println("Invalid age");
         } */

    }
    
}
