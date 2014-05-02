package cc.course;

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
	
	private static Course a1 = new Course("CPSC 210", new Section("101", 1, Day.MWF, "13:00", "15:00", new Location("ESB", "1013")));
	private static Course b2 = new Course("MATH 223", new Section("102", 1, Day.MWF, "15:00", "16:30", new Location("ESB", "125")));
	
	public static void main(String[] args) {
		
		
		
		return;
	}
}
