package entity;

import java.time.LocalDate;

import enums.posName;

public class Insert {
	public static void main(String[] args) {

//	insert DEPARTMENT
		Department dep1 = new Department(1, "Phong Ky Thuat 1");
		Department dep2 = new Department(2, "Phong Ky Thuat 2");
		Department dep3 = new Department(3, "Phong Dev 1");
		Department dep4 = new Department(4, "Phong Dev 2");
		Department dep5 = new Department(5, "Phong Sale");
		Department dep6 = new Department(6, "Phong Marketing");
		Department dep7 = new Department(7, "Phong Giam Doc");
//	insert POSITION
		Position pos1 = new Position(1, posName.DEV);
		Position pos2 = new Position(2, posName.TEST);
		Position pos3 = new Position(3, posName.SCRUM_MASTER);
		Position pos4 = new Position(4, posName.PM);
//	insert GROUP
		Group group1 = new Group(1, "nhóm 1", LocalDate.of(2021, 02, 19));
		Group group2 = new Group(2, "nhóm 2", LocalDate.of(2021, 06, 11));
		Group group3 = new Group(3, "nhóm 3", LocalDate.of(2015, 04, 28));
		Group group4 = new Group(4, "nhóm 4", LocalDate.of(2013, 07, 12));
		Group group5 = new Group(5, "nhóm 5", LocalDate.of(2020, 11, 19));
//	insert ACCOUNT
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "vti_account1@vtiacademy.com";
		acc1.userName = "vti1";
		acc1.fullName = "Nguyen Van Tinh";
		Group[] groupAccount1 = { group1, group2 };
		acc1.groups = groupAccount1;
		acc1.department = dep1;
		acc1.pos = pos1;

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "vti_account2@vtiacademy.com";
		acc2.userName = "vti2";
		acc2.fullName = "Trinh Hoai Linh";
		Group[] groupAccount2 = { group3, group2 };
		acc2.groups = groupAccount2;
		acc2.department = dep2;
		acc2.pos = pos2;

		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "vti_account3@vtiacademy.com";
		acc3.userName = "vti3";
		acc3.fullName = "Nguyen Van Test";
		Group[] groupAccount3 = { group1, group3 };
		acc3.groups = groupAccount3;
		acc3.department = dep3;
		acc3.pos = pos3;

		Account acc4 = new Account();
		acc4.id = 4;
		acc4.email = "vti_account4@vtiacademy.com";
		acc4.userName = "vti4";
		acc4.fullName = "Cao Thai Son";
		Group[] groupAccount4 = { group1, group3 };
		acc4.groups = groupAccount4;
		acc4.department = dep4;
		acc4.pos = pos4;
//		Groupaccoun
		Account[] accingroup1 = { acc1, acc3, acc4 };
		group1.accounts = accingroup1;

//		Kiểm tra account thứ 2
//		Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//		"Nhân viên này chưa có phòng ban"
//		Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ...
		System.out.println("Question1================================if");
		if (acc2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là : " + acc2.department.name);
		}

//		Kiểm tra account thứ 2
//		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//		này là Java Fresher, C# Fresher"
//		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//		quan trọng, tham gia nhiều group"
//		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//		người hóng chuyện, tham gia tất cả các group"

		System.out.println("Question2================================if");

		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int totalgroup = acc2.groups.length;
			if (totalgroup <= 2) {
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			}
			if (totalgroup == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			}
			if (totalgroup == 4) {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
		}
		System.out.println("Question3================================ternary");
		System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là :" + acc2.department.name);

//Sử dụng toán tử ternary để làm yêu cầu sau:
//Kiểm tra Position của account thứ 1
//Nếu Position = Dev thì in ra text "Đây là Developer"
//Nếu không phải thì in ra text "Người này không phải là Developer"
		System.out.println("Question4==============================ternary");

		System.out
				.println(acc1.pos.name.toString() == "DEV" ? "Đây là Developer" : "Người này không phải là Developer");

//		Question 5:
//			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"
		System.out.println("Question5=====================Switch case");

		if (group1 == null) {
			System.out.println("nhom khong co thanh vien");
		} else {
			int totalacc = group1.accounts.length;
			switch (totalacc) {
			case 1:
				System.out.println("1 thì in ra \"Nhóm có một thành viên");

				;
				break;
			case 2:
				System.out.println("Nhóm có hai thành viên");

				;
				break;
			case 3:
				System.out.println("Nhóm có ba thành viên");

				;
				break;

			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}
		}

//		Question 6:
//			Sử dụng switch case để làm lại Question 2
//		Kiểm tra account thứ 2
//		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//		này là Java Fresher, C# Fresher"
//		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//		quan trọng, tham gia nhiều group"
//		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//		người hóng chuyện, tham gia tất cả các group"
		System.out.println("question6=============================Switch case ");
		if (acc2.pos == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int accofgroup = acc2.groups.length;
			switch (accofgroup) {
			case 1:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;

			default:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			}

		}
		// Sử dụng toán tử ternary để làm yêu cầu sau:
		// Kiểm tra Position của account thứ 1
		// Nếu Position = Dev thì in ra text "Đây là Developer"
		// Nếu không phải thì in ra text "Người này không phải là Developer"
		System.out.println("question7=================================Switch case");
		String posname = acc1.pos.toString();
		switch (posname) {
		case "DEV": {
			System.out.println("Đây là Developer");

		}
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
//		Question 8:
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//			họ
		System.out.println("question8=================================FOREACH");
		Account[] arrayACC = { acc1, acc2, acc3, acc4 };
		for (Account account : arrayACC) {
			System.out.println("email la :" + account.email + ",  FullName la :" + account.fullName + "," + ""
					+ "tên phòng ban:" + account.department.name);
		}
//		In ra thông tin các phòng ban bao gồm: id và name
		System.out.println("Question9===================================Foreach");
		Department[] arrayDep = { dep1, dep2, dep3, dep4, dep5, dep6, dep7 };
		for (Department dep : arrayDep) {
			System.out.println("Thong tin phong ban id =" + dep.id + ",Name =" + dep.name);
		}

////		Question 10:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
//		Thông tin account thứ 2 là:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyễn Văn B
//		Phòng ban: Marketting
		System.out.println("Question10=============================For");
		Account[] arrayacc = { acc1, acc2 };
		for (int o = 0; o < arrayacc.length; o++) {
			System.out.println("Thông tin account thứ " + (o + 1) + "là:");
			System.out.println("email:" + arrayacc[o].email);
			System.out.println("phong ban: " + arrayacc[o].department.name);

		}
//		Question 11:
//			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//			Thông tin department thứ 1 là:
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là:
//			Id: 2
//			Name: Marketing
		System.out.println("Question11=============================For");
		Department[] arraydep = { dep1, dep2 };
		for (int i = 0; i < arraydep.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + "la :");
			System.out.println("Name :" + arraydep[i].name);
		}
//		Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		System.out.println("Question12=============================For");
		Department[] arrayDep12 = { dep1, dep2, dep3, dep4, dep5, dep6, dep7 };
		for (int i = 0; i < 2; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + "la :");
			System.out.println("Name :" + arrayDep12[i].name);

		}
//		Question 13:
//			In ra thông tin tất cả các account ngoại trừ account thứ 2
		System.out.println("Question13=============================For");
		Account[] arrayACC1 = { acc1, acc2, acc3, acc4 };
		for (int o = 0; o < arrayACC1.length; o++) {
			if (o != 1) {
				System.out.println("Thông tin account thứ " + (o + 1) + "là:");
				System.out.println("email:" + arrayACC1[o].email);
				System.out.println("phong ban: " + arrayACC1[o].department.name);
				System.out.println("fullname:" + arrayACC1[o].fullName);
				System.out.println("possition:" + arrayACC1[o].pos.name);
			}
		}
//		In ra thông tin tất cả các account có id < 4
		System.out.println("Question14=============================For");
		Account[] arrayACC2 = { acc1, acc2, acc3, acc4 };
		for (int o = 0; o < arrayACC2.length; o++) {
			if (arrayACC2[o].id < 4) {
				System.out.println("Thông tin account thứ " + (o + 1) + "là:");
				System.out.println("email:" + arrayACC2[o].email);
				System.out.println("phong ban: " + arrayACC2[o].department.name);
				System.out.println("fullname:" + arrayACC2[o].fullName);
				System.out.println("possition:" + arrayACC2[o].pos.name);
			}
		}
//		In ra các số chẵn nhỏ hơn hoặc bằng 20
		System.out.println("Question15=============================For");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}

