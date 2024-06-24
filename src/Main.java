public class Main {
    public static void main(String[] args) {
        Refrigorator refrigorator = new Refrigorator();
        DishWasher dishWasher = new DishWasher();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        SmartKitchen sk = new SmartKitchen(refrigorator, dishWasher, coffeeMaker);
        sk.addWater();
        sk.pourMilk();
        sk.loadDishWasher();
        System.out.println("____");

        sk.setKitchenWork(true, false, true);
        sk.doKitchenWork();
        System.out.println("____");
        sk.setKitchenWork(true, true, true);
        sk.doKitchenWork();
    }
}
