/**
 * 
 */
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @author User
 *
 */
public class UtilTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Date dt = new Date();
		String currentDate = String.valueOf(dt.getDay());
		System.out.println("TOdya is: " + currentDate);
		System.out.println("TOdya is: " + dt.getTime());
		
		Calendar cal = Calendar.getInstance();
		int dy = Integer.parseInt(args[0]);
		int mnth = Integer.parseInt(args[1]);
		int yar = Integer.parseInt(args[2]);
		cal.set(dy, (mnth-1), yar);
		//String currentCalDate = cal.get(Calendar.DATE) + " " + (cal.get(Calendar.MONTH)+1) + " " + + cal.get(Calendar.YEAR) + " " + cal.get(Calendar.HOUR) + " " + cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND) + " " + cal.getTimeZone().getDisplayName(); 
		//System.out.println("Current date is : " + currentCalDate);
		//String currentCalDate = String.valueOf(cal.set(Calendar.DATE,dy));
		String yourDate = cal.get(Calendar.DATE) + " " + (cal.get(Calendar.MONTH)) + " " + + cal.get(Calendar.YEAR);
		System.out.println("today is " + yourDate) ;*/
		LocalDate localDate = LocalDate.now();
		System.out.println("Current date before: " + localDate);
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		String text = date.format(formatter);
		LocalDate parsedDate = LocalDate.parse(text, formatter);
	}

}