//		WHILE
//		Question 16:
//		Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//		lệnh break, continue

		System.out.println("Question16=================================While");
//		while 10
		Account[] arrayacc10 = { acc1, acc2, acc3, acc4 };
		int e = 0;
		while (e < arrayacc10.length) {
			System.out.println("Thông tin account thứ " + (e + 1) + "là:");
			System.out.println("email:" + arrayacc10[e].email);
			System.out.println("phong ban: " + arrayacc10[e].department.name);
			e++;
		}
		System.out.println("======================================16,1");

		Department[] departmen11 = { dep1, dep2, dep3, dep4, dep5, dep6, dep7 };
		int u = 0;
		while (u < departmen11.length) {
			System.out.println("thông tin phòng ban thứ: " + (u + 1) + "là:");
			System.out.println("ID:" + departmen11[u].id);
			System.out.println("Name : " + departmen11[u].name);
			u++;
		}
		System.out.println("======================================16,2");

		Department[] departmen12 = { dep1, dep2, dep3, dep4, dep5, dep6, dep7 };
		int i = 0;
		while (i < 2) {
			System.out.println("thông tin phòng ban thứ: " + (i + 1) + "là:");
			System.out.println("ID:" + departmen12[i].id);
			System.out.println("Name : " + departmen12[i].name);
			i++;
		}

		System.out.println("======================================16,4");

		Account[] arrayACC14 = { acc1, acc2, acc3, acc4 };
		int q = 0;
		while (q < arrayACC14.length) {
			if (arrayACC14[q].id < 4) {
				System.out.println("Thông tin account thứ " + (q + 1) + "là:");
				System.out.println("email:" + arrayACC1[q].email);
				System.out.println("phong ban: " + arrayACC14[q].department.name);
				System.out.println("fullname:" + arrayACC14[q].fullName);
				System.out.println("Chuc vu:" + arrayACC14[q].pos.name);
				q++;
			}

		}
		System.out.println("======================================16,5");
		int i1 = 0;
		while (i1 <= 20) {
			if (i1 % 2 == 0) {
				System.out.println("i = " + i1);
			}
		}
		System.out.println("Question17======================================DO_While");
		Account[] arrayacc1 = { acc1, acc2 };
		int o = 0;
		do {
			System.out.println("Thông tin account thứ " + (o + 1) + "là:");
			System.out.println("email:" + arrayacc1[o].email);
			System.out.println("phong ban: " + arrayacc1[o].department.name);
			o++;
		} while (o < arrayacc1.length);
//		Exercise 2 (Optional): System out printf
//		Question 1:
//		Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//		nguyên đó
		System.out.println("Exercise 2=================================Question 1");
		int i2=5;
		System.out.println("%d%n" + i2);
		
//		Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//				ra số nguyên đó thành định dạng như sau: 100,000,000
		System.out.println("Exercise 2=================================Question 2");
	}
}
