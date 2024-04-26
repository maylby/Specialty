/*
Промежуточная контрольная работа по блоку специализация
Урок 2. Виртуальный пикник (Java)
https://gb.ru/lessons/432766/homework

 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * MatchWords
 * подсчёт и печать повторяющихся слов
 */
public class MatchWords {

	private static void matchWords(List<String> listWords) {
		List<String> sortedWords = new ArrayList<>(listWords);
		Collections.sort(sortedWords);
		int count = 1;
		String currentWord = sortedWords.get(0); 
		for (int i = 1; i < sortedWords.size(); i++) {
			if (sortedWords.get(i).equals(currentWord)) {
				count++;
			} else {
				System.out.println(currentWord + " -> " + count); 
				count = 1;
				currentWord = sortedWords.get(i);
			}
		}
		System.out.println(currentWord + " -> " + count); // вывод последнего слова
	}
}