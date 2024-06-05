import java.util.*;

class IllegalAgeException extends Exception {
    public String getMessage() {
        return "Invalid age";
    }
}

public class Custom {

    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        validate(age);
    }

    public static void validate(int age) {
        try {
            if (age < 18)
                throw new IllegalAgeException();
        } catch (IllegalAgeException e) {
           System.out.println(e.getMessage());
        }

    }
}
