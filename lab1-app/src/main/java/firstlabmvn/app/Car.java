package firstlabmvn.app;


public class Car {
    /** car engine. */
    private Engine engineEntity;
    /** car owner. */
    private Owner carOwner;
    /** car VIN number. */
    private final String numberVIN;
    /** convenient and usefull name of a Car object. */
    private String friendlyName;

    /**
     * Car constructor.
     * @param firstOwner initial car owner
     * @param stockEngine initial car engine
     * @param inputNumberVIN initial and final car VIN number
     * */
    public Car(
            final Engine stockEngine,
            final Owner firstOwner,
            final String inputNumberVIN
    ) {
        this.engineEntity = stockEngine;
        this.carOwner = firstOwner;
        this.numberVIN = inputNumberVIN;
        this.friendlyName = "Car Object VIN: '" + inputNumberVIN + "'";
    }

    /**
     * Swap engine.
     * @param customEngine new engine to attach in a car
     * @return previous engine, installed in a car
     * */
    public Engine swapEngine(final Engine customEngine) {
        Engine tmpEngine = this.engineEntity;
        this.engineEntity = customEngine;
        return tmpEngine;
    }

    /**
     * change car owner.
     * @param newOwner new car owner
     * */
    public void changeOwner(final Owner newOwner) {
        this.carOwner = newOwner;
    }

    /** @return car engine. */
    public Engine getEngineEntity() {
        return engineEntity;
    }

    /** @return car owner. */
    public Owner getCarOwner() {
        return carOwner;
    }

    /** @return car VIN number. */
    public String getNumberVIN() {
        return numberVIN;
    }

    /**
     * Returns the convenient and useful name of the car.
     * @return the friendly name of the car
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the convenient and useful name of the car.
     * @param inputFriendlyName the friendly name to set
     */
    public void setFriendlyName(final String inputFriendlyName) {
        this.friendlyName = inputFriendlyName;
    }

    /**
     * Simple toString convertion.
     * @return String representation
     * */
    public String toString() {
        return "-- Car: " + this.friendlyName + " --\n"
                + "VIN: " + this.numberVIN + "\n"
                + "Owner: " + this.carOwner.getFullName() + "\n"
                + "Engine: " + this.engineEntity.getEngineNumber();
    }
}
