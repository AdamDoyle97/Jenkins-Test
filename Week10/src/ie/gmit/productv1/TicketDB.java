package ie.gmit.productv1;

public class TicketDB {
    public static Ticket getTicket(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or datamyBookase
        // For now, this code just uses if/else statements
        // to return the correct product data


        Ticket myTicket = new Ticket();
        if (productCode.equalsIgnoreCase("liverpool")) {
            myTicket.setTicketCode(productCode);
            myTicket.setMatch("Liverpool vs Chelsea");
            myTicket.setDate("April 4th");
            myTicket.setLocation("Stanford Bridge");
            myTicket.setSeatNumber("20B");
            myTicket.setTicketNumber("1234C787");
            myTicket.setPrice(65.00);
        } else if (productCode.equalsIgnoreCase("city")) {
            myTicket.setTicketCode(productCode);
            myTicket.setMatch("Man City vs Liverpool");
            myTicket.setDate("April 10th");
            myTicket.setLocation("Eithad Stadium");
            myTicket.setSeatNumber("345C");
            myTicket.setTicketNumber("234D2");
            myTicket.setPrice(55.34);
        } else if (productCode.equalsIgnoreCase("liverpool")) {
            myTicket.setTicketCode(productCode);
            myTicket.setMatch("Liverpool vs Man United");
            myTicket.setDate("May 12th");
            myTicket.setLocation("Anfield Stadium");
            myTicket.setSeatNumber("68F");
            myTicket.setTicketNumber("124A34");
            myTicket.setPrice(49.90);
        }
        return myTicket;
    }
}
