import java.util.Scanner;
  public class IT26300035Lab9Q1{
      public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
		
		double a,b,c;
		double discriminant, root1, root2;
		
		System.out.print("Enter value a: ");
		a = input.nextDouble();
		
		System.out.print("Enter value b: ");
		b = input.nextDouble();
		
		System.out.print("Enter value c: ");
		c = input.nextDouble();
		
		discriminant = Math.pow(b,2)-4*a*c;
		
		root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
		root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
		
		System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
		
	  
	  
	  
	  
	  }
  
  
  
  
  
  
  }