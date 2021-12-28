package entity;

public class Department {
	int id;
	String name;

	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Department(int id) {

	}

	@Override
	public String toString() {
		return "Thong tin phong ban id =" + id + ", name=" + name + "";
	}

}
