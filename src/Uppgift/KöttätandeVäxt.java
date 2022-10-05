package Uppgift;

public class KöttätandeVäxt extends Växter implements BeräkningAvVätska {

    //inkapsling
    private final double basProteindryck = 0.1;

    //arv, växten ärver namn, längd och sort från superklassen Växter
    public KöttätandeVäxt(String namn, double längd, String växtSort) {
        super(namn, längd, växtSort);
    }

    //polymorfism, växten ärver metoden beräknaVätska från Super klassen Växter, men metoden beräknar olika saker för varje växt
    public double beräknaVätska(double längd){
        double köttätandeVäxtFormel = basProteindryck + (Näring.KÖTTÄTANDEVÄXT.talFörVätskeberäkning*längd);
        return köttätandeVäxtFormel;
    }

    //polymorfism, växten ärver metoden printMe från Super klassen Växter, men metoden skriver ut olika saker för varje växt
    public String printMe() {
        return getVäxtSort() + " " + getNamn() + " behöver " + beräknaVätska(getLängd()) +
                Näring.KÖTTÄTANDEVÄXT.volymenhet + Näring.KÖTTÄTANDEVÄXT.näringsTyp + Näring.KÖTTÄTANDEVÄXT.bevattningsIntervall;
    }

}


