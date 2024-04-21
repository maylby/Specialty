/*
 * Промежуточная контрольная работа по блоку специализация
 * https://gb.ru/lessons/432765/homework
 */
package Specialization.Test01.ToyStore.v2;

import java.util.*; 
import java.util.Objects;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/*
 * "ToyStore"
 * Программа для онлайн-магазина детских игрушек. 
 * Реализовать в java.
 */
public class ToyStore {
    
    public static void main(String[] args) {
        Set<Orders> orders = ProductData.createOrdersSet();

        runFilter(orders);
        
    }

    static void runFilter(Set<Orders> orders) {
        Set<Orders> filterOrders = new HashSet<>(orders);
        printOrders(filterOrders);
        int choice = chooseMainOptions();
        while (choice != 9) { // "вместо "9" вставить (?) "orders.length()" или "case.length"
			      // Bыяснить как в Map считают количество сохранённых заказов???
            switch (choice) {
                case 1:
                    System.out.println("filter - SoftToys"); // мягкая игрушка
                    filterSoftToys(filterOrders);
                    break;
                case 2:
                    System.out.println("filter - Dolls"); // куклы
                    filterDolls(filterOrders);
                    break;
                case 3:
                    System.out.println("filter - BoardGames"); // настольные игры
                    filterBoardGames(filterOrders);
                    break;
                case 4:
                    System.out.println("filter - Constructors"); // конструкторы
                    filterConstructors(filterOrders);
                    break;
                case 5:
                    System.out.println("filter - Weapons"); // оружие
                    filterWeapons(filterOrders);
                    break;
                case 6:
                    System.out.println("filter - price"); // цена
                    filterPrice(filterOrders);
                    break;
                case 7:
                    filterOrders.addAll(orders); // весь заказ
                    break;
                default:
                    System.out.println("Некорректный аргумент");

            }
            printOrders(filterOrders);
            choice = chooseMainOptions();
        }
    }

    private static void printOrders(Set<Orders> filterOrders) {
        int i = 0;
        for (Orders fo : filterOrders) {
            System.out.println(i++ + ". " + fo);
        }
    }

    static int chooseMainOptions() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Выбор раздела: \n" +
                "1. SoftToys (Мягкая игрушка)\n" +
                "2. Dolls (куклы)\n" +
                "3. BoardGames (настольные игры)\n" +
                "4. Constructors (конструкторы)\n" +
                "5. Weapons (оружие)\n" +
                "6. Price (Цена)\n" +
                "7. Сброс\n" +
                "8. Выход\n" +
                "Введите номера раздела: "
        );
        return sc.nextInt();  
    }


    static void filterSoftToys(Set<Orders> orders) {
        Set<String> options = new LinkedHashSet<>();
        for (Orders ord : orders) {
            options.add(ord.getSoftToys());
        }
        filterOptions(options);
        orders.removeIf(ord -> !options.contains(ord.getSoftToys()));
    }

    static void filterDolls(Set<Orders> orders) {
        Set<String> options = new LinkedHashSet<>();
        for (Orders ord : orders) {
            options.add(n.getDolls());
        }
        filterOptions(options);
        orders.removeIf(ord -> !options.contains(ord.getDolls()));
    }

    static void filterBoardGames(Set<Orders> orders) {
        Set<String> options = new TreeSet<>();
        for (Orders ord : orders) {
            options.add(ord.getBoardGames());
        }
        filterOptions(options);
        orders.removeIf(ord -> !options.contains(ord.getBoardGames()));
    }

    static void filterConstructors(Set<Orders> orders) {
        Set<String> options = new LinkedHashSet<>();
        for (Orders ord : orders) {
            options.add(ord.getConstructors());
        }
        filterOptions(options);
        orders.removeIf(ord -> !options.contains(ord.getConstructors()));
    }

    static void filterWeapons(Set<Orders> orders) {
        Set<String> options = new LinkedHashSet<>();
        for (Orders ord : orders) {
            options.add(ord.getWeapons());
        }
        filterOptions(options);
        orders.removeIf(ord -> !options.contains(ord.getWeapons()));
    }

    static void filterPrice(Set<Orders> orders) {
        Set<Integer> prices = new TreeSet<>();
        for (Orders ord : orders) {
            prices.add(ord.getPrice());
        }
        System.out.println(
                "Выбрать значения в пределах от " 
                + Collections.min(prices) + 
                " до " + Collections.max(prices));

        Scanner sc = new Scanner(System.in);
        Set<Integer> priceRange = new TreeSet<>();
        while (priceRange.size() < 2) {
            priceRange.add(sc.nextInt());
            System.out.println("Значения диапазона цен: " + priceRange);
        }
        laptops.removeIf(n ->
                (ord.getPrice() < Collections.min(priceRange)) ||
                (ord.getPrice() > Collections.max(priceRange)));
    }

    private static void filterOptions(Set<String> options) {
        List<String> optionsList = new ArrayList<>(options);
        System.out.println("Выбрать опции по номеру:");
        System.out.println(optionsList.size() + " Выход в главное меню");
        for (int i = 0; i < optionsList.size(); i++) {
            System.out.println(i + ". " + optionsList.get(i));
        }

        Set<Integer> optionsNums = getOptionsSet(optionsList.size());
        options.clear();
        for (int ord : optionsNums) {
            options.add(optionsList.get(ord));
        }
    }

    private static Set<Integer> getOptionsSet(int size) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> nums = new TreeSet<>();
        int choice = sc.nextInt();
        while (choice != size) {
            nums.add(choice);
            System.out.println("Выбраны опции: " + nums);
            choice = sc.nextInt();
        }
        return nums;

    }
}


class ProductData {
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


/*
 * класс записан без "public"
 * (форма записи кода целиком в одном файле)
 */
class Orders {

    private String softToy;
    private String doll;
    private String boardGame;
    private String constructor;
    private String weapons;
    private int price;

    public String getSoftToy() {
        return softToy;
    }

    public void setSoftToy(String softToy) {
        this.cpu = softToy;
    }

    public String getDoll() {
        return doll;

    }

    public void setDoll(String doll) {
        this.doll = doll;
    }

    public String getBoardGame() {
        return boardGame;
    }

    public void setBoardGame(String boardGame) {
        this.boardGame = boardGame;
    }


    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Orders(String softToy, String doll, String boardGame, 
		   String constructor, String weapons, int price ) {

        this.softToy = softToy;
        this.doll = doll;
        this.boardGame = boardGame;
        this.constructor = constructor;
        this.weapons = weapons;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ноутбук{" +
                "Мягкая игрушка: '" + softToy + '\'' +
                ", кукла: " + doll +
                ", настольная игра: " + boardGame +
                ", конструктор: " + constructor +
                ", оружие: " + weapons +
                ", цена: " + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orders)) return false;
        Orders orders = (Orders) o;
        return Objects.equals(getSoftToy(), orders.getSoftToy()) &&
                Objects.equals(getDoll(), orders.getDoll()) &&
                Objects.equals(getBoardGame(), orders.getBoardGame()) &&
                Objects.equals(getConstructor(), orders.getConstructor()) &&
                Objects.equals(getWeapons(), orders.getWeapons()) &&
                getPrice() == orders.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSoftToy(), getDoll(), getBoardGame(), getConstructor(), getWeapons());
    }
}
