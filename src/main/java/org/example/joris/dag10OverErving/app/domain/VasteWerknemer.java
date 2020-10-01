package org.example.joris.dag10OverErving.app.domain;

public class VasteWerknemer extends Werknemer{


    private int salarisSchaal;

    public VasteWerknemer(int id, String naam, int salarisSchaal) {
        super(id,naam);
        setSalarisSchaal(salarisSchaal);
    }



    public void setSalarisSchaal(int salarisSchaal) {
        this.salarisSchaal = salarisSchaal;
    }

    public int getSalarisSchaal() {
        return salarisSchaal;
    }

    public String toString(){
        return "Vaste" + super.toString() + " en salarisSchaal = " + salarisSchaal+ "]";
    }

    public int getSalaris(){
        return salarisSchaal* 1000;
    }



}
