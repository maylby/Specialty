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
    
	public static void main(String[] args) {
		List<String> words = getWords(); // прередать список слов из "Input.txt"

		wordCount(count); // метод подсчёта количества слов
		System.out.println(count);

		maxWordLength(mwl); // метод поиска самого длинного слова 
		System.out.println(mwl);

		matchWords(words); // метод поиска совпадений
		System.out.println(words); 
	}
	
	private static List<String> getWords() {
		
		String text = input.txt
		List<String> words = new ArrayList<>(Arrays.asList(text));
		return 	words;
	}
}