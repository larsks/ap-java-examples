import java.util.*;

public class PigLatin {
	private final Set<String> vowels = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u"));

	public String convertWord(String word) {
		String result;

		if (isLetterAVowel(word.substring(0,1))) {
			result = word + "way";
		} else {
			if (isLetterAVowel(word.substring(1,2))) {
				result = word.substring(1, word.length()) + word.substring(0,1) + "ay";
			} else {
				result = word.substring(2, word.length()) + word.substring(0,2) + "ay";
			}
		}

		return result;
	}

	public boolean isLetterAVowel(String letter) {
		return vowels.contains(letter);
	}

	public String convertPhrase(String phrase) {
		String [] converted = new String[0];

		if (phrase != null && phrase.length() != 0) {
			converted = Arrays.asList(phrase.split(" ")).stream().map((word) -> convertWord(word)).toArray(String[]::new);
		}

		return String.join(" ", converted);
	}
}
