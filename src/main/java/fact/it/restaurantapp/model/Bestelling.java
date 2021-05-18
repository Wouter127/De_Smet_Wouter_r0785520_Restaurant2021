package fact.it.restaurantapp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

@Entity
public class Bestelling {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private GregorianCalendar datum;
    private boolean betaald;

    @ManyToOne
    private Tafel tafel;

    @ManyToOne
    private Zaalpersoneel zaalpersoneel;

    @OneToMany(mappedBy = "bestelling", cascade = CascadeType.PERSIST)
    List<BesteldItem> besteldItems = new ArrayList();

    @Transient
    private BetaalStrategie betaalStrategie = new NormaleBetaling();

    public Bestelling() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public GregorianCalendar getDatum() {
        return datum;
    }

    public void setDatum(GregorianCalendar datum) {
        this.datum = datum;
    }

    public boolean isBetaald() {
        return betaald;
    }

    public void setBetaald(boolean betaald) {
        this.betaald = betaald;
    }

    public Tafel getTafel() {
        return tafel;
    }

    public void setTafel(Tafel tafel) {
        this.tafel = tafel;
    }

    public Zaalpersoneel getZaalpersoneel() {
        return zaalpersoneel;
    }

    public void setZaalpersoneel(Zaalpersoneel zaalpersoneel) {
        this.zaalpersoneel = zaalpersoneel;
    }

    public List<BesteldItem> getBesteldItems() {
        return besteldItems;
    }

    public void setBesteldItems(List<BesteldItem> besteldItems) {
        this.besteldItems = besteldItems;
    }

    public BetaalStrategie getBetaalStrategie() {
        return betaalStrategie;
    }

    public void setBetaalStrategie(BetaalStrategie betaalStrategie) {
        this.betaalStrategie = betaalStrategie;
    }

    public void addItem(Gerecht gerecht, int aantal){
        BesteldItem besteldItem = new BesteldItem();
        besteldItem.setAantal(aantal);
        besteldItem.setGerecht(gerecht);
        besteldItem.setBestelling(this);
        besteldItem.setToegepastePrijs(this.betaalStrategie.getToegepastePrijs(gerecht.getActuelePrijs()));
        this.besteldItems.add(besteldItem);
    }

    public double getTotaal(){
        double totaal = 0.0;

        BesteldItem besteldItem;
        for(Iterator i = this.besteldItems.iterator();
            i.hasNext();
            totaal += (double)besteldItem.getAantal() * besteldItem.getToegepastePrijs())
        {
            besteldItem = (BesteldItem)i.next();
        }

        return totaal;
    }
}
