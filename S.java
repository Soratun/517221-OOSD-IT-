public class S extends Size{
    public S(Beverage beverage) {
        super(beverage);  
    }
    public String getOrder(){
        return beverage.getOrder()+" ขนาด S";
    }
    public int cost() {
        return 0 + beverage.cost();
    }
}
