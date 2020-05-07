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
                p = s; // set Product object equal to the Software object
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
        }
        return p;
    }
}