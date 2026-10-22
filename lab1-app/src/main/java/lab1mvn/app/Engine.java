package lab1mvn.app;

public class Engine {
    /** Unique engine number.
     * There is no check of uniqueness */
    private final String engineNumber;
    /** Engine mileage, checked at previous checkup */
    private int prevCheckupMileage;
    /** Engine volume in cm3 */
    private final int engineVolume;

    /**
     * Engine constructor
     * @param inputPrevCheckupMileage mileage at previous checkup in km
     * @param inputEngineVolume engine volume in cm3
     * @param inputEngineNumber unique (without uniqueness check) engine number
     */
    public Engine(final String inputEngineNumber, final int inputPrevCheckupMileage, final int inputEngineVolume) {
        this.engineNumber = inputEngineNumber;
        this.prevCheckupMileage = inputPrevCheckupMileage;
        this.engineVolume = inputEngineVolume;
    }

    /**
     * get engine volume
     * @return volume in cm3
     */
    public int getEngineVolume() {
        return this.engineVolume;
    }

    /**
     * get mileage at previous checkup
     * @return mileage in km
     * */
    public int getPrevCheckupMileage() {
        return this.prevCheckupMileage;
    }

    /** @return engine number */
    public String getEngineNumber() {
        return this.engineNumber;
    }

    /**
     * input new mileage value in km, during checkup
     * @param currentMileage current mileage in km
     * */
    public void updateCheckup(final int currentMileage) {
        this.prevCheckupMileage = currentMileage;
    }
}
