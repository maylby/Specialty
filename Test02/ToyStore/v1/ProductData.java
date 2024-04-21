/*
 * Промежуточная контрольная работа по блоку специализация
 * онлайн-магазина детских игрушек
 * https://gb.ru/lessons/432765/homework
 */

package Specialization.Test02.ToyStore.v1;

/*
 * ProductData
 * (перечень представленных товаров по разделам)
 */
public class ProductData {
    static Set<Orders> createOrdersSet() {

        Map<String, Integer> softToys = new LinkedHashMap<>();
        SoftToys.put("Чебурашка", 1000);
        SoftToys.put("Панда", 3000);
        SoftToys.put("Марышка", 2000);
        SoftToys.put("Собака", 1000);
        SoftToys.put("Пингвин", 1000);

        Map<String, Integer> Dolls = new LinkedHashMap<>();
        dolls.put("Барби", 4000);
        dolls.put("Пупс", 3000);
        dolls.put("Авторская кукла", 14000);

        Map<String, Integer> BoardGames = new TreeMap<>();
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

        Map<String, Integer> Constructors = new LinkedHashMap<>();
        Constructors.put("Скворечник", 500);
        Constructors.put("Дом", 500);
        Constructors.put("Паровоз", 700);
        Constructors.put("Lego", 1000);
        Constructors.put("Машина", 2000);
        Constructors.put("Шкатулка", 2000);
	Constructors.put("Мозаика", 200);

        Map<String, Integer> Weapons = new LinkedHashMap<>();
        Weapons.put("Автомат", 1500);
        Weapons.put("Винтовка", 1500);
        Weapons.put("Пистолет", 1000);
        Weapons.put("Ружьё", 500);
        Weapons.put("Нож", 300);
        Weapons.put("Меч", 300);


        Set<Orders> orders = new HashSet<>();
        for (int i = 0; i < 100; i++) {

            int price = 0;

            Random r = new Random();

            randIndex = r.nextInt(softToys.size());
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
	    
	    // как указать, что количество элементов произвольное, чтобы
	    // добавлять, только выбранное, пропуская остальное???
            orders.add(new Orders(softToy, doll, boardGame, constructor, weapon, price));
        }
        return orders;
    }
}
