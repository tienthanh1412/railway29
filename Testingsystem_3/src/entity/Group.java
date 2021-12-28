package entity;

import java.time.LocalDate;

public class Group {
	int id;
	String name;
	Account creator;
	LocalDate createDate;
	Account[] accounts;


	public Group(int id, String name, LocalDate createDate) {
		super();
		this.id = id;
		this.name = name;
		this.createDate = createDate;
	}


	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creator=" + creator + ", createDate=" + createDate + "]";
	}

}
