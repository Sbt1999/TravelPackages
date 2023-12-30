package TravelPackages;

public class DestinationBuilder {
    private String name;

    public DestinationBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Destination createDestination() {
        return new Destination(name);
    }
}