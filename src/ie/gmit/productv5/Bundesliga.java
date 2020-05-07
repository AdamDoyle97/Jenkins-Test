package ie.gmit.productv5;

public class Bundesliga extends Ticket {
    private String Bundesliga;

    public Bundesliga() {
        super();
        Bundesliga = "";
        count++;
    }


    public void setBundesliga(String Bundesliga) {
        this.Bundesliga = Bundesliga;
    }

    public String getBundesliga() {
        return Bundesliga;
    }

    @Override
    public String toString() {
        return super.toString() + " " + Bundesliga;
    }
}
