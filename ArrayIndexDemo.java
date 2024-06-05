public class ArrayIndexDemo {  
  
    public static void main(String[] args) {  
         int n[]={1,2,4};
         try {
         System.out.println(n[4]);
    }catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("No such index exists"  + e);
    
    }

      System.out.println(n[2]);

    }  
      
}  
