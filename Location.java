
/**
 * Defines a location at UBC, specified by its building and room number.
 * 
 * @author Calvin Cheng
 */
public class Location {
	
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