package firstlabmvn.app;

public class Owner {
    /** owner personal id. */
    private final String personId;
    /** owner full name. */
    private final String fullName;
    /** Contact - unused vraiable to check pmd and stylecheck. */
    private String PhoneNumber;

    /**
     * Owner constructor.
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
