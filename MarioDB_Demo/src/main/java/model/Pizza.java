package model;

public class Pizza {

    public int nummer;
    public String navn;
    public String fyld;
    public int pris;

    public Pizza(int nummer, String navn, String fyld, int pris) {
        this.nummer = nummer;
        this.navn = navn;
        this.fyld = fyld;
        this.pris = pris;

    }

    public Pizza() {

    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getNummer() {
        return nummer;
    }

    public String getNavn() {
        return navn;
    }

    public String getFyld() {
        return fyld;
    }

    public int getPris() {
        return pris;
    }

    @Override
    public String toString() {
        return nummer + " " + navn + " " + fyld + " " + pris;
    }
}
