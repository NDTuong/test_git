import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class TimeDemo{
	public static void main(String[] args) {
		//get time by millis
		long start = System.currentTimeMillis();
		try{
			for(int i = 0; i < 1000; i++){
				Thread.sleep(2);
			}
		} catch (Exception e) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("Millis: " + (end - start));

		//get time by nano
		start = System.nanoTime();
		end = System.nanoTime();
		System.out.println("Nano: " + (end - start));

		//Display system time
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now(); 
		String day = dtf.format(now);
		System.out.println(day);
	}
}