/*
 * Промежуточная контрольная работа по блоку специализация
 * Программа для онлайн-магазина детских игрушек. 
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
 * Main
 * пользовательское приложение
 * составление списка заказов
 */
public class Main {

    public static void main(String[] args) {
        Set<Orders> orders = ProductData.createOrdersSet();

        runFilter(orders);
        
    }

    static void runFilter(Set<Orders> orders) {
        Set<Orders> filterOrders = new HashSet<>(orders);
        printOrders(filterOrders);
        int choice = chooseMainOptions();
        while (choice != case.length) { // "вместо числа пунктов вставить (?) 
                                        // "orders.length" или "case.length"
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
                    System.out.println("filter - price"); // ценник
                    filterPrice(filterOrders);
                    break;
                case 7:
                    filterOrders.addAll(orders);
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

