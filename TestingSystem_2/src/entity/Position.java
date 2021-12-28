package entity;

import enums.posName;

public class Position {
	int id;
	posName name;

	public Position(int id, posName name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}

}
