/**
 * 
 */
package preparation;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * @author sehee
 *
 */
public class datetime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime localDate = LocalDateTime.now();
		System.out.println(localDate);
		
		DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		System.out.println(dft1.format(localDate));
		
		DateTimeFormatter dft2 = DateTimeFormatter.ofPattern("MMM dd, YYYY");
		System.out.println(dft2.format(localDate));
		
		DateTimeFormatter dft3 = DateTimeFormatter.ofPattern("MM-dd-YY h:mm a");
		System.out.println(dft3.format(localDate));
	}

}
