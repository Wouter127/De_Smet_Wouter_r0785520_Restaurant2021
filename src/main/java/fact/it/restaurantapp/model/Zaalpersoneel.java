package fact.it.restaurantapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Zaalpersoneel extends Personeel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Zaalpersoneel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void update() {
        String naam = this.getNaam();
        String update = "Ik ben " + naam + " en ga het nodige doen om voor " + IngangTeller.getInstance().getAantal() + " klanten een tafel klaar te maken.";
        System.out.println(update);
    }

}
