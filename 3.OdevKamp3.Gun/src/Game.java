public class Game extends Trade{

    private int unitPrice;
    private  int newUnitPrice;

    public Game(String name, int id) {
        super(name, id);
    }

    public Game(String name, int id, int unitPrice) {
        super(name,id);
        this.unitPrice = unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
    public int getUnitPrice(Campain campain) {
        int yuzde = campain.getPercentage();
        this.newUnitPrice = unitPrice -  yuzde*(unitPrice/100);
        return newUnitPrice;
    }



}
