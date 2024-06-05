   class InvalidAgeException extends Exception {

         InvalidAgeException(String str) {

            super(str);
      
    }
   }

public class EDemo {
    
    public static void main(String args[]) {

        int age=11;
          try{
        if(age<18)
           throw new InvalidAgeException("You are below 18 years ");

        else 
         System.out.println("You are eligible for voting");
          }catch(InvalidAgeException e) {
            //System.out.println(e.getMessage());

          }

        System.out.println("End of main");
    }


    
}
