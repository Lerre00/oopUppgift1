package Uppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//test för palmernas uträknigar
class PalmTest {
    Palm Laura = new Palm("Laura",5,"Palm");
    Palm Putte = new Palm("Putte",1,"Palm");

    @Test
    void isLauraFormulaCorrect() {

        assert(Laura.beräknaVätska(Laura.getLängd()) == 2.5); //kollar så värdet stämmer
        assert(Laura.beräknaVätska(Laura.getLängd()) != 5); //kollar så man inte får ut längden istället
        assert(Laura.beräknaVätska(Laura.getLängd()) != 25); //kollar så man inte får ut 5 gånger värdet istället

    }

    @Test
    void isPutteFormulaCorrect() {

        assert(Putte.beräknaVätska(Putte.getLängd()) == 0.5); //kollar så värdet stämmer
        assert(Putte.beräknaVätska(Putte.getLängd()) != 1); //kollar så man inte får ut längden istället
        assert(Putte.beräknaVätska(Putte.getLängd()) != 2.5); //kollar så man inte får ut 5 gånger värdet istället

    }


}