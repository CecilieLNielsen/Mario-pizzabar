package mariospizzabarNy;

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

    @Override
    public String toString() {
        String str = "Pizza{" + "nummer=" + nummer + ", navn=" + navn + ", fyld=";
        for (String temp : fyld) {
            str += temp + " ";
        }
        str += "pris=" + pris + ", nyhed=" + nyhed + '}';

        return str;
    }
}
