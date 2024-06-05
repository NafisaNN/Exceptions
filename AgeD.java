
public class AgeD {
      public void invalidAge(int age) {
        if(age<18)
           throw new IllegalArgumentException("You are below 18");
        else
          System.out.println("Allowed to vote");
      }    

      public static void main(String args[]) {

        AgeD obj=new AgeD();
        try {
        obj.invalidAge(12);
        }catch(IllegalArgumentException e) {
            System.out.println("age is not valid.."+e.getMessage());
        }

        System.out.println("End of main");

      }
}
