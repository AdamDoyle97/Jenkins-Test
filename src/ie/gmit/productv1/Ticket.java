package ie.gmit.productv1;

import java.text.NumberFormat;

public class Ticket {
    private String ticketCode;
    private String seatNumber;
    private String match;
    private String location;
    private String date;
    private String ticketNumber;
    private double price;
    protected static int count = 0;

    public Ticket() {
        ticketCode = "";
        seatNumber = "";
        match = "";
        location = "";
        date = "";
        ticketNumber = "";
        price = 0.0;
        count++;
    }

    public String getTicketCode() { return ticketCode; }

    public void setTicketCode(String ticketCode) { this.ticketCode = ticketCode; }

    public String getSeatNumber() { return seatNumber; }

    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }

    public String getMatch() { return match; }

    public void setMatch(String match) { this.match = match; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getTicketNumber() { return ticketNumber; }

    public void setTicketNumber(String ticketNumber) { this.ticketNumber = ticketNumber; }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString() {
        return match + "\nat: " + location + "\ndate: " + date + "\nSeat No. " + seatNumber + "\nTicket No. " + ticketNumber;
    }

    public static int getCount() {
        return count;
    }
}
