package cc.course;

import java.util.*;

/**
 * Defines a course at UBC specified by its four-letter abbreviation and number, as well as its sections.
 * Pre-requisites and co-requisites can also be specified.
 * 
 * @author Calvin Cheng
 */
public class Course {
	private String name;
	private List<Section> sections;
	private List<Course> prereqs;
	private List<Course> coreqs;
	
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
	 * @return <code>true</code> (as specified by {@link ArrayList#add}).
	 */
	public boolean addSection(Section section) {
		return sections.add(section);
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
		return name;
	}
}