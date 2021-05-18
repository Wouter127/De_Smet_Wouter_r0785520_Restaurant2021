package fact.it.restaurantapp.model;

public class HappyHourBetaling implements BetaalStrategie {
    public HappyHourBetaling() {
    }

    public double getToegepastePrijs(double actuelePrijs){
        return actuelePrijs * 0.8;
    }
}
