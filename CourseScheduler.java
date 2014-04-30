import java.util.*;

/**
 * Defines a course at UBC specified by its four-letter abbreviation and number, as well as its sections.
 * 
 * @author Calvin Cheng
 */
class Course {
	private String name;
	private ArrayList<Section> sections;
	
	/**
	 * Constructs a new course with no sections.
	 * 
	 * @param abbrev Four-letter abbreviation of the given UBC course, followed by the course number (e.g. CPSC 210).
	 */
	public Course(String abbrev) {
		name = abbrev;
		sections = new ArrayList<Section>();
	}
	
	/**
	 * Constructs a new course with the given list of courses.
	 * 
	 * @param abbrev Four-letter abbreviation of the given UBC course.
	 * @param sections A list of sections provided in the course.
	 */
	public Course(String abbrev, ArrayList<Section> sections) {
		name = abbrev;
		this.sections = sections;
	}
	
	/**
	 * Appends the section to the list of sections in the course.
	 * 
	 * @param section The section to be added to the course.
	 * @return <code>true</code> (as specified by {@link ArrayList#add(E e) <code>ArrayList.add</code>}).
	 */
	public boolean addSection(Section section) {
		return sections.add(section);
	}
	
	public String toString() {
		return name;
	}
}

/**
 * Defines a section of a course, specified by its number, term offered, start/end times, and its location.
 * 
 * @author Calvin Cheng
 */
class Section {
	
	private short number;
	private byte term;
	private short startTime;
	private short endTime;
	private Location location;
	
	/**
	 * Constructs a Section object with given section number and times.
	 * 
	 * @param number	The section number (e.g. 101, 102, 103). Labs may start with the letter 'L' (e.g. L2G),
	 * 					and tutorials may start with the letter 'T' (e.g. T2C).
	 * @param term		The term in which this section is offered (1 or 2).
	 * @param startTime The starting hour in 24-hour notation, ignoring the colon (e.g. 1330 for 1:30 pm).
	 * @param endTime	The ending hour in 24-hour notation, ignoring the colon (e.g. 13 for 1:00 pm).
	 * @param location	The location of the section offered.
	 */
	public Section(short number, byte term, short startTime, short endTime, Location location) {
		this.number = number;
		this.term = term;
		this.startTime = startTime;
		this.endTime = endTime;
		this.location = location;
	}
	
	/**
	 * Returns the number of the section. In most cases, this number is three characters long.
	 * 
	 * @return the number of the section.
	 */
	public short getNumber() {
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
	 * Returns the starting time of the section.
	 * 
	 * @return the starting time of the section.
	 */
	public short startTime() {
		return startTime;
	}
	
	/**
	 * Returns the ending time of the section.
	 * 
	 * @return the ending time of the section.
	 */
	public short endTime() {
		return endTime;
	}
	
	/**
	 * Returns the location of the section.
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

/**
 * Defines a location at UBC, specified by its building and room number.
 * 
 * @author Calvin Cheng
 */
class Location {
	
	private String building;
	private String room;
	
	/**
	 * Constructs a new <code>Location</code>, given a building name and room number.
	 * 
	 * @param building SIS code (abbreviation) for a building at UBC (e.g. HENN, ESB, ICCS).
	 * @param room The room number of the given building.
	 */
	public Location(String building, String room) {
		this.building = building;
		this.room = room;
	}
	
	/**
	 * Returns the building of the location.
	 * 
	 * @return the building of the location.
	 */
	public String getBuilding() {
		return building;
	}
	
	/**
	 * Returns the room number of the location.
	 * 
	 * @return the room number of the locaation.
	 */
	public String getRoom() {
		return room;
	}

	public String toString() {
		return building + " " + room;
	}
}

/**
 * Produces a valid schedule given a number of courses, or notifies the user if no such schedule is possible.
 * <p>
 * This program takes into account the time for which each section of a particular course is scheduled, as well
 * as pre-requisites/co-requisites for each course.
 * 
 * @author Calvin Cheng
 */
public class CourseScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
