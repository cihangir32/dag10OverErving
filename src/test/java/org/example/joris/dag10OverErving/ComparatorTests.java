package org.example.joris.dag10OverErving;

import org.example.joris.dag10OverErving.app.domain.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorTests {

    @Test
    void eenAantalWerknemersSorterenOpSalaris1() {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(5);
        integerList.add(3);
        integerList.add(2);
        integerList.add(100);

        System.out.println("Voor de sortering" + integerList);

        Collections.sort(integerList, new SortComparator());

        System.out.println("Na de sortering" + integerList);

    }


    @Test
    void eenAantalWerknemersSorterenOpSalaris() {
        Werknemer v1 = new VasteWerknemer(1, "Sjoerd", 3);
        Werknemer v2 = new VasteWerknemer(3, "Dave", 7);
        Werknemer v3 = new VasteWerknemer(6, "Jan", 5);
        Werknemer v4 = new VasteWerknemer(9, "Koem", 4);

        List<Object> objectList = new ArrayList<>();

        objectList.add(v1);
        objectList.add(v2);
        objectList.add(v3);
        objectList.add(v4);


        System.out.println("Salaris test " + v1.getSalaris());
        System.out.println(" ");


        System.out.println("Voor de sortering " + objectList);
        System.out.println(" ");

        Collections.sort(objectList, new WerknemerSalarisComparator());

        System.out.println("Na de sortering " + objectList);
        System.out.println(" ");

        for (int Teller = 0; Teller < objectList.size(); Teller++) {
            System.out.println(objectList.get(Teller));
        }
    }

    @Test
    void eenAantalWerknemersSorterenOpId() {
        Werknemer v1 = new VasteWerknemer(1, "Sjoerd", 3);
        Werknemer v2 = new VasteWerknemer(3, "Dave", 7);
        Werknemer v3 = new VasteWerknemer(6, "Jan", 5);
        Werknemer v4 = new VasteWerknemer(9, "Koem", 4);

        List<Object> objectList = new ArrayList<>();

        objectList.add(v1);
        objectList.add(v2);
        objectList.add(v3);
        objectList.add(v4);


        System.out.println("Id test " + v1.getId());
        System.out.println(" ");


        System.out.println("Voor de sortering " + objectList);
        System.out.println(" ");

        Collections.sort(objectList, new WerknemerIdComparator());

        System.out.println("Na de sortering " + objectList);
        System.out.println(" ");

        for (int Teller = 0; Teller < objectList.size(); Teller++) {
            System.out.println(objectList.get(Teller));
        }
    }

    @Test
    void eenAantalWerknemersSorterenOpNaam() {
        Werknemer v1 = new VasteWerknemer(1, "Sjoerd", 3);
        Werknemer v2 = new VasteWerknemer(3, "Dave", 7);
        Werknemer v3 = new VasteWerknemer(6, "Jan", 5);
        Werknemer v4 = new VasteWerknemer(9, "Koem", 4);

        List<Object> objectList = new ArrayList<>();

        objectList.add(v1);
        objectList.add(v2);
        objectList.add(v3);
        objectList.add(v4);


        System.out.println("Naam test " + v1.getNaam());
        System.out.println(" ");


        System.out.println("Voor de sortering " + objectList);
        System.out.println(" ");

        Collections.sort(objectList, new WerknemerNaamComparator());

        System.out.println("Na de sortering " + objectList);
        System.out.println(" ");

        for (int Teller = 0; Teller < objectList.size(); Teller++) {
            System.out.println(objectList.get(Teller));
        }
    }

}




//    @Test
//    void eenAantalWerknemersSorterenOpSalaris() {
//
//        WerkneemBaar[] werkneemBaren = getWerkneemBaren();
//
//        printWerkneembaren(werkneemBaren);
//
//
//        Arrays.sort(werkneemBaren, new WerknemerSalarisComparator());
//
//        printWerkneembaren(werkneemBaren);
//    }
//
//    private WerkneemBaar[] getWerkneemBaren() {
//        Werknemer v1 = new VasteWerknemer(1, "Sjoerd", 12);
//        Werknemer v2 = new VasteWerknemer(3, "Dave", 15);
//        Werknemer t1 = new TijdelijkeWerknemer(2, "Evan", 40, 250);
//        Werknemer t2 = new TijdelijkeWerknemer(4, "Sam", 40, 250);
//
//        return new WerkneemBaar[]{v1, v2, t1, t2};
//    }
//
//    private void printWerkneembaren(WerkneemBaar[] werkneemBaren) {
//        for (WerkneemBaar w : werkneemBaren) {
//            System.out.println(w.getNaam() + " met id " + w.getId() + " verdient " + w.getSalaris());
//        }
//    }
//}

