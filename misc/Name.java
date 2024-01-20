import java.util.*;

public class Name {
	public static String getFirstName(String name) {
		return name.split(" ")[0];
	}
	public static String getLastName(String name) {
		return name.split(" ")[1];
	}
	public static int countVowels(String name) {
		int count = 0;

		Set<String> vowels = new HashSet<String>(Arrays.asList("a", "e", "i", "o", "u"));
		for (int i=0; i<name.length(); i++) {
			if (vowels.contains(name.substring(i, i+1).toLowerCase())) {
				count++;
			}
		}
		return count;
	}
}
