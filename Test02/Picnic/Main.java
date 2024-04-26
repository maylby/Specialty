/*
Промежуточная контрольная работа по блоку специализация
Урок 2. Виртуальный пикник (Java)
https://gb.ru/lessons/432766/homework

Задания:

1. Осуществить подсчет слов:
   Напишите программу, которая подсчитывает 
   количество слов в файле `input.txt`.
2. Найти самое длинное слово:
   Создайте программу, которая находит 
   самое длинное слово в файле.
3. Вычислить частоту слов:
   Напишите программу, которая анализирует, 
   сколько раз каждое слово встречается в файле. 
   Подумайте об этом как о подсчете того, какие 
   фрукты и овощи самые популярные на вашем пикнике!
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	// Возможно, вызовы методов нужно будет поместить в "public" (см. ООП)

	public static void main(String[] args) {
		List<String> words = getWords(); // прередать (как?) в список 
						                 // слова из файла "Input.txt"
		wordCount(count);
		System.out.println(count);

		maxWordLength(mwl);
		System.out.println(mwl);

		matchWords(words); // вызов метода записи слов
		System.out.println(words); // печатать список слов
	}
	
	private static List<String> getWords() {
		
		String text = input.txt
		List<String> words = new ArrayList<>(Arrays.asList(text));
		return 	words;
	}
}