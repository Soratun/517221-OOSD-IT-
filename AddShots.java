public class AddShots extends Toppings{
    public AddShots(Beverage beverage) {
        super(beverage);  
    }
    public String getOrder(){
        return beverage.getOrder()+" เพิ่มช็อตกาแฟ";
    }
    public int cost() {
        return 10 + beverage.cost();
    }
}
