package org.example.joris.dag10OverErving.app.domain;

import java.util.Comparator;

public class SortComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        return o2.compareTo(o1);
    }
}
