package project;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EventManager manager = new EventManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Event Registration System =====");
            System.out.println("1. Add Event");
            System.out.println("2. Update Event");
            System.out.println("3. Delete Event");
            System.out.println("4. Register Participant");
            System.out.println("5. List Participants per Event");
            System.out.println("6. Cancel Registration");
            System.out.println("7. List All Events");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Event name: ");
                    String name = sc.nextLine();
                    System.out.print("Event description: ");
                    String desc = sc.nextLine();
                    manager.addEvent(name, desc);
                }
                case 2 -> {
                    System.out.print("Event ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New name: ");
                    String name = sc.nextLine();
                    System.out.print("New description: ");
                    String desc = sc.nextLine();
                    manager.updateEvent(id, name, desc);
                }
                case 3 -> {
                    System.out.print("Event ID to delete: ");
                    int id = sc.nextInt();
                    manager.deleteEvent(id);
                }
                case 4 -> {
                    System.out.print("Event ID to register for: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Participant name: ");
                    String pname = sc.nextLine();
                    System.out.print("Participant email: ");
                    String pemail = sc.nextLine();
                    manager.registerParticipant(id, pname, pemail);
                }
                case 5 -> {
                    System.out.print("Event ID to list participants: ");
                    int id = sc.nextInt();
                    manager.listParticipants(id);
                }
                case 6 -> {
                    System.out.print("Event ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Participant email to cancel: ");
                    String email = sc.nextLine();
                    manager.cancelRegistration(id, email);
                }
                case 7 -> manager.listEvents();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
