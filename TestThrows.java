public class TestThrows {  
    //defining a method  
    public static int divideNum(int m, int n) throws ArithmeticException {  
        int div = m / n;  
        return div;  
    }  
    //main method  
    public static void main(String[] args) {  
        TestThrows obj = new TestThrows();  
        
            System.out.println(obj.divideNum(45, 0));  
        
       
        System.out.println("Rest of the code..");  
    }  
}
  