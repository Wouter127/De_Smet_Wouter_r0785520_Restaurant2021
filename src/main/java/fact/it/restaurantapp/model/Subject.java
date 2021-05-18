package fact.it.restaurantapp.model;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Subject {
    private ArrayList<Personeel> observers = new ArrayList();

    public Subject() {
    }

    public void attachObserver(Personeel observer) {
        this.observers.add(observer);
    }

    public void detachObserver(Personeel observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for(Personeel observer : observers){
            observer.update();
        }
    }

    public ArrayList<Personeel> getObservers() {
        return this.observers;
    }

    public void setObservers(ArrayList<Personeel> observers) {
        this.observers = observers;
    }
}
