package hello.beans;

public class WordStats {
	String word;
	Boolean palindrome;
	Boolean anagramOfPalindrome;

	public WordStats() {
		super();
	}
	public WordStats(String word, Boolean palindrome, Boolean anagramOfPalindrome) {
		super();
		this.word = word;
		this.palindrome = palindrome;
		this.anagramOfPalindrome = anagramOfPalindrome;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Boolean getPalindrome() {
		return palindrome;
	}
	public void setPalindrome(Boolean palindrome) {
		this.palindrome = palindrome;
	}
	public Boolean getAnagramOfPalindrome() {
		return anagramOfPalindrome;
	}
	public void setAnagramOfPalindrome(Boolean anagramOfPalindrome) {
		this.anagramOfPalindrome = anagramOfPalindrome;
	}
}
