package mylearning;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateTimeAPI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Get the input string from the user
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		// Convert the string to a character array
		char[] charArray = input.toCharArray();

		// Swap every second character
		for (int i = 1; i < charArray.length; i += 2) {
			if (i + 1 < charArray.length) {
				// Swap charArray[i] and charArray[i + 1]
				char temp = charArray[i];
				charArray[i] = charArray[i + 1];
				charArray[i + 1] = temp;
			}
		}

		// Convert the modified character array back to a string
		String modifiedString = new String(charArray);

		// Print the modified string
		System.out.println("Modified string: " + modifiedString);

		LocalDate Today = LocalDate.now();
		System.out.println(Today);

		LocalDate Tomorrow = Today.plusDays(1);
		System.out.println(Tomorrow);

		LocalDate Yesterday = Today.minusDays(2);
		System.out.println(Yesterday);

		LocalTime Now = LocalTime.now();
		System.out.println(Now);

		LocalTime FourHoursBefore = Now.minusHours(4);
		System.out.println(FourHoursBefore);

		LocalTime FiveMinsLater = Now.plusMinutes(5);
		System.out.println(FiveMinsLater);

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		ZonedDateTime Zone = ZonedDateTime.now();
		System.out.println(Zone);

		// Duration duration = Duration.between(now, FourHoursBefore); --> here now is
		// Day :: Now is Time
		Duration duration = Duration.between(Now, FourHoursBefore);
		System.out.println(duration);

		sc.close();
	}
}
