package fact.it.restaurantapp.model;

import javax.persistence.ManyToOne;

public abstract class ExtraTaak extends Personeel{
    @ManyToOne
    private Personeel personeel;

    public ExtraTaak() {
    }

    public Personeel getPersoneel() {
        return personeel;
    }

    public void setPersoneel(Personeel personeel) {
        this.personeel = personeel;
    }

    public void update(){
        this.personeel.update();
    }
}
