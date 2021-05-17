public class Trade implements  ITradeServices{
    private String name;
    private int id;

    public Trade(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void buy(User user, Game game, Campain campain) {
        System.out.println(user.getFirstname()+" "+this.name +" adli oyunu " + "%"+campain.getPercentage() + " indirimle " +
                                            game.getUnitPrice(campain) + " TL ' ye aldi."  );
    }
}
