package Uppgift;

//enum med värden för de olika växtsorter som finns
public enum Näring {
    KAKTUS ("centiliter ","vatten ", "dagligen", 2),
    PALM ("liter ","mineralvatten ","dagligen", 0.5),
    KÖTTÄTANDEVÄXT ("liter ","proteindryck ", "dagligen", 0.2);

    public final String volymenhet;
    public final String näringsTyp;
    public final String bevattningsIntervall;
    public final double talFörVätskeberäkning;

    Näring(String volymenhet, String näringsTyp, String bevattningsIntervall, double talFörVätskeberäkning){
        this.volymenhet = volymenhet;
        this.näringsTyp = näringsTyp;
        this.bevattningsIntervall = bevattningsIntervall;
        this.talFörVätskeberäkning = talFörVätskeberäkning;
    }
}
