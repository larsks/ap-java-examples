import java.util.ArrayList;

public class PigLatin {
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
		String[] vowels = {"a", "e", "i", "o", "u"};

		for (String ch: vowels) {
			if (letter.equals(ch)) {
				return true;
			}
		}
		return false;
	}

	public String convertPhrase(String phrase) {
		ArrayList<String> converted = new ArrayList<String>();

		if (phrase != null && phrase.length() != 0) {
			String[] words = phrase.split(" ");
			for (String word: words) {
				converted.add(convertWord(word));
			}
		}

		return String.join(" ", converted);
	}
}
