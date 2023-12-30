package TravelPackages;

import java.util.ArrayList;
import java.util.List;

/**
 * The Destination class represents a location within a travel package itinerary.
 * It contains a name and a list of activities available at that destination.
 */
public class Destination {

    private String name;                // Name of the destination
    private List<Activity> activities;  // List of activities available at the destination

    /**
     * Default constructor for the Destination class.
     * Initializes the activities list as an empty ArrayList.
    /**
     * Parameterized constructor for the Destination class.
     * Initializes the destination with the given name and an empty activities list.
     *
     * @param name The name of the destination.
     */
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    /**
     * Getter method to retrieve the name of the destination.
     *
     * @return The name of the destination.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method to set the name of the destination.
     *
     * @param name The name to set for the destination.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method to retrieve the list of activities available at the destination.
     *
     * @return The list of activities.
     */
    public List<Activity> getActivities() {
        return activities;
    }

    /**
     * Setter method to set the list of activities for the destination.
     *
     * @param activities The list of activities to set.
     */
    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    /**
     * Method to add an activity to the list of activities at the destination.
     * If the activities list is not initialized, it creates a new ArrayList.
     *
     * @param activity The activity to add to the destination.
     */
    public void addActivity(Activity activity) {
        if (this.activities == null) {
            this.activities = new ArrayList<>();
        }
        this.activities.add(activity);
    }
}
