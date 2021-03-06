package fact.it.restaurantapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Keukenpersoneel extends Personeel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Keukenpersoneel() {
    }

    public void update() {
        String naam = this.getNaam();
        String update = "Ik ben " + naam + " en ik begin onmiddellijk met het maken van " + IngangTeller.getInstance().getAantal() + " amuse-gueules!";
        System.out.println(update);
    }
}
