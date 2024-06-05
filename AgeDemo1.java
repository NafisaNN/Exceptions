
    import java.util.*;

    class InvalidAgeException extends Exception {

        InvalidAgeException(String str){
            super(str);
        }
    }

    public class AgeDemo1 {


        public static void main(String args[]) {
             Scanner sc=new Scanner(System.in);

            int age=sc.nextInt();
             try {
             if(age<18) 
                throw new InvalidAgeException("You are not eligible for voting");
            else 
                System.out.println("You are eligible for voting");
             }catch(InvalidAgeException e) {
                  System.out.println(e.getMessage());
             }
        }
    }