public class NumberFormatDemo {  
  
     static  String inputString = "123.3";   
      
    public static void main(String[] args) {  
        try {  
                 int a = Integer.parseInt(inputString);  
        }catch(NumberFormatException ex){  
            System.err.println("Invalid string int argumment"  );  
           
        }  
            }  
}  