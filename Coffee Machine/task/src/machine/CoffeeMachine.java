package machine;

import java.util.Scanner;


public class CoffeeMachine {
    public static int milk = 540;
    public static int water = 400;
    public static int coffeeBeans = 120;
    public static int cups = 9;
    public static int money = 550;
    public static CoffeeDrink espresso = new CoffeeDrink(250, 0,  16, 4);
    public static CoffeeDrink latte = new CoffeeDrink(350, 75, 20, 7);
    public static CoffeeDrink cappuccino = new CoffeeDrink(200, 100, 12, 6);


    public static void main(String[] args) {
        boolean power = true;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
                switch (input()) {
                    case "buy":
                        System.out.println();
                        buy();
                        System.out.println();
                        break;
                    case "fill":
                        System.out.println();
                        fill();
                        System.out.println();
                        break;
                    case "take":
                        System.out.println();
                        take();
                        System.out.println();
                        break;
                    case "remaining":
                        System.out.println();
                        remaining();
                        System.out.println();
                        break;
                    case "exit":
                        power = false;
                        break;
                }
        } while(power);

    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
        }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        switch (input()) {
            case "1":
                makeCoffee(espresso);
                break;
            case "2":
                makeCoffee(latte);
                break;
            case "3":
                makeCoffee(cappuccino);
                break;
            case "back":
                break;
        }
    }

    public static void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        water += Integer.parseInt(input());
        System.out.println("Write how many ml of milk do you want to add:");
        milk += Integer.parseInt(input());
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans += Integer.parseInt(input());
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += Integer.parseInt(input());
       }

    public static void take(){
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void remaining(){
        System.out.println("The coffee machine has:");
        System.out.println(water +  " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

    public static void makeCoffee(CoffeeDrink whatever){
        if (water < whatever.water){
            System.out.println("Sorry, not enough water!");
        } else if (milk < whatever.milk) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeBeans < whatever.coffeeBeans){
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < whatever.cups){
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= whatever.water;
            milk -= whatever.milk;
            coffeeBeans -= whatever.coffeeBeans;
            cups -= whatever.cups;
            money += whatever.money;
        }
    }

}