

/**
 * Enumerates the days of the week, starting from Sunday.
 * 
 * @author Calvin Cheng
 */
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    
    /**
     * The days Monday, Wednesday, and Friday.
     */
    public static final Day[] MWF = {MONDAY, WEDNESDAY, FRIDAY};
    
    /**
     * The days Tuesday and Thursday.
     */
    public static final Day[] TTH = {TUESDAY, THURSDAY};
}