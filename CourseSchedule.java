import java.util.*;

/**
 * Defines a number of courses that, taken together, form a schedule.
 * 
 * @author Calvin Cheng
 */

public class CourseSchedule extends HashSet<Course> {
	
	private static final long serialVersionUID = 58959240153059461L;

	/**
	 * Constructs an empty course schedule.
	 */
	public CourseSchedule() {
		super();
	}
	
	/**
	 * Constructs a schedule specified by the given list of courses.
	 * 
	 * @param A list of courses to form the schedule.
	 */
	public CourseSchedule(Collection<Course> schedule) {
		super(schedule);
	}
	
	/**
	 * Determines whether the schedule is a valid schedule. That is, this method returns true if and only if
	 * none of the times of the courses conflict with each other and all of the necessary pre-requisites and
	 * co-requisites are met.
	 * 
	 * @return <code>true</code> if the schedule is valid; <code>false</code> otherwise.
	 */
	public boolean isValid() {
		return false;
	}
}
