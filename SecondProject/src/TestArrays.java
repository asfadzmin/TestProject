/**
 * 
 */

/**
 * This class test Java Arrays
 * @author User
 *
 */
public class TestArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salaries []  = {190,70,60,400,565}; //= new double [5];
	
		for(int i = 0; i < salaries.length; i++) { //for loop
			System.out.println("Salary of "  + i + " is " + salaries[i]);
		}
		int i = 0;  //for-each loop
		for (double sal:salaries) {
			
			System.out.println("Salary of " + i + " is " + sal);
			i++;
		}
	}

}
