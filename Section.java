
/**
 * Defines a section of a course, specified by its number, term offered, start/end times, and its location.
 * 
 * @author Calvin Cheng
 */
public class Section {
	
	private String number;
	private byte term;
	private String startTime;
	private String endTime;
	private Location location;
	
	/**
	 * Constructs a Section object with given section number and times.
	 * 
	 * @param number	The section number (e.g. <code>"001"</code>, <code>"912"</code>).
	 * 					Labs may start with the letter 'L' (e.g. <code>"L2G"</code>),
	 * 					and tutorials may start with the letter 'T' (e.g. <code>"T2C"</code>).
	 * @param term		The term in which this section is offered (<code>1</code> or <code>2</code>).
	 * @param startTime The starting time in 24-hour HH:MM format (e.g. <code>"08:30"</code> for 1:30 pm).
	 * @param endTime	The ending time in 24-hour HH:MM format (e.g. <code>"13:00"</code> for 1:00 pm).
	 * @param location	The location of the section offered.
	 */
	public Section(String number, byte term, String startTime, String endTime, Location location) {
		this.number = number;
		this.term = term;
		this.startTime = startTime;
		this.endTime = endTime;
		this.location = location;
	}
	
	/**
	 * Returns the number of the section. In most cases, this number is three characters long.
	 * <p>
	 * Labs may start with the letter 'L' (e.g. <code>"L2G"</code>),
	 * and tutorials may start with the letter 'T' (e.g. <code>"T2C"</code>).
	 * @return the number of the section.
	 */
	public String getNumber() {
		return number;
	}
	
	/**
	 * Returns the term in which the section is offered. <code>1</code> represents a section offered in term 1,
	 * and <code>2</code> represents a section offered in term 2.
	 * 
	 * @return the term in which the section is offered.
	 */
	public byte getTerm() {
		return term;
	}
	
	/**
	 * Returns the starting time of the section. This time is represented in 24-hour, HH:MM format. For instance,
	 * 1:20 pm would be represented as <code>"13:20"</code>.
	 * 
	 * @return the starting time of the section.
	 */
	public String startTime() {
		return startTime;
	}
	
	/**
	 * Returns the ending time of the section. This time is represented in 24-hour, HH:MM format. For instance,
	 * 1:20 pm would be represented as <code>"13:20"</code>.
	 * 
	 * @return the ending time of the section.
	 */
	public String endTime() {
		return endTime;
	}
	
	/**
	 * Returns the {@link Location} of the section.
	 * 
	 * @return the location of the section.
	 */
	public Location location() {
		return location;
	}
	
	public String toString() {
		return number + "";
	}
}