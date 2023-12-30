import TravelPackages.*;

/**
 * The Driver class serves as the entry point for executing the travel agency system.
 */
public class Driver {

    /**
     * The main method is the entry point for the application.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create destinations
        Destination destination3 = new DestinationBuilder().setName("Historical City").createDestination();
        Destination destination4 = new DestinationBuilder().setName("Wildlife Safari").createDestination();

        // Create activities
        Activity activity3 = new Activity("City Tour", 30, 15);
        activity3.setDescription("Explore the historical landmarks in the city");
        activity3.setCurrentCapacity(0);

        Activity activity4 = new Activity("Safari Adventure", 90, 10);
        activity4.setDescription("Witness wildlife in their natural habitat");
        activity4.setCurrentCapacity(0);

        // Add activities to destinations
        destination3.addActivity(activity3);
        destination4.addActivity(activity4);

        // Create passengers
        Passenger passenger3 = new Passenger("Bob Johnson", 55555, PassengerType.PREMIUM, 0);
        Passenger passenger4 = new Passenger("Emily White", 98765, PassengerType.GOLD, 75);

        // Create another travel package
        TravelPackage travelPackage2 = new TravelPackage("Cultural Wonders", 8);
        travelPackage2.addDestination(destination3);
        travelPackage2.addDestination(destination4);
        travelPackage2.addPassenger(passenger3);
        travelPackage2.addPassenger(passenger4);
        travelPackage2.activitySignup(passenger3, activity3);
        travelPackage2.activitySignup(passenger4, activity4);

        // Print the travel itinerary
        travelPackage2.printItinerary();

        // Print the passenger list
        travelPackage2.printPassengerList();

        // Print passenger details
        travelPackage2.printPassengerDetail(passenger3);
        travelPackage2.printPassengerDetail(passenger4);

        // Print available activities
        travelPackage2.printAllActivities();
    }
}

