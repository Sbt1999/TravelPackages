package TravelPackages;

/**
 * The Activity class represents a specific activity available at a destination
 * in a travel package. It includes information such as name, description, price,
 * capacity, and current capacity.
 */
public class Activity {

    private String name;             // Name of the activity
    private String description;      // Description of the activity
    private int price;               // Price of the activity
    private int capacity;            // Maximum capacity of the activity
    private int currentCapacity;     // Current number of participants in the activity

    /**
     * Constructs an Activity with the given name, price, and capacity.
     * The current capacity is initialized to the maximum capacity.
     *
     * @param name     The name of the activity.
     * @param price    The price of the activity.
     * @param capacity The maximum capacity of the activity.
     */
    public Activity(String name, int price, int capacity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.currentCapacity = capacity;
    }

    /**
     * Gets the name of the activity.
     *
     * @return The name of the activity.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the activity.
     *
     * @param name The new name of the activity.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description of the activity.
     *
     * @return The description of the activity.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the activity.
     *
     * @param description The new description of the activity.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the price of the activity.
     *
     * @return The price of the activity.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the price of the activity.
     *
     * @param price The new price of the activity.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Gets the maximum capacity of the activity.
     *
     * @return The maximum capacity of the activity.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the maximum capacity of the activity.
     *
     * @param capacity The new maximum capacity of the activity.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the current capacity of the activity.
     *
     * @return The current capacity of the activity.
     */
    public int getCurrentCapacity() {
        return currentCapacity;
    }

    /**
     * Sets the current capacity of the activity.
     *
     * @param currentCapacity The new current capacity of the activity.
     */
    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    /**
     * Checks if the activity has reached its maximum capacity.
     *
     * @return True if the activity is at full capacity, false otherwise.
     */
    public boolean isCapacityFull() {
        return (this.currentCapacity == 0);
    }
}

