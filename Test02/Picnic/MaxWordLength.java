/*
Промежуточная контрольная работа по блоку специализация
Урок 2. Виртуальный пикник (Java)
https://gb.ru/lessons/432766/homework

 */
import java.util.List;

/*
 * MaxWordLength
 * Поиск самого длинного слова
 */
pablic class MaxWordLength {
	public static void maxWordLength(List<String> listWords) {
		for (int i = 0; i < listWords.size(); i++) {
			String currentWord = ListWords.get(i);
			if (String mwl < currentWord) {
				mwl = currentWord; // заменить слово более длинным
			} 
			return mwl; // вернуть прежнее слово
		}
		System.out.println(mwl); // вывести самое длинное слово
	}
}