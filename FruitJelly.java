public class FruitJelly extends Toppings{
    public FruitJelly(Beverage beverage) {
        super(beverage);  
    }
    public String getOrder(){
        return beverage.getOrder()+" วุ้นผลไม้";
    }
    public int cost() {
        return 15 + beverage.cost();
    }
}
