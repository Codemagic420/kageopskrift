package Ingredienser;

public class Ingredienser {

    private String type;
    //ingredientser: smør, sukker, vaniljesukker, æg, hvedemel, bagepulver, kakao
    private double mængde;
    //fx 100.0 1.5 eller 4.0 x af noget
    private String måleEnhed;
    // gram, tsk., spsk.
    private int vægtPrEnhed;
    //her skal dl. l. osv. konverteres - så man ved hvor meget det vejer i gram
    private int oprindeligtAntal;
    //5 personer = 1007 gram
    //KJ total 16165 (3848 kcal)
    private double kcal;

    //Konstruktør 1
    public Ingredienser(String t, double m, String e, double kcal, int ps) {
        this.type = t;
        this.mængde = m;
        this.måleEnhed = e;
        this.kcal = kcal;
        this.oprindeligtAntal = ps;
    }
    //Konstruktør 2
    public Ingredienser(String t, double m, String e, double kcal, int ps, int vpe) {
        this.type = t;
        this.mængde = m;
        this.måleEnhed = e;
        this.kcal = kcal;
        this.oprindeligtAntal =ps;
        this.vægtPrEnhed = vpe;
    }

    public double getMængde() {

        return mængde;
    }

    public String getMåleEnhed() {

        return måleEnhed;
    }

    public String getType() {
        return type;
    }

    public double getKcal() {
        return kcal;
    }
    public int getVægtPrEnhed() {
        return vægtPrEnhed;
    }

    public  int getOprindeligtAntal(){
        return oprindeligtAntal;
    }

    // formlen er (det nye antal divideret med det oprindeligt antal)
    public double omregnMængde(int antalPersoner) {
        return (mængde / 5) * antalPersoner; //int divideret med int
    }

    public double kcal (int antalPersoner) {
        return (kcal / 5) * antalPersoner;
    }

    public double vpe (int antalPersoner) {
        return (this.vægtPrEnhed / 5) * antalPersoner;
    }

    public void setMængde(double nyMængde){
        mængde = nyMængde;
    }
}





