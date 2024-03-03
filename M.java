public class M extends Size{
    public M(Beverage beverage) {
        super(beverage);  
    }
    public String getOrder(){
        return beverage.getOrder()+" ขนาด M";
    }
    public int cost() {
        return 10 + beverage.cost();
    }
}
