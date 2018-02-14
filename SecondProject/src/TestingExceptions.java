/**
 * 
 */

/**
 * @author User
 *
 */
public class TestingExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String name = args[0];
			System.out.println("Your name is : " + name);
			
			if (!(name.startsWith("M"))){ 
				throw new Exception("exception : Name should start with M");
			}
			System.out.println("name printd");
		}
		catch (ArrayIndexOutOfBoundsException ae){
			System.out.println("please provide your name as a command line parameter!!!!!!" + "eg: java TestingExceptions <yourname>");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Im done");
	}

}
