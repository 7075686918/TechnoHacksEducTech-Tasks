import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the values");
	 int a =sc.nextInt();
	 int b =sc.nextInt();
	 System.out.println("you need a additon please enter the 1 ");
	 System.out.println("you need a multiplication please enter the 2");
	 System.out.println("you need a division please enter the 3 ");
	 System.out.println("you need a substraction please enter the 4");
	 int ch=sc.nextInt();
	 
	 switch(ch)
	 {
	          case 1:
	                 System.out.println(a+b);
	                 break;
	        
	          case 2:System.out.println(a*b);;
	                 break;
	          case 3:
	        	  System.out.println(a/b);
	          case 4:System.out.println(a-b);
	                  break;
	}
}
}