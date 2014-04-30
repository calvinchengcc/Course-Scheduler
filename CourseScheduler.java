/**
 * @author Calvin Cheng
 *
 */
class Course {
	Section blue;
	
}

/**
 * Defines the different sections provided within a course.
 * 
 * @author Calvin Cheng
 */
class Section {
	
	private String name;
	private short startTime;
	private short endTime;
	
	/**
	 * Constructs a Section object with given section number and times.
	 * 
	 * @param name 		The section number (e.g. 101, 102, 103)
	 * @param startTime The starting hour in 24-hour notation, ignoring the colon (e.g. 1330 for 1:30 pm)
	 * @param endTime	The ending hour in 24-hour notation, ignoring the colon (e.g. 13 for 1:00 pm)
	 */
	public Section(String name, short startTime, short endTime) {
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}
}

/**
 * Runs the program necessary to schedule the courses provided.
 * <p>
 * This program takes in something and produces something.
 * 
 * @author Calvin Cheng
 */
public class CourseScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
