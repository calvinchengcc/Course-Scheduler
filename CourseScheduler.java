import java.util.*;

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
	
	private static Course a1 = new Course("CPSC 210", "101",
			1, Day.MWF, "13:00", "15:00", new Location("ESB", "1013"),
			new HashSet<Course>(), new HashSet<Course>());
	
	public static void main(String[] args) {
		
		
		
		return;
	}
}
