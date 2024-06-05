public class Student{
   int m;
   public void setMarks(int marks) {
      if(marks < 0 || marks > 100)
         throw new IllegalArgumentException("Invalid marks :" + Integer.toString(marks));
      else {
         m = marks;
         System.out.println("Your marks are : " + m); }
   }
   public static void main(String[] args) {
      Student s1 = new Student();
      s1.setMarks(45);
      
      Student s2 = new Student();
      s2.setMarks(101);
      
   }
}