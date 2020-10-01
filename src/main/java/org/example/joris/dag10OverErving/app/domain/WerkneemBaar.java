package org.example.joris.dag10OverErving.app.domain;

public interface WerkneemBaar {

//    private int id;
//    private String naam;

//    public Werknemer(int id, String naam) {
//        setId(id);
//        setNaam(naam);
//    }

    public abstract void setId(int id) ;

    public abstract int getId();

    public abstract void setNaam(String naam);

    public abstract String getNaam() ;

    public abstract int getSalaris();
}
