public class SmartKitchen {

    private Refrigorator refrigorator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen(Refrigorator refrigorator, DishWasher dishWasher, CoffeeMaker coffeeMaker) {
        this.refrigorator = refrigorator;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeeMaker;
    }

    public void addWater(){
        coffeeMaker.performTask();
    }

    public void pourMilk(){
        refrigorator.performTask();
    }

    public void loadDishWasher(){
        dishWasher.performTask();
    }

    public void doKitchenWork(){
        if(refrigorator.hasOngoingWork) refrigorator.doTask();
        if(dishWasher.hasOngoingWork) dishWasher.doTask();
        if(coffeeMaker.hasOngoingWork) coffeeMaker.doTask();
    }

    public void setKitchenWork(boolean RefrigoratarFlag, boolean CoffeeMakerFlag, boolean DishWasherFlag){
            refrigorator.setHasOngoingWork(RefrigoratarFlag);
            coffeeMaker.setHasOngoingWork(CoffeeMakerFlag);
            dishWasher.setHasOngoingWork(DishWasherFlag);
    }

    @Override
    public String toString() {
        return "SmartKitchen{" +
                "refrigorator=" + refrigorator +
                ", dishWasher=" + dishWasher +
                ", coffeeMaker=" + coffeeMaker +
                '}';
    }
}

class KitchenParts {
    protected boolean hasOngoingWork;
    public void performTask(){
        this.hasOngoingWork = true;
        doTask();
    }

    public boolean isHasOngoingWork() {
        return hasOngoingWork;
    }

    public void setHasOngoingWork(boolean hasOngoingWork) {
        this.hasOngoingWork = hasOngoingWork;
    }

    public void doTask(){}
}

class Refrigorator extends KitchenParts{
    @Override
    public void doTask() {
        System.out.println("Ordering food ");
        hasOngoingWork = false;
    }

    @Override
    public String toString() {
        return "Refrigorator{" +
                "hasOngoingWork=" + hasOngoingWork +
                "} ";
    }
}

class DishWasher extends KitchenParts{
    @Override
    public void doTask() {
        System.out.println("Washing Dishes ");
        hasOngoingWork = false;
    }

    @Override
    public String toString() {
        return "DishWasher{" +
                "hasOngoingWork=" + hasOngoingWork +
                "} " ;
    }
}

class CoffeeMaker extends KitchenParts {
    @Override
    public void doTask() {
        System.out.println("Brewing Coffee ");
        hasOngoingWork = false;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{} " ;
    }
}
