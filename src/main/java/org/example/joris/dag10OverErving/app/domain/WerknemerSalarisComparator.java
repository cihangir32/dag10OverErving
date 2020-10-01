package org.example.joris.dag10OverErving.app.domain;

import java.util.Comparator;

public class WerknemerSalarisComparator implements Comparator {

//    @Override
//    public int compare(Object o1, Object o2) {
//        VasteWerknemer w1 = (VasteWerknemer) o1;
//        VasteWerknemer w2 = (VasteWerknemer) o2;
//        return w1.getSalarisSchaal() - w2.getSalarisSchaal();
//    }

    @Override
    public int compare(Object o1, Object o2) {
        Werknemer w1 = (Werknemer) o1;
        Werknemer w2 = (Werknemer) o2;
        return w1.getSalaris() - w2.getSalaris();
    }
}
