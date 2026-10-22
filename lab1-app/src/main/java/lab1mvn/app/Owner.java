package lab1mvn.app;

public class Owner {
    /** owner personal id */
    private final String personId;
    /** owner full name */
    private final String fullName;

    /**
     * Owner constructor
     * @param inputFullName owner full name
     * @param inputPersonId owner personal id
     * */
    public Owner(final String inputFullName, final String inputPersonId) {
        this.fullName = inputFullName;
        this.personId = inputPersonId;
    }

    /**
     * @return owner personal id
     * */
    public String getPersonId() {
        return this.personId;
    }

    /**
     * @return owner full name
     * */
    public String getFullName() {
        return this.fullName;
    }
}
