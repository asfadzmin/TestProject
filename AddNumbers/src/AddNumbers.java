import java.util.Scanner;

/**
 * 
 */

/**
 * @author User
 *
 */
public class AddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String num1;
        System.out.println("Enter first num: ");
        num1 = userInput.next();
        
        String num2;
        System.out.println("Enter first num: ");
        num2 = userInput.next();
        
        int numtotal = Integer.parseInt(num1) + Integer.parseInt(num2);
        
		
		
		//int a = 3;
		//int b = 10;
		//int c = a + b;
		System.out.println("the total value is : " + numtotal);// TODO Auto-generated method stub

	}

}
