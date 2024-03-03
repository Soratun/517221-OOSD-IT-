import java.util.Scanner;

public class Test{
    protected static Beverage beverage;
    public static void main(String[] args) {
        DB d = new DB();
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(true){
            System.out.println("กาแฟ กด 1 / ชา กด 2");
            int x = sc.nextInt();
            if(x == 1){
                System.out.println("Id กาแฟ");
                System.out.print("Americano = 1, Espresso = 2, Cappuchino = 3 , Mocha = 4 ,Latte = 5");
                x = sc.nextInt();
                if(x == 1){
                    beverage = new Americano();
                }else if(x == 2){
                    beverage = new Espresso();
                }
                else if(x == 3){
                    beverage = new Cappuchino();
                }
                else if(x == 4){
                    beverage = new Mocha();
                }
                else{
                    beverage = new Latte();
                }
            }else if(x == 2){
                System.out.println("Id ชา");
                System.out.print("FruitTea = 1, LemonIcedTea = 2, GreenTea = 3 , IcedTea = 4 ,IcedMilkTea = 5");
                x = sc.nextInt();
                if(x == 1){
                    beverage = new fruit_tea();
                }else if(x == 2){
                    beverage = new Lemon_Iced_Tea();
                }
                else if(x == 3){
                    beverage = new Green_Tea();
                }
                else if(x == 4){
                    beverage = new Iced_Tea();
                }
                else{
                    beverage = new Iced_Milk_Tea();
                }
            }
            System.out.println("รับแก้วขนาดไหนดีครับ");
            System.out.println("S กด1 ,M กด2  ,L กด3");
            x = sc.nextInt();
            if(x == 1){
                beverage = new S(beverage);
            }else if(x == 2){
                beverage = new M(beverage);
            }else if(x == 3){
                beverage = new L(beverage);
            }
            System.out.println("รับท็อปปิ้ง กด 1 / ไม่รับ กด 2");
            x = sc.nextInt();
            if(x == 1){
                System.out.println("Id ท็อปปิ้ง");
                System.out.print("FruitJelly =1,AddShots=2,FruitSalad=3,MilkCream=4,WhippedCream=5,BrownSugarPearls=6");
                x = sc.nextInt();
                if(x == 1){
                    beverage = new FruitJelly(beverage);
                }else if(x == 2){
                    beverage = new AddShots(beverage);
                }
                else if(x == 3){
                    beverage = new FruitSalad(beverage);
                }
                else if(x == 4){
                    beverage = new MilkCream(beverage);
                }
                else if(x == 5){
                    beverage = new WhippedCream(beverage);
                }else{
                    beverage = new BrownSugarPearls(beverage);
                }
            }
            System.out.println("รับเครื่องดื่มเพิ่มไหมครับ กด1 / ไม่รับกด2");
            x = sc.nextInt();
            if(x == 2){
                beverage.setId(String.valueOf(count));
                d.addproduct(beverage);
                break;
            }beverage.setId(String.valueOf(count));
            d.addproduct(beverage);
            count++;
        }
        
        int sum = d.printAll();
        System.out.println("ราคารวม "+sum);
        int x = sc.nextInt();
        System.out.println("ทอน " +(x-sum));
        System.out.println("โปรดรอสักครู่");
        d.deleteAll();
    }
    
}
