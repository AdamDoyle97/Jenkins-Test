package ie.gmit.productv1;

import java.util.Scanner;

public class TicketApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Ticket Viewer");
        System.out.println();

        // perform 1 or more selections
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter team code: ");
            String ticketCode = sc.nextLine();  // read the book code

            // get the book object
            Ticket yourTicket = TicketDB.getTicket(ticketCode);

            // display the output
            System.out.println();
            if (yourTicket != null) {
                System.out.println("Match: " + yourTicket.toString());
                System.out.println("Price:       " + yourTicket.getPriceFormatted());
            } else {
                System.out.println("No ticket matches this code.");
            }

            System.out.println();
            System.out.println("Ticket count: " + Ticket.getCount() + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }
}