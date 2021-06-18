package mypack;
public class Exception{
	  static void checkAge(int age){ 
	    if (age < 18) {
	      throw new ArithmeticException("You are not eligible for vote"); 
	    } else {
	      System.out.println("You are eligible for vote"); 
	    }
	 } 
	 public static void main(String[] args) { 
	   checkAge(15); 
	 } 
}
/*  Output:
Exception in thread "main" java.lang.ArithmeticException: You are not eligible for vote
	at mypack.Exception.checkAge(Exception.java:5)
	at mypack.Exception.main(Exception.java:11)

*/
