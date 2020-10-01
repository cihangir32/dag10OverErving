package org.example.joris.dag10OverErving;

import org.junit.jupiter.api.Test;

public class CardTests {

    @Test
    void equalsOpCard() {
        Card card1 = new Card();
        Card card2 = new Card();

        boolean equals = card1.equals(card2);
        System.out.println(equals);
    }
}
