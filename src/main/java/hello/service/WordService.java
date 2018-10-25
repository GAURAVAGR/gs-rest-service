package hello.service;

public class WordService {

	public Boolean checkPalindrome(String word) {
		StringBuilder sbl = new StringBuilder();
		sbl.append(word);
		return sbl.toString().compareTo(sbl.reverse().toString()) == 0;
	}

	public Boolean checkAnagramOfPalindrom(String word) {
		int charsCount = 256;
		int[] count = new int[charsCount];

		for (int i = 0; i < word.length(); i++)
			count[word.charAt(i)]++;

		int odd = 0;
		for (int i = 0; i < charsCount; i++) {
			if ((count[i] & 1) != 0)
				odd++;

			if (odd > 1)
				return false;
		}

		return true;
	}
}
