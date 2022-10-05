package Uppgift;

public class Kaktus extends Växter{

    //arv, växten ärver namn, längd och sort från superklassen Växter
    public Kaktus(String namn, double längd, String växtSort) {
        super(namn, längd, växtSort);
    }

    //polymorfism, växten ärver metoden printMe från Super klassen Växter, men metoden skriver ut olika saker för varje växt
    public String printMe() {
        return getVäxtSort() + " " + getNamn() + " behöver " + Näring.KAKTUS.talFörVätskeberäkning +
                Näring.KAKTUS.volymenhet + Näring.KAKTUS.näringsTyp + Näring.KAKTUS.bevattningsIntervall;
    }
}
