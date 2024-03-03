public abstract class Beverage
{
    protected String ordermenutype = "Unknown Beverage";
    private String id;
    public void setId(String i){
        id = i;
    }
    public String getId(){
        return id;
    }
    public String getOrder() {
        return ordermenutype;
    }
    public abstract int cost();
}
