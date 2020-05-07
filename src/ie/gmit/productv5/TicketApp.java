package ie.gmit.productv5;


import ie.gmit.productv5.TicketDB;
import ie.gmit.productv5.Ticket;

import java.util.Scanner;

public class TicketApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Ticket Viewer");
        System.out.println();

        // perform 1 or more selections
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Scanner country = new Scanner(System.in);
        Scanner team = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Here is a list of the countries we have tickets for:\n1. England\n2. Spain\n3. Germany\n4. France \nPlease pick a country: ");
            int countryCode = Integer.parseInt(country.nextLine());  // read the product code
            if(countryCode == 1){
                System.out.print("\nYou have chosen English teams \nThe following teams have tickets available for matches. Please pick\n\n1. Liverpool\n2. City\n3. Man United");
                int teamCode = Integer.parseInt(team.nextLine());  // read the product code
                switch (teamCode){
                    case 1: liverpool();
                        System.out.print("Continue? (y/n): ");
                        choice = sc.nextLine();
                        System.out.println();
                        break;
                    case 2: city();
                        System.out.print("Continue? (y/n): ");
                        choice = sc.nextLine();
                        System.out.println();
                        break;
                    case 3: united();
                        System.out.print("Continue? (y/n): ");
                        choice = sc.nextLine();
                        System.out.println();
                        break;
                    default:  System.out.print("\nInvalid ");

                }

            }
            else if (countryCode == 2){
                System.out.print("\nYou have chosen Spanish teams \nThe following teams have tickets available for matches. Please pick\n\n1. Real Madrid\n2. Barcelona\n3. Atletico Madrid");
                int teamCode = Integer.parseInt(team.nextLine());  // read the product code
                switch (teamCode){
                    case 1: realmadrid();
                        System.out.print("Continue? (y/n): ");
                        choice = sc.nextLine();
                        System.out.println();
                        break;
                    case 2: barca();
                        System.out.print("Continue? (y/n): ");
                        choice = sc.nextLine();
                        System.out.println();
                        break;
                    case 3: atletico();
                        System.out.print("Continue? (y/n): ");
                        choice = sc.nextLine();
                        System.out.println();
                        break;
                    default:  System.out.print("\nInvalid ");

                }
            }
            else if (countryCode == 3){
                System.out.print("\nYou have chosen German teams \nThe following teams have tickets available for matches. Please pick\n\n1. Bayern Munich\n2. Borrussia Dortmund\n3. FC Schalke 04");
                int teamCode = Integer.parseInt(team.nextLine());  // read the product code
                switch (teamCode){
                    case 1: bayern();
                        System.out.print("Continue? (y/n): ");
                        choice = sc.nextLine();
                        System.out.println();
                        break;
                    case 2: dortmund();
                        System.out.print("Continue? (y/n): ");
                        choice = sc.nextLine();
                        System.out.println();
                        break;
                    case 3: schalke();
                        System.out.print("Continue? (y/n): ");
                        choice = sc.nextLine();
                        System.out.println();
                        break;
                    default:  System.out.print("\nInvalid ");

                }
            }
            else if (countryCode == 4){
                System.out.print("\nYou have chosen French teams \nThe following teams have tickets available for matches. Please pick\n\n1. PSG\n2. Lile\n3. Marseille");
                int teamCode = Integer.parseInt(team.nextLine());  // read the product code
                switch (teamCode){
                    case 1: psg();
                        System.out.print("Continue? (y/n): ");
                        choice = sc.nextLine();
                        System.out.println();
                        break;
                    case 2: lile();
                        System.out.print("Continue? (y/n): ");
                        choice = sc.nextLine();
                        System.out.println();
                        break;
                    case 3: marseille();
                        System.out.print("Continue? (y/n): ");
                        choice = sc.nextLine();
                        System.out.println();
                        break;
                    default:  System.out.print("\nInvalid ");

                }
            }
            else{
                System.out.print("You have not chosen a valid country ");
            }


        }
    }

    private static void marseille() {
        String productCode = "marseille";
        // get the Product object
        Ticket p = TicketDB.getTicket(productCode);


        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Match:          " + p.toString());
            System.out.println("Location:       " + p.getLocation());
            System.out.println("Price:          " + p.getPriceFormatted());
            System.out.println("Date:           " + p.getDate());
            System.out.println("Seat No:        " + p.getSeatNumber());
            System.out.println("Ticket No:      " + p.getTicketNumber());
        } else {
            System.out.println("No league matches this product code.");
        }

        System.out.println();
        System.out.println("Product count: " + Ticket.getCount() + "\n");
    }

    private static void lile() {
        String productCode = "lile";
        // get the Product object
        Ticket p = TicketDB.getTicket(productCode);


        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Match:          " + p.toString());
            System.out.println("Location:       " + p.getLocation());
            System.out.println("Price:          " + p.getPriceFormatted());
            System.out.println("Date:           " + p.getDate());
            System.out.println("Seat No:        " + p.getSeatNumber());
            System.out.println("Ticket No:      " + p.getTicketNumber());
        } else {
            System.out.println("No league matches this product code.");
        }

        System.out.println();
        System.out.println("Product count: " + Ticket.getCount() + "\n");
    }

    private static void psg() {
        String productCode = "psg";
        // get the Product object
        Ticket p = TicketDB.getTicket(productCode);


        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Match:          " + p.toString());
            System.out.println("Location:       " + p.getLocation());
            System.out.println("Price:          " + p.getPriceFormatted());
            System.out.println("Date:           " + p.getDate());
            System.out.println("Seat No:        " + p.getSeatNumber());
            System.out.println("Ticket No:      " + p.getTicketNumber());
        } else {
            System.out.println("No league matches this product code.");
        }

        System.out.println();
        System.out.println("Product count: " + Ticket.getCount() + "\n");
    }

    private static void schalke() {
        String productCode = "schalke";
        // get the Product object
        Ticket p = TicketDB.getTicket(productCode);


        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Match:          " + p.toString());
            System.out.println("Location:       " + p.getLocation());
            System.out.println("Price:          " + p.getPriceFormatted());
            System.out.println("Date:           " + p.getDate());
            System.out.println("Seat No:        " + p.getSeatNumber());
            System.out.println("Ticket No:      " + p.getTicketNumber());
        } else {
            System.out.println("No league matches this product code.");
        }

        System.out.println();
        System.out.println("Product count: " + Ticket.getCount() + "\n");
    }

    private static void dortmund() {
        String productCode = "dortmund";
        // get the Product object
        Ticket p = TicketDB.getTicket(productCode);


        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Match:          " + p.toString());
            System.out.println("Location:       " + p.getLocation());
            System.out.println("Price:          " + p.getPriceFormatted());
            System.out.println("Date:           " + p.getDate());
            System.out.println("Seat No:        " + p.getSeatNumber());
            System.out.println("Ticket No:      " + p.getTicketNumber());
        } else {
            System.out.println("No league matches this product code.");
        }

        System.out.println();
        System.out.println("Product count: " + Ticket.getCount() + "\n");
    }

    private static void bayern() {
        String productCode = "bayern";
        // get the Product object
        Ticket p = TicketDB.getTicket(productCode);


        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Match:          " + p.toString());
            System.out.println("Location:       " + p.getLocation());
            System.out.println("Price:          " + p.getPriceFormatted());
            System.out.println("Date:           " + p.getDate());
            System.out.println("Seat No:        " + p.getSeatNumber());
            System.out.println("Ticket No:      " + p.getTicketNumber());
        } else {
            System.out.println("No league matches this product code.");
        }

        System.out.println();
        System.out.println("Product count: " + Ticket.getCount() + "\n");
    }

    private static void atletico() {
        String productCode = "atletico";
        // get the Product object
        Ticket p = TicketDB.getTicket(productCode);


        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Match:          " + p.toString());
            System.out.println("Location:       " + p.getLocation());
            System.out.println("Price:          " + p.getPriceFormatted());
            System.out.println("Date:           " + p.getDate());
            System.out.println("Seat No:        " + p.getSeatNumber());
            System.out.println("Ticket No:      " + p.getTicketNumber());
        } else {
            System.out.println("No league matches this product code.");
        }

        System.out.println();
        System.out.println("Product count: " + Ticket.getCount() + "\n");
    }

    private static void barca() {
        String productCode = "barca";
        // get the Product object
        Ticket p = TicketDB.getTicket(productCode);


        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Match:       " + p.toString());
            System.out.println("Location:    " + p.getLocation());
            System.out.println("Price:       " + p.getPriceFormatted());
            System.out.println("Date:        " + p.getDate());
            System.out.println("Seat No:     " + p.getSeatNumber());
            System.out.println("Ticket No:   " + p.getTicketNumber());
        } else {
            System.out.println("No league matches this product code.");
        }

        System.out.println();
        System.out.println("Product count: " + Ticket.getCount() + "\n");
    }

    private static void realmadrid() {
        String productCode = "madrid";
        // get the Product object
        Ticket p = TicketDB.getTicket(productCode);


        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Match:      " + p.toString());
            System.out.println("Location:   " + p.getLocation());
            System.out.println("Price:      " + p.getPriceFormatted());
            System.out.println("Date:       " + p.getDate());
            System.out.println("Seat No:    " + p.getSeatNumber());
            System.out.println("Ticket No:  " + p.getTicketNumber());
        } else {
            System.out.println("No league matches this product code.");
        }

        System.out.println();
        System.out.println("Product count: " + Ticket.getCount() + "\n");
    }

    private static void united() {
        String productCode = "united";
        // get the Product object
        Ticket p = TicketDB.getTicket(productCode);


        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Match:       " + p.toString());
            System.out.println("Location:    " + p.getLocation());
            System.out.println("Price:       " + p.getPriceFormatted());
            System.out.println("Date:        " + p.getDate());
            System.out.println("Seat No:     " + p.getSeatNumber());
            System.out.println("Ticket No:   " + p.getTicketNumber());
        } else {
            System.out.println("No league matches this product code.");
        }

        System.out.println();
        System.out.println("Product count: " + Ticket.getCount() + "\n");
    }

    private static void city() {
        //String productCode = sc.nextLine();  // read the product code

        //Scanner sc = new Scanner(System.in);
        String productCode = "city";
        // get the Product object
        Ticket p = TicketDB.getTicket(productCode);


        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Match:       " + p.toString());
            System.out.println("Location:    " + p.getLocation());
            System.out.println("Price:       " + p.getPriceFormatted());
            System.out.println("Date:        " + p.getDate());
            System.out.println("Seat No:     " + p.getSeatNumber());
            System.out.println("Ticket No:   " + p.getTicketNumber());
        } else {
            System.out.println("No league matches this product code.");
        }

        System.out.println();
        System.out.println("Product count: " + Ticket.getCount() + "\n");

    }

    private static void liverpool() {
        //String productCode = sc.nextLine();  // read the product code
        //Scanner sc = new Scanner(System.in);
        String productCode = "liverpool";
        // get the Product object
        Ticket p = TicketDB.getTicket(productCode);


        // display the output
        System.out.println();
        if (p != null) {
            System.out.println("Match:      " + p.toString());
            System.out.println("Location:   " + p.getLocation());
            System.out.println("Price:      " + p.getPriceFormatted());
            System.out.println("Date:       " + p.getDate());
            System.out.println("Seat No:    " + p.getSeatNumber());
            System.out.println("Ticket No:  " + p.getTicketNumber());
        } else {
            System.out.println("No league matches this product code.");
        }

        System.out.println();
        System.out.println("Product count: " + Ticket.getCount() + "\n");

    }


}