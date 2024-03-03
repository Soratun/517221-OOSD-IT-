public class BrownSugarPearls extends Toppings{
    public BrownSugarPearls(Beverage beverage) {
        super(beverage);  
    }
    public String getOrder(){
        return beverage.getOrder()+" ไข่มุกบราวชู";
    }
    public int cost() {
        return 10 + beverage.cost();
    }
}
