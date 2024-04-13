package Specialization.Test01.ToyStore.v1;

public class Orders {
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
/*
                "1. SoftToys (Мягкая игрушка)\n" +
                "2. Dolls (куклы)\n" +
                "3. BoardGames (настольные игры)\n" +
                "4. Constructors (конструкторы)\n" +
                "5. Weapons (оружие)\n" +
*/
    public Laptops(String softToy, String doll, String boardGame, 
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
