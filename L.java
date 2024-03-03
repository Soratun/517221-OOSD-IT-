public class L extends Size{
    public L(Beverage beverage) {
        super(beverage);  
    }
    public String getOrder(){
        return beverage.getOrder()+" ขนาด L";
    }
    public int cost() {
        return 15 + beverage.cost();
    }
}
