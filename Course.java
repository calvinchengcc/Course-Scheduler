import java.util.*;

/**
 * Defines a course at UBC, specified by:
 * <ul>
 * 	<li> its four-letter abbreviation and number; </li>
 * 	<li> its section number; </li>
 * 	<li> the term in which it is offered; </li>
 * 	<li> the days of the week in which it is offered; </li>
 * 	<li> the starting time; </li>
 * 	<li> the ending time; </li>
 * 	<li> the location; and <li>
 *  <li> any pre-requisites/co-requisites. </li>
 * </ul>
 * 
 * @author Calvin Cheng
 */
public class Course {
	private String name;
	private String section;
	private byte term;
	private Day[] days;
	private String startTime;
	private String endTime;
	private Location location;
	private List<Course> prereqs;
	private List<Course> coreqs;
	
	/**
	 * Constructs a new course.
	 * 
	 * @param abbrev	Four-letter abbreviation of given UBC course, followed by the course number (e.g. CPSC 210).
	 * @param section	The section number (e.g. <code>"001"</code>, <code>"912"</code>).
	 * 					Labs may start with the letter 'L' (e.g. <code>"L2G"</code>),
	 * 					and tutorials may start with the letter 'T' (e.g. <code>"T2C"</code>).
	 * @param term		The term in which this section is offered (<code>1</code> or <code>2</code>).
	 * @param days		The days in which this section is offered.
	 * @param startTime The starting time in 24-hour HH:MM format (e.g. <code>"08:30"</code> for 1:30 pm).
	 * @param endTime	The ending time in 24-hour HH:MM format (e.g. <code>"13:00"</code> for 1:00 pm).
	 * @param location	The location of the section offered.
	 * @param prereqs 	A list of pre-requisites required for the course. Can be empty.
	 * @param coreqs	A list of co-requisites required for the course. Can by empty.
	 */
	public Course(String abbrev, String section,
			int term, Day[] days, String startTime, String endTime, Location location,
			ArrayList<Course> prereqs, ArrayList<Course> coreqs) {
		name = abbrev;
		this.section = section;
		this.term = (byte) term;
		this.days = days;
		this.startTime = startTime;
		this.endTime = endTime;
		this.location = location;
		this.prereqs = prereqs;
		this.coreqs = coreqs;
	}
	
	/**
	 * Returns the section number. In most cases, this is three characters long.
	 * <p>
	 * Labs may start with the letter 'L' (e.g. <code>"L2G"</code>),
	 * and tutorials may start with the letter 'T' (e.g. <code>"T2C"</code>).
	 * @return the number of the section.
	 */
	public String getSection() {
		return section;
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
	 * Returns the days during which the section is offered.
	 * 
	 * @return the days during which the section is offered.
	 */
	public Day[] getDays() {
		return days;
	}
	
	/**
	 * Returns the starting time of the section. This time is represented in 24-hour, HH:MM format. For instance,
	 * 1:20 pm would be represented as <code>"13:20"</code>.
	 * 
	 * @return the starting time of the section.
	 */
	public String getStartTime() {
		return startTime;
	}
	
	/**
	 * Returns the ending time of the section. This time is represented in 24-hour, HH:MM format. For instance,
	 * 1:20 pm would be represented as <code>"13:20"</code>.
	 * 
	 * @return the ending time of the section.
	 */
	public String getEndTime() {
		return endTime;
	}
	
	/**
	 * Returns the {@link Location} of the section.
	 * 
	 * @return the location of the section.
	 */
	public Location getLocation() {
		return location;
	}
	
	/**
	 * Returns an {@link ArrayList} of the pre-requisites for the course.
	 * 
	 * @return the pre-requisites for the course.
	 */
	public List<Course> getPrereqs() {
		return prereqs;
	}

	/**
	 * @return an {@link ArrayList} of the co-requisites for the course.
	 * 
	 * @return the co-requisites for the course.
	 */
	public List<Course> getCoreqs() {
		return coreqs;
	}

	public String toString() {
		return name + ":" + section;
	}
}