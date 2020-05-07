package ie.gmit.productv5;

public class LaLiga extends Ticket {

    private String laLiga;

    public LaLiga() {
        super();
        laLiga = "";
        count++;
    }


    public void setLaLiga(String laLiga) {
        this.laLiga = laLiga;
    }

    public String getLaLiga() {
        return laLiga;
    }

    @Override
    public String toString() {
        return super.toString() + " " + laLiga;
    }
}
