/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariospizzabar;

/**
 *
 * @author Cecilie
 */
public class Pizza {
    public int nummer;
    public String navn;
    public String[] fyld;
    public int pris;
    public boolean nyhed;

    public Pizza(int nummer, String navn, String[] fyld, int pris, boolean nyhed) {
        this.nummer = nummer;
        this.navn = navn;
        this.fyld = fyld;
        this.pris = pris;
        this.nyhed = nyhed;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String[] getFyld() {
        return fyld;
    }

    public void setFyld(String[] fyld) {
        this.fyld = fyld;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public boolean getNyhed() {
        return nyhed;
    }

    public void setNyhed(boolean nyhed) {
        this.nyhed = nyhed;
    }

    @Override
    public String toString() {
        return "Pizza{" + "nummer=" + nummer + ", navn=" + navn + ", fyld=" + fyld + ", pris=" + pris + ", nyhed=" + nyhed + '}';
    }
    
 
   }
   
