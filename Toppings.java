public abstract class Toppings extends Beverage{
    protected Beverage beverage;
    public Toppings(Beverage beverage){
        this.beverage = beverage;
    }
    public abstract String getOrder();
    public int cost() {
        return 0 + beverage.cost();
    }
}
