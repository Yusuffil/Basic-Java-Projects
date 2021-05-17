

public class Campain implements ICampaınServices{
    private String name;
    private int id;
    private int percentage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public Campain(String name, int id, int percentage) {
        this.name = name;
        this.id = id;
        this.percentage = percentage;
    }

    @Override
    public void addCampain(Campain campain) {
        this.name = name;
        this.id = id;
        this.percentage = percentage;
        System.out.println("Kampanya olusturuldu.");

    }

    @Override
    public void updateCampain(Campain campain) {
        this.name = name;
        this.id = id;
        this.percentage = percentage;
        System.out.println("Kampanya guncellendi.");
    }

    @Override
    public void deleteCampain(Campain campain) {
        this.name = "0";
        this.id = 0;
        this.percentage = 0;
        System.out.println("Kampanya silindi.");
    }
}


