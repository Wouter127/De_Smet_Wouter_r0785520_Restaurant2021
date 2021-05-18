package fact.it.restaurantapp.model;

public class IngangTeller extends Subject{
    private int aantal;
    private static IngangTeller ingangTeller;

    private IngangTeller(){
    }

    public static IngangTeller getInstance(){
        if (ingangTeller == null){
            ingangTeller = new IngangTeller();
        }
        return ingangTeller;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
        this.notifyObservers();
    }
}
