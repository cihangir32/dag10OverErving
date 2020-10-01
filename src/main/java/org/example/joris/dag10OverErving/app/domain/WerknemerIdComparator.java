package org.example.joris.dag10OverErving.app.domain;

import java.util.Comparator;

public class WerknemerIdComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Werknemer w1 = (Werknemer) o1;
        Werknemer w2 = (Werknemer) o2;
        return w1.getId() - w2.getId();
    }

}
