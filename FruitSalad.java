public class FruitSalad extends Toppings{
    public FruitSalad(Beverage beverage) {
        super(beverage);  
    }
    public String getOrder(){
        return beverage.getOrder()+" ฟรุ๊ตสลัด";
    }
    public int cost() {
        return 5 + beverage.cost();
    }
}
