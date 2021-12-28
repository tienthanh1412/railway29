package entity;

import java.util.Arrays;
import java.util.Date;

public class Account {
	int id;
	String email;
	String userName;
	String fullName;
	Department department;
	Position pos;
	Date createDate;
	Group[] groups;

	public Account() {
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", department=" + department + ", pos=" + pos + ", createDate=" + createDate + ", groups="
				+ Arrays.toString(groups) + "]";
	}

}
