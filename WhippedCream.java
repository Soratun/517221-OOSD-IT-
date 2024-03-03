public class WhippedCream extends Toppings{
    public WhippedCream(Beverage beverage) {
        super(beverage);  
    }
    public String getOrder(){
        return beverage.getOrder()+" วิปครีม";
    }
    public int cost() {
        return 20 + beverage.cost();
    }
}

