/**
 * use hash to check memory
 */

/**
 * @author User
 *
 */
public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int first = 1;
		int second = 2;
		int third = 3;
		String fourth = "C";
		String fifth = "C";
		
		String sixth = new String("C");   //not using the same String pool (memory adress)
		if(fourth==fifth)
			System.out.println("fourth and fifth is the same: " + fourth);
		else
			System.out.println("fourth and fifth not the same: ");
		if(fourth == sixth)
			System.out.println("fourth and sixth is the same: " + fourth);
		else
			System.out.println("fourth and sixth not the same: ");
		**/
		
		/*System.out.println("fourth is: " + fourth); //scoping= (())
		
		fourth = third + fourth;
		
		System.out.println("Now fourth is: " + fourth);
		fourth = second +fourth;
		System.out.println("Now fourth is: " + fourth);
		fourth = (String.valueOf(first)).concat(fourth); //always concat the last
		System.out.println("Now fourth is: " + fourth);
		**/
		/*
		String sms = "Selamat Datang ke Malaysia!!";
		System.out.println("Sms size is : " + sms.length());
		System.out.println("text at 10th posi : " + sms.charAt(9));
		System.out.println("index of the text ! : " + sms.indexOf("!")); //return the first !'s index of a string
		System.out.println("Substring of 0 - 10 :  : " + sms.substring(8, 11));
		System.out.println("lower :   " + sms.toLowerCase());
		System.out.println("UPPER : " + sms.toUpperCase());
		**/
		String country = "Malaysia";
		
		if(country.equals(args[0])) { //not case sensitive
			System.out.println("Country is Malaysia!");
		}else {
			System.out.println("Country is not Malaysia but" + country );
		}
		
		
		String userCountry = args[0];
		if(userCountry.startsWith("m")){
			System.out.println("Country start with m");
		}else if(userCountry.endsWith("A")){
			System.out.println("COuntry is ending with A");
		}
	}

}
