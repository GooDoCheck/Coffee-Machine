package machine;

public class CoffeeDrink {
    public int milk;
    public int water;
    public int coffeeBeans;
    public int cups = 1;
    public int money;
    CoffeeDrink(int water, int milk, int coffeeBeans, int money){
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.money = money;
    }
    /*CoffeeDrink(int water, int coffeeBeans, int money){
        this.water = water;
        this.coffeeBeans = coffeeBeans;
        this.money = money;
    }*/
}
