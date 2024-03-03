public class MilkCream extends Toppings{
    public MilkCream(Beverage beverage) {
        super(beverage);  
    }
    public String getOrder(){
        return beverage.getOrder()+" ครีมนม";
    }
    public int cost() {
        return 10 + beverage.cost();
    }
}
