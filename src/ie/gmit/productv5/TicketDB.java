package ie.gmit.productv5;

import ie.gmit.productv5.EPL;
import ie.gmit.productv5.Ticket;
import ie.gmit.productv5.LaLiga;

public class TicketDB {

    public static Ticket getTicket(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Ticket p = null;

        if (productCode.equalsIgnoreCase("liverpool")
                || productCode.equalsIgnoreCase("city")
                || productCode.equalsIgnoreCase("united")) {
            EPL b = new EPL();
            if (productCode.equalsIgnoreCase("liverpool")) {
                b.setTicketCode(productCode);
                b.setMatch("Liverpool vs Chelsea");
                b.setDate("April 4th");
                b.setLocation("Stanford Bridge");
                b.setSeatNumber("20B");
                b.setTicketNumber("1234C787");
                b.setPrice(65.00);
            } else if (productCode.equalsIgnoreCase("city")) {
                b.setTicketCode(productCode);
                b.setMatch("Man City vs Liverpool");
                b.setDate("April 10th");
                b.setLocation("Eithad Stadium");
                b.setSeatNumber("345C");
                b.setTicketNumber("234D2");
                b.setPrice(55.34);
            } else if (productCode.equalsIgnoreCase("united")) {
                b.setTicketCode(productCode);
                b.setMatch("Liverpool vs Man United");
                b.setDate("May 12th");
                b.setLocation("Anfield Stadium");
                b.setSeatNumber("68F");
                b.setTicketNumber("124A34");
                b.setPrice(49.90);
            }
            p = b; // set Product object equal to the Book object
            } else if (productCode.equalsIgnoreCase("madrid")
                || productCode.equalsIgnoreCase("barca")
                || productCode.equalsIgnoreCase("atletico")) {
            LaLiga s = new LaLiga();
            if (productCode.equalsIgnoreCase("madrid")) {
                s.setTicketCode(productCode);
                s.setMatch("Real vs Barca");
                s.setDate("May 3rd");
                s.setLocation("Santiago Bernabu");
                s.setSeatNumber("69C");
                s.setTicketNumber("125CB1");
                s.setPrice(90.00);
            } else if (productCode.equalsIgnoreCase("barca")) {
                s.setTicketCode(productCode);
                s.setMatch("Barcelona vs Malaga");
                s.setDate("Feb 12th");
                s.setLocation("Barcelona Stadium");
                s.setSeatNumber("20A");
                s.setTicketNumber("74CF213");
                s.setPrice(65.00);
                //p = s; // set Product object equal to the Software object
            } else if (productCode.equalsIgnoreCase("atletico")) {
                s.setTicketCode(productCode);
                s.setMatch("Atletico vs Real Madrid");
                s.setDate("March 20th");
                s.setLocation("Atletico Stadium");
                s.setSeatNumber("51S");
                s.setTicketNumber("124F65");
                s.setPrice(39.90);
            }
            p = s; // set Product object equal to the Software object
        } else if (productCode.equalsIgnoreCase("bayern")
                    || productCode.equalsIgnoreCase("dortmund")
                    || productCode.equalsIgnoreCase("schalke")) {
                Bundesliga g = new Bundesliga();
                if (productCode.equalsIgnoreCase("bayern")) {
                    g.setTicketCode(productCode);
                    g.setMatch("Real vs Bayern");
                    g.setDate("May 3rd");
                    g.setLocation("Santiago Bernabu");
                    g.setSeatNumber("69C");
                    g.setTicketNumber("125CB1");
                    g.setPrice(90.00);
                } else if (productCode.equalsIgnoreCase("dortmund")) {
                    g.setTicketCode(productCode);
                    g.setMatch("Dortmund vs Malaga");
                    g.setDate("Feb 12th");
                    g.setLocation("Barcelona Stadium");
                    g.setSeatNumber("20A");
                    g.setTicketNumber("74CF213");
                    g.setPrice(65.00);
                    p = g; // set Product object equal to the Software object
                } else if (productCode.equalsIgnoreCase("schalke")) {
                    g.setTicketCode(productCode);
                    g.setMatch("Schalke vs Real Madrid");
                    g.setDate("March 20th");
                    g.setLocation("Atletico Stadium");
                    g.setSeatNumber("51S");
                    g.setTicketNumber("124F65");
                    g.setPrice(39.90);
                }
            p = g; // set Product object equal to the Software object
        } else if (productCode.equalsIgnoreCase("psg")
                || productCode.equalsIgnoreCase("marseille")
                || productCode.equalsIgnoreCase("lile")) {
            Ligue1 l = new Ligue1();
            if (productCode.equalsIgnoreCase("psg")) {
                l.setTicketCode(productCode);
                l.setMatch("PSG vs Bayern");
                l.setDate("May 3rd");
                l.setLocation("Santiago Bernabu");
                l.setSeatNumber("69C");
                l.setTicketNumber("125CB1");
                l.setPrice(90.00);
            } else if (productCode.equalsIgnoreCase("marseille")) {
                l.setTicketCode(productCode);
                l.setMatch("Marseille vs Malaga");
                l.setDate("Feb 12th");
                l.setLocation("Barcelona Stadium");
                l.setSeatNumber("20A");
                l.setTicketNumber("74CF213");
                l.setPrice(65.00);
                p = l; // set Product object equal to the Software object
            } else if (productCode.equalsIgnoreCase("lile")) {
                l.setTicketCode(productCode);
                l.setMatch("Lile vs Real Madrid");
                l.setDate("March 20th");
                l.setLocation("Atletico Stadium");
                l.setSeatNumber("51S");
                l.setTicketNumber("124F65");
                l.setPrice(39.90);
            }
            p = l; // set Product object equal to the Software object
        }
        return p;
    }
}