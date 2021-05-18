package fact.it.restaurantapp.model;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class Administrator extends ExtraTaak {

    public Administrator(){

    }

    public void update(){
        super.update();
        String update = "Vervolgens registreer ik de " + IngangTeller.getInstance().getAantal() + " klanten in het klantenbestand.";
        System.out.println(update);
    }
}
