package fact.it.restaurantapp.model;

public class NormaleBetaling implements BetaalStrategie {

    public NormaleBetaling() {
    }

    public double getToegepastePrijs(double actuelePrijs) {
        return actuelePrijs;
    }
}

