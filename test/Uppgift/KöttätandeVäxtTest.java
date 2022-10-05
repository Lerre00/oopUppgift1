package Uppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxtTest {

    KöttätandeVäxt Meatloaf = new KöttätandeVäxt("Meatloaf",0.7,"Köttätande växt");

    @Test
    void isCarnivorousPlantFormulaCorrect() {

        assert(Meatloaf.beräknaVätska(Meatloaf.getLängd()) == 0.24);
        assert(Meatloaf.beräknaVätska(Meatloaf.getLängd()) != 0.7);
        assert(Meatloaf.beräknaVätska(Meatloaf.getLängd()) != 1.5); // kollar så programmet inte multiplicerar med 2 istället för 0.2

    }

}