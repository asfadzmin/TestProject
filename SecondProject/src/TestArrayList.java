import java.util.ArrayList;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList();  //generic = <>
		
		
		for (String str:args) {
			al.add(str);
		}
		System.out.println("array list is empty: " + al.isEmpty());
		//al.add(new Integer(10));
		//al.add(Boolean.TRUE);
		
		
		String ar [] = (String [])al.toArray();
		
		System.out.println(al);
	}
}
