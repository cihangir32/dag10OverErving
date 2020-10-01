package org.example.joris.dag10OverErving.app.domain;

public abstract class Werknemer implements WerkneemBaar {
    private int id;
    private String naam;

    public Werknemer(int id, String naam) {
        setId(id);
        setNaam(naam);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return "Werknemer[id = " + getId() + " naam = " + getNaam();
    }

    public abstract int getSalaris();

//    @Override
//    public int compareTo(Object otherObject) {
//        WerkneemBaar otherWerkneembaar = (WerkneemBaar) otherObject;
//        //return this.getSalaris() - otherWerkneembaar.getSalaris();
//        return this.getId() - otherWerkneembaar.getId();
//    }
}
