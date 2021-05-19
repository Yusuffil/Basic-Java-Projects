
public class Daire extends Sekil{
    private int yaricap;

    public Daire(String isim,int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    void calculateArea() {
        System.out.println(getIsim() + " ' nin alani : " + Math.PI*yaricap*yaricap);
    }
    
    
}
