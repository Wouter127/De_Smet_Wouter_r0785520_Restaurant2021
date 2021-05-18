package fact.it.restaurantapp.model;

public class Poetspersoon extends ExtraTaak{

    public Poetspersoon() {
    }

    public void schoonMaken(){
        String naam = this.getPersoneel().getNaam();
        String output = "Ik ben " + naam + " en ik ga nu ook schoonmaken";
        System.out.println(output);
    }

}
