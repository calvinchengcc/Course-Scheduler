import java.util.*;

/**
 * Defines a course at UBC specified by its four-letter abbreviation and number, as well as its sections.
 * Pre-requisites and co-requisites can also be specified.
 * 
 * @author Calvin Cheng
 */
class Course {
	private String name;
	private ArrayList<Section> sections;
	private ArrayList<Course> prereqs;
	private ArrayList<Course> coreqs;
	
	/**
	 * Constructs a new course with one section and no pre/co-requisites.
	 * 
	 * @param abbrev Four-letter abbreviation of the given UBC course, followed by the course number (e.g. CPSC 210).
	 * @param section Section of the course to be added.
	 */
	public Course(String abbrev, Section section) {
		name = abbrev;
		sections = new ArrayList<Section>(1);
		sections.add(section);
	}
	
	/**
	 * Constructs a new course with the given list of courses and no pre/co-requisites.
	 * 
	 * @param abbrev Four-letter abbreviation of the given UBC course.
	 * @param sections A list of sections provided in the course.
	 */
	public Course(String abbrev, ArrayList<Section> sections) {
		name = abbrev;
		this.sections = sections;
	}
	
	/**
	 * Constructs a new course with the given list of courses, a list of pre-requisites, and a list of co-requisites.
	 * 
	 * @param abbrev Four-letter abbreviation of the given UBC course.
	 * @param sections A list of sections provided in the course.
	 * @param prereqs A list of pre-requisites required for the course.
	 * @param coreqs A list of co-requisites required for the course.
	 */
	public Course(String abbrev, ArrayList<Section> sections, ArrayList<Course> prereqs, ArrayList<Course> coreqs) {
		name = abbrev;
		this.sections = sections;
		this.prereqs = prereqs;
		this.coreqs = coreqs;
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
	
	/**
	 * Returns an {@link ArrayList} of the pre-requisites for the course.
	 * 
	 * @return the pre-requisites for the course.
	 */
	public ArrayList<Course> getPrereqs() {
		return prereqs;
	}

	/**
	 * @return an {@link ArrayList} of the co-requisites for the course.
	 * 
	 * @return the co-requisites for the course.
	 */
	public ArrayList<Course> getCoreqs() {
		return coreqs;
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
	 * @param building SIS code (3-4 letter abbreviation) for a building at UBC (e.g. <code>"HENN"</code>).
	 * @param room The room number of the given building.
	 */
	public Location(String building, String room) {
		this.building = building;
		this.room = room;
	}
	
	/**
	 * Returns the SIS code (abbreviation) for a building at UBC.
	 * <p>
	 * The abbreviation usually consists of three or four letters representing the full name of the building
	 * (e.g. <code>"ESB"</code>, <code>"ICCS"</code>).
	 * 
	 * @return the building of the location.
	 */
	public String getBuilding() {
		return building;
	}
	
	/**
	 * Returns the room number of the location.
	 * 
	 * @return the room number of the location.
	 */
	public String getRoom() {
		return room;
	}

	public String toString() {
		return building + " " + room;
	}
}

/**
 * Defines a class that produces an optimal schedule given a number of courses,
 * or notifies the user if no such schedule is possible.
 * <p>
 * This program takes into account the time during which each section of a particular course is scheduled,
 * pre-requisites/co-requisites for each course, and the distance between buildings.
 * 
 * @author Calvin Cheng
 */
public class CourseScheduler {

	public static void main(String[] args) {
		System.out.println("Hello");

	}

}
