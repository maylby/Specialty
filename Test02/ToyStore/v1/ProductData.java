/*
 * Промежуточная контрольная работа по блоку специализация
 * онлайн-магазина детских игрушек
 * https://gb.ru/lessons/432765/homework
 */

package Specialization.Test02.ToyStore.v1;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/*
 * ProductData
 * (перечень представленных товаров по разделам)
 */
public class ProductData {
    static Set<Orders> createOrdersSet() {

        Map<String, Integer> softToys = new LinkedHashMap<>();
        softToys.put("Чебурашка", 1000);
        softToys.put("Панда", 3000);
        softToys.put("Марышка", 2000);
        softToys.put("Собака", 1000);
        softToys.put("Пингвин", 1000);

        Map<String, Integer> dolls = new LinkedHashMap<>();
        dolls.put("Барби", 4000);
        dolls.put("Пупс", 3000);
        dolls.put("Авторская кукла", 14000);

        Map<String, Integer> boardGames = new TreeMap<>();
        boardGames.put("Кубики", 1000);
        boardGames.put("Головоломка", 1000);
        boardGames.put("Настольня игра", 3000);
        boardGames.put("Пазлы", 300);
        boardGames.put("Развивающая игра", 100);
        boardGames.put("Лото", 1000);
        boardGames.put("Домино", 1000);
        boardGames.put("Шашки", 2000);
        boardGames.put("Шахматы", 5000);
        boardGames.put("Нарды", 4000);
        boardGames.put("Хоккей", 6000);
        boardGames.put("Футбол", 6000);
        boardGames.put("Бильярд", 10000);

        Map<String, Integer> constructors = new LinkedHashMap<>();
        constructors.put("Скворечник", 500);
        constructors.put("Дом", 500);
        constructors.put("Паровоз", 700);
        constructors.put("Lego", 1000);
        constructors.put("Машина", 2000);
        constructors.put("Шкатулка", 2000);
	constructors.put("Мозаика", 200);

        Map<String, Integer> weapons = new LinkedHashMap<>();
        weapons.put("Автомат", 1500);
        weapons.put("Винтовка", 1500);
        weapons.put("Пистолет", 1000);
        weapons.put("Ружьё", 500);
        weapons.put("Нож", 300);
        weapons.put("Меч", 300);


        Set<Orders> orders = new HashSet<>();
        for (int i = 0; i < 100; i++) {

            int price = 0;

            Random r = new Random();

            int randIndex = r.nextInt(softToys.size());
            String softToy = (String) softToys.keySet().toArray()[randIndex];
            price += softToys.get(softToy);

            randIndex = r.nextInt(dolls.size());
            String doll = (String) dolls.keySet().toArray()[randIndex];
            price += dolls.get(doll);

            randIndex = r.nextInt(boardGames.size());
            String boardGame = (String) boardGames.keySet().toArray()[randIndex];
            price += boardGames.get(boardGame);

            randIndex = r.nextInt(constructors.size());
            String constructor = (String) constructors.keySet().toArray()[randIndex];
            price += constructors.get(constructor);

            randIndex = r.nextInt(weapons.size());
            String weapon = (String) weapons.keySet().toArray()[randIndex];
            price += weapons.get(weapon);
	    
	    // как указать, что количество элементов произвольное,
	    // добавляя, только выбранное, и пропуская остальное???
            orders.add(new Orders(softToy, doll, boardGame, constructor, weapon, price));
        }
        return orders;
    }
}
