package Uppgift;

public class Palm extends Växter implements BeräkningAvVätska{

    //arv, växten ärver namn, längd och sort från superklassen Växter
    public Palm(String namn, double längd, String växtSort) {
        super(namn, längd, växtSort);
    }

    //polymorfism, växten ärver metoden beräknaVätska från Super klassen Växter, men metoden beräknar olika saker för varje växt
    public double beräknaVätska(double längd) {
        double palmFormel = Näring.PALM.talFörVätskeberäkning * längd;
        return palmFormel;
    }

    //polymorfism, växten ärver metoden printMe från Super klassen Växter, men metoden skriver ut olika saker för varje växt
    public String printMe() {
        return getVäxtSort() + " " + getNamn() + " behöver " + beräknaVätska(getLängd()) +
                Näring.PALM.volymenhet + Näring.PALM.näringsTyp + Näring.PALM.bevattningsIntervall;
    }
}
