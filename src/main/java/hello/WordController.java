package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import hello.beans.WordStats;
import hello.service.WordService;
 
@RestController("/")
public class WordController {
	
	@GetMapping("/words/{word}")
	public WordStats getWordStat(@PathVariable String word) {
		WordService wordService = new WordService();
		WordStats stat = new WordStats();
		stat.setWord(word);
		stat.setAnagramOfPalindrome(wordService.checkAnagramOfPalindrom(word));
		stat.setPalindrome(wordService.checkPalindrome(word));
		return stat;
	} 
	
}
