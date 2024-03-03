public abstract class Size extends Beverage{
    protected Beverage beverage;
    public Size(Beverage beverage){
        this.beverage = beverage;
    }
    public abstract String getOrder();
    public int cost() {
        return 0 + beverage.cost();
    }
}
