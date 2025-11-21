package theater;

/**
 * Constants used in this program.
 */
public final class Constants {

    public static final int PERCENT_FACTOR = 100;
    // volume constants
    public static final int BASE_VOLUME_CREDIT_THRESHOLD = 30;
    public static final int COMEDY_EXTRA_VOLUME_FACTOR = 5;
    // comedy amount constants
    public static final int COMEDY_AMOUNT_PER_AUDIENCE = 300;
    public static final int COMEDY_AUDIENCE_THRESHOLD = 20;
    public static final int COMEDY_BASE_AMOUNT = 30000;
    public static final int COMEDY_OVER_BASE_CAPACITY_AMOUNT = 10000;
    public static final int COMEDY_OVER_BASE_CAPACITY_PER_PERSON = 500;
    // tragedy amount constants
    public static final int TRAGEDY_BASE_AMOUNT = 40000;
    public static final int TRAGEDY_OVER_BASE_CAPACITY_PER_PERSON = 1000;
    public static final int TRAGEDY_AUDIENCE_THRESHOLD = 30;

    private Constants() {

    }
}
