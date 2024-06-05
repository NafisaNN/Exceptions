public class TestThrow1 {  
    //defining a method  
    public void checkNum(int num) {  
        if (num < 1) {  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
    }  
    //main method  
    public static void main(String[] args) {  
            TestThrow1 obj = new TestThrow1();  
            obj.checkNum(-3);
            System.out.println("Rest of the code..");  
    }  
}  