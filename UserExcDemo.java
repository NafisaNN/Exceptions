class InvalidAgeException1 extends Exception { //user defined exception
    InvalidAgeException1(String str) {
        super(str);
    }
}

class Person
  {
    int age;
    void setAge(int age)  {
        this.age=age;
        try {
        if(age<18 || age>60)
            throw new InvalidAgeException1("You are not eligible"); //throw user defined exception
         else 
            System.out.println("You are eligible for this post");
        }catch(InvalidAgeException1 e) {
            System.out.println(e);
        }
        }

  }

public class UserExcDemo {

     public static void main(String args[]) throws InvalidAgeException1 {
         Person p=new Person();
         p.setAge(22);

     }
    
}
