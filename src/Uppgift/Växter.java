package Uppgift;

public class Växter implements printMe{

    //inkapsling
    private double längd;
    private String namn;
    private String växtSort;

    public String getNamn() {
        return namn;
    }

    public double getLängd() {
        return längd;
    }

    public String getVäxtSort() {
        return växtSort;
    }

    public Växter(String namn, double längd, String växtSort) {
        this.namn = namn;
        this.längd = längd;
        this.växtSort = växtSort;
    }

    @Override
    public String toString() {
        return växtSort + " " + namn;
    }

    @Override
    public String printMe() {
        return "";
    }
}
