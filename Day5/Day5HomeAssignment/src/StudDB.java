
public class StudDB {
	private int StudId;
	private String name;
	private String city;

	public StudDB() {

	}

	public StudDB(int StudId, String name, String city) {
		this.StudId = StudId;
		this.name = name;
		this.city = city;

	}

	public int getStudId() {
		return StudId;
	}

	public void setStudId(int studId) {
		StudId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
