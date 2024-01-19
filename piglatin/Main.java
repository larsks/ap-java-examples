public class Main {
	public static void main(String[] args) {
		testIsLetterAVowel();
		testConvertWord();
		testConvertPhrase();
	}

	public static void testIsLetterAVowel() {
		String[] letters = {"a", "e", "i", "o", "u", "w", "x", "y", "z"};
		boolean[] expected = {true, true, true, true, true, false, false, false, false};

		PigLatin p = new PigLatin();
		for (int i=0; i<letters.length; i++) {
			boolean result = p.isLetterAVowel(letters[i]);
			assert result == expected[i] :
				String.format("Expected result %b for %s, got %b", expected[i], letters[i], result);
		}
	}

	public static void testConvertWord() {
		String[] words = {"ant", "cat", "clone"};
		String[] expected = {"antway", "atcay", "oneclay"};

		PigLatin p = new PigLatin();
		for (int i=0; i<words.length; i++) {
			String result = p.convertWord(words[i]);
			assert expected[i].equals(result) :
				String.format("Expected \"%s\" -> \"%s\", got \"%s\"", words[i], expected[i], result);
		}
	}

	public static void testConvertPhrase() {
		String[] phrases = {"the cat is sleepy", "where are you", null, ""};
		String[] expected = {"ethay atcay isway eepyslay", "erewhay areway ouyay", "", ""};

		PigLatin p = new PigLatin();
		for (int i=0; i<phrases.length; i++) {
			String result = p.convertPhrase(phrases[i]);
			assert expected[i].equals(result) :
				String.format("Expected \"%s\" -> \"%s\", got \"%s\"", phrases[i], expected[i], result);
		}
	}
}
