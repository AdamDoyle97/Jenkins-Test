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
            System.out.print("Please pick a country from the following:\n1. England\n2. Spain\n3. Germany\n4. France \n");
            int countryCode = Integer.parseInt(country.nextLine());  // read the product code
            if(countryCode == 1){
                System.out.print("You have chosen English teams \nThe following teams have tickets available for matches. Please pick\n\n1. Liverpool\n2. City\n");
                int teamCode = Integer.parseInt(team.nextLine());  // read the product code
                if(teamCode == 1){
                    //String productCode = sc.nextLine();  // read the product code
                    String productCode = "liverpool";
                    // get the Product object
                    Ticket p = TicketDB.getTicket(productCode);


                    // display the output
                    System.out.println();
                    if (p != null) {
                        System.out.println("Match: " + p.toString());
                        System.out.println("Location:       " + p.getLocation());
                        System.out.println("Price:       " + p.getPriceFormatted());
                        System.out.println("Date:       " + p.getDate());
                        System.out.println("Seat No:       " + p.getSeatNumber());
                        System.out.println("Ticket No:       " + p.getTicketNumber());
                    } else {
                        System.out.println("No league matches this product code.");
                    }

                    System.out.println();
                    System.out.println("Product count: " + Ticket.getCount() + "\n");

                    // see if the user wants to continue
                    System.out.print("Continue? (y/n): ");
                    choice = sc.nextLine();
                    System.out.println();
                }else{
                    System.out.print("No team \n\n");
                }

            }
            else if (countryCode == 2){
                System.out.print("You have chosen Spanish teams ");
            }
            else if (countryCode == 3){
                System.out.print("You have chosen German teams ");
            }
            else if (countryCode == 4){
                System.out.print("You have chosen France teams ");
            }
            else{
                System.out.print("You have not chosen a valid country ");
            }


        }
    }


}