
    import java.util.*;

    class InvalidAgeException extends Exception {

        InvalidAgeException(String str){
            super(str);
        }
    }

    public class AgeDemo {


        public static void main(String args[]) throws InvalidAgeException {
             Scanner sc=new Scanner(System.in);

            int age=sc.nextInt();
             if(age<18) 
                throw new InvalidAgeException("You are not eligible for voting");
            else 
                System.out.println("You are eligible for voting");

        }
    }