package lab1mvn.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(final String[] args) {
        LOGGER.info("Приложение успешно запущено!");
        LOGGER.info("App demo:");

        // create owner
        Owner ownerJK = new Owner("Jan Kowalski", "12345678901");
        LOGGER.info("Created owner: {} (ID:{}) ", ownerJK.getFullName(), ownerJK.getPersonId());

        // create engine
        Engine engineD14 = new Engine("D14A4-1234567", 165000, 1400);
        LOGGER.info("Created engine: {}, {} cm3, {} km", engineD14.getEngineNumber(), engineD14.getEngineVolume(), engineD14.getPrevCheckupMileage());

        // create car
        LOGGER.info("Creating new car...");
        Car myCar = new Car(engineD14, ownerJK, "SHHMB2740WU654321");
        myCar.setFriendlyName("Old_car_1");


        LOGGER.info("\n -- " + myCar.getFriendlyName() + " --");
        LOGGER.info("VIN: " + myCar.getNumberVIN());
        LOGGER.info("Owner: " + myCar.getCarOwner().getFullName());
        LOGGER.info("Engine: " + myCar.getEngineEntity().getEngineNumber());

        // checkup
        LOGGER.info("\n -- do checkup --");
        myCar.getEngineEntity().updateCheckup(202000);
        LOGGER.info("Checkup mileage record updated: " + myCar.getEngineEntity().getPrevCheckupMileage() + " км");

        // swap engine
        LOGGER.info("\n -- swap engine --");
        Engine customEngine = new Engine("B18C4-162534", 0, 1800);
        Engine oldEngine = myCar.swapEngine(customEngine);
        LOGGER.info("New engine just installed: " + myCar.getEngineEntity().getEngineNumber()
                + " with capacity of " + myCar.getEngineEntity().getEngineVolume() + " см3");
        LOGGER.info("Moving " + oldEngine.getEngineNumber() + " to storage");

        // change owner
        LOGGER.info("\n -- owner change --");
        Owner owner2 = new Owner("Karol Nowak", "10987654321");
        myCar.changeOwner(owner2);
        LOGGER.info("New owner: " + myCar.getCarOwner().getFullName());

        LOGGER.info("\nDemo finished");
    }
}
