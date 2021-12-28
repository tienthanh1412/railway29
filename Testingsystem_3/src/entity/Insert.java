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
		Group group1 = new Group(1, "nhÃ³m 1", LocalDate.of(2021, 02, 19));
		Group group2 = new Group(2, "nhÃ³m 2", LocalDate.of(2021, 06, 11));
		Group group3 = new Group(3, "nhÃ³m 3", LocalDate.of(2015, 04, 28));
		Group group4 = new Group(4, "nhÃ³m 4", LocalDate.of(2013, 07, 12));
		Group group5 = new Group(5, "nhÃ³m 5", LocalDate.of(2020, 11, 19));
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

//		Kiá»ƒm tra account thá»© 2
//		Náº¿u khÃ´ng cÃ³ phÃ²ng ban (tá»©c lÃ  department == null) thÃ¬ sáº½ in ra text
//		"NhÃ¢n viÃªn nÃ y chÆ°a cÃ³ phÃ²ng ban"
//		Náº¿u khÃ´ng thÃ¬ sáº½ in ra text "PhÃ²ng ban cá»§a nhÃ¢n viÃªn nÃ y lÃ  ...
		System.out.println("Question1================================if");
		if (acc2.department == null) {
			System.out.println("NhÃ¢n viÃªn nÃ y chÆ°a cÃ³ phÃ²ng ban");
		} else {
			System.out.println("PhÃ²ng ban cá»§a nhÃ¢n viÃªn nÃ y lÃ  : " + acc2.department.name);
		}

//		Kiá»ƒm tra account thá»© 2
//		Náº¿u khÃ´ng cÃ³ group thÃ¬ sáº½ in ra text "NhÃ¢n viÃªn nÃ y chÆ°a cÃ³ group"
//		Náº¿u cÃ³ máº·t trong 1 hoáº·c 2 group thÃ¬ sáº½ in ra text "Group cá»§a nhÃ¢n viÃªn
//		nÃ y lÃ  Java Fresher, C# Fresher"
//		Náº¿u cÃ³ máº·t trong 3 Group thÃ¬ sáº½ in ra text "NhÃ¢n viÃªn nÃ y lÃ  ngÆ°á»i
//		quan trá»ng, tham gia nhiá»u group"
//		Náº¿u cÃ³ máº·t trong 4 group trá»Ÿ lÃªn thÃ¬ sáº½ in ra text "NhÃ¢n viÃªn nÃ y lÃ 
//		ngÆ°á»i hÃ³ng chuyá»‡n, tham gia táº¥t cáº£ cÃ¡c group"

		System.out.println("Question2================================if");

		if (acc2.groups == null) {
			System.out.println("NhÃ¢n viÃªn nÃ y chÆ°a cÃ³ group");
		} else {
			int totalgroup = acc2.groups.length;
			if (totalgroup <= 2) {
				System.out.println("Group cá»§a nhÃ¢n viÃªn nÃ y lÃ  Java Fresher, C# Fresher");
			}
			if (totalgroup == 3) {
				System.out.println("NhÃ¢n viÃªn nÃ y lÃ  ngÆ°á»i quan trá»ng, tham gia nhiá»u group");
			}
			if (totalgroup == 4) {
				System.out.println("NhÃ¢n viÃªn nÃ y lÃ  ngÆ°á»i hÃ³ng chuyá»‡n, tham gia táº¥t cáº£ cÃ¡c group");
			}
		}
		System.out.println("Question3================================ternary");
		System.out.println(acc2.department == null ? "NhÃ¢n viÃªn nÃ y chÆ°a cÃ³ phÃ²ng ban"
				: "PhÃ²ng ban cá»§a nhÃ¢n viÃªn nÃ y lÃ  :" + acc2.department.name);

//Sá»­ dá»¥ng toÃ¡n tá»­ ternary Ä‘á»ƒ lÃ m yÃªu cáº§u sau:
//Kiá»ƒm tra Position cá»§a account thá»© 1
//Náº¿u Position = Dev thÃ¬ in ra text "ÄÃ¢y lÃ  Developer"
//Náº¿u khÃ´ng pháº£i thÃ¬ in ra text "NgÆ°á»i nÃ y khÃ´ng pháº£i lÃ  Developer"
		System.out.println("Question4==============================ternary");

		System.out
				.println(acc1.pos.name.toString() == "DEV" ? "ÄÃ¢y lÃ  Developer" : "NgÆ°á»i nÃ y khÃ´ng pháº£i lÃ  Developer");

//		Question 5:
//			Láº¥y ra sá»‘ lÆ°á»£ng account trong nhÃ³m thá»© 1 vÃ  in ra theo format sau:
//			Náº¿u sá»‘ lÆ°á»£ng account = 1 thÃ¬ in ra "NhÃ³m cÃ³ má»™t thÃ nh viÃªn"
//			Náº¿u sá»‘ lÆ°á»£ng account = 2 thÃ¬ in ra "NhÃ³m cÃ³ hai thÃ nh viÃªn"
//			Náº¿u sá»‘ lÆ°á»£ng account = 3 thÃ¬ in ra "NhÃ³m cÃ³ ba thÃ nh viÃªn"
//			CÃ²n láº¡i in ra "NhÃ³m cÃ³ nhiá»u thÃ nh viÃªn"
		System.out.println("Question5=====================Switch case");

		if (group1 == null) {
			System.out.println("nhom khong co thanh vien");
		} else {
			int totalacc = group1.accounts.length;
			switch (totalacc) {
			case 1:
				System.out.println("1 thÃ¬ in ra \"NhÃ³m cÃ³ má»™t thÃ nh viÃªn");

				;
				break;
			case 2:
				System.out.println("NhÃ³m cÃ³ hai thÃ nh viÃªn");

				;
				break;
			case 3:
				System.out.println("NhÃ³m cÃ³ ba thÃ nh viÃªn");

				;
				break;

			default:
				System.out.println("NhÃ³m cÃ³ nhiá»u thÃ nh viÃªn");
				break;
			}
		}

//		Question 6:
//			Sá»­ dá»¥ng switch case Ä‘á»ƒ lÃ m láº¡i Question 2
//		Kiá»ƒm tra account thá»© 2
//		Náº¿u khÃ´ng cÃ³ group thÃ¬ sáº½ in ra text "NhÃ¢n viÃªn nÃ y chÆ°a cÃ³ group"
//		Náº¿u cÃ³ máº·t trong 1 hoáº·c 2 group thÃ¬ sáº½ in ra text "Group cá»§a nhÃ¢n viÃªn
//		nÃ y lÃ  Java Fresher, C# Fresher"
//		Náº¿u cÃ³ máº·t trong 3 Group thÃ¬ sáº½ in ra text "NhÃ¢n viÃªn nÃ y lÃ  ngÆ°á»i
//		quan trá»ng, tham gia nhiá»u group"
//		Náº¿u cÃ³ máº·t trong 4 group trá»Ÿ lÃªn thÃ¬ sáº½ in ra text "NhÃ¢n viÃªn nÃ y lÃ 
//		ngÆ°á»i hÃ³ng chuyá»‡n, tham gia táº¥t cáº£ cÃ¡c group"
		System.out.println("question6=============================Switch case ");
		if (acc2.pos == null) {
			System.out.println("NhÃ¢n viÃªn nÃ y chÆ°a cÃ³ group");
		} else {
			int accofgroup = acc2.groups.length;
			switch (accofgroup) {
			case 1:
				System.out.println("Group cá»§a nhÃ¢n viÃªn nÃ y lÃ  Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group cá»§a nhÃ¢n viÃªn nÃ y lÃ  Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("NhÃ¢n viÃªn nÃ y lÃ  ngÆ°á»i quan trá»ng, tham gia nhiá»u group");
				break;

			default:
				System.out.println("NhÃ¢n viÃªn nÃ y lÃ  ngÆ°á»i hÃ³ng chuyá»‡n, tham gia táº¥t cáº£ cÃ¡c group");
				break;
			}

		}
		// Sá»­ dá»¥ng toÃ¡n tá»­ ternary Ä‘á»ƒ lÃ m yÃªu cáº§u sau:
		// Kiá»ƒm tra Position cá»§a account thá»© 1
		// Náº¿u Position = Dev thÃ¬ in ra text "ÄÃ¢y lÃ  Developer"
		// Náº¿u khÃ´ng pháº£i thÃ¬ in ra text "NgÆ°á»i nÃ y khÃ´ng pháº£i lÃ  Developer"
		System.out.println("question7=================================Switch case");
		String posname = acc1.pos.toString();
		switch (posname) {
		case "DEV": {
			System.out.println("ÄÃ¢y lÃ  Developer");

		}
		default:
			System.out.println("NgÆ°á»i nÃ y khÃ´ng pháº£i lÃ  Developer");
			break;
		}
//		Question 8:
//			In ra thÃ´ng tin cÃ¡c account bao gá»“m: Email, FullName vÃ  tÃªn phÃ²ng ban cá»§a
//			há»
		System.out.println("question8=================================FOREACH");
		Account[] arrayACC = { acc1, acc2, acc3, acc4 };
		for (Account account : arrayACC) {
			System.out.println("email la :" + account.email + ",  FullName la :" + account.fullName + "," + ""
					+ "tÃªn phÃ²ng ban:" + account.department.name);
		}
//		In ra thÃ´ng tin cÃ¡c phÃ²ng ban bao gá»“m: id vÃ  name
		System.out.println("Question9===================================Foreach");
		Department[] arrayDep = { dep1, dep2, dep3, dep4, dep5, dep6, dep7 };
		for (Department dep : arrayDep) {
			System.out.println("Thong tin phong ban id =" + dep.id + ",Name =" + dep.name);
		}

////		Question 10:
//		In ra thÃ´ng tin cÃ¡c account bao gá»“m: Email, FullName vÃ  tÃªn phÃ²ng ban cá»§a
//		há» theo Ä‘á»‹nh dáº¡ng nhÆ° sau:
//		ThÃ´ng tin account thá»© 1 lÃ :
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyá»…n VÄƒn A
//		PhÃ²ng ban: Sale
//		ThÃ´ng tin account thá»© 2 lÃ :
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyá»…n VÄƒn B
//		PhÃ²ng ban: Marketting
		System.out.println("Question10=============================For");
		Account[] arrayacc = { acc1, acc2 };
		for (int o = 0; o < arrayacc.length; o++) {
			System.out.println("ThÃ´ng tin account thá»© " + (o + 1) + "lÃ :");
			System.out.println("email:" + arrayacc[o].email);
			System.out.println("phong ban: " + arrayacc[o].department.name);

		}
//		Question 11:
//			In ra thÃ´ng tin cÃ¡c phÃ²ng ban bao gá»“m: id vÃ  name theo Ä‘á»‹nh dáº¡ng sau:
//			ThÃ´ng tin department thá»© 1 lÃ :
//			Id: 1
//			Name: Sale
//			ThÃ´ng tin department thá»© 2 lÃ :
//			Id: 2
//			Name: Marketing
		System.out.println("Question11=============================For");
		Department[] arraydep = { dep1, dep2 };
		for (int i = 0; i < arraydep.length; i++) {
			System.out.println("ThÃ´ng tin department thá»© " + (i + 1) + "la :");
			System.out.println("Name :" + arraydep[i].name);
		}
//		Chá»‰ in ra thÃ´ng tin 2 department Ä‘áº§u tiÃªn theo Ä‘á»‹nh dáº¡ng nhÆ° Question 10
		System.out.println("Question12=============================For");
		Department[] arrayDep12 = { dep1, dep2, dep3, dep4, dep5, dep6, dep7 };
		for (int i = 0; i < 2; i++) {
			System.out.println("ThÃ´ng tin department thá»© " + (i + 1) + "la :");
			System.out.println("Name :" + arrayDep12[i].name);

		}
//		Question 13:
//			In ra thÃ´ng tin táº¥t cáº£ cÃ¡c account ngoáº¡i trá»« account thá»© 2
		System.out.println("Question13=============================For");
		Account[] arrayACC1 = { acc1, acc2, acc3, acc4 };
		for (int o = 0; o < arrayACC1.length; o++) {
			if (o != 1) {
				System.out.println("ThÃ´ng tin account thá»© " + (o + 1) + "lÃ :");
				System.out.println("email:" + arrayACC1[o].email);
				System.out.println("phong ban: " + arrayACC1[o].department.name);
				System.out.println("fullname:" + arrayACC1[o].fullName);
				System.out.println("possition:" + arrayACC1[o].pos.name);
			}
		}
//		In ra thÃ´ng tin táº¥t cáº£ cÃ¡c account cÃ³ id < 4
		System.out.println("Question14=============================For");
		Account[] arrayACC2 = { acc1, acc2, acc3, acc4 };
		for (int o = 0; o < arrayACC2.length; o++) {
			if (arrayACC2[o].id < 4) {
				System.out.println("ThÃ´ng tin account thá»© " + (o + 1) + "lÃ :");
				System.out.println("email:" + arrayACC2[o].email);
				System.out.println("phong ban: " + arrayACC2[o].department.name);
				System.out.println("fullname:" + arrayACC2[o].fullName);
				System.out.println("possition:" + arrayACC2[o].pos.name);
			}
		}
//		In ra cÃ¡c sá»‘ cháºµn nhá» hÆ¡n hoáº·c báº±ng 20
		System.out.println("Question15=============================For");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}

//		WHILE
//		Question 16:
//		LÃ m láº¡i cÃ¡c Question á»Ÿ pháº§n FOR báº±ng cÃ¡ch sá»­ dá»¥ng WHILE káº¿t há»£p vá»›i
//		lá»‡nh break, continue

		System.out.println("Question16=================================While");
//		while 10
		Account[] arrayacc10 = { acc1, acc2, acc3, acc4 };
		int e = 0;
		while (e < arrayacc10.length) {
			System.out.println("ThÃ´ng tin account thá»© " + (e + 1) + "lÃ :");
			System.out.println("email:" + arrayacc10[e].email);
			System.out.println("phong ban: " + arrayacc10[e].department.name);
			e++;
		}
//		while 11
		Department[] departmen11 = { dep1, dep2, dep3, dep4, dep5, dep6, dep7 };
		int u = 0;
		while (u < departmen11.length) {
			System.out.println("thÃ´ng tin phÃ²ng ban thá»©: " + (u + 1) + "lÃ :");
			System.out.println("ID:" + departmen11[u].id);
			System.out.println("Name : " + departmen11[u].name);
			u++;
		}

//		while 12
		Department[] departmen12 = { dep1, dep2, dep3, dep4, dep5, dep6, dep7 };
		int i = 0;
		while (i < 2) {
			System.out.println("thÃ´ng tin phÃ²ng ban thá»©: " + (i + 1) + "lÃ :");
			System.out.println("ID:" + departmen12[i].id);
			System.out.println("Name : " + departmen12[i].name);
			i++;
		}
//		while 13
		Account[] arrayACC13 = { acc1, acc2, acc3, acc4 };
		int r = 0;
		while (r < arrayACC13.length) {
			if (r != 1) {
				System.out.println("ThÃ´ng tin account thá»© " + (r + 1) + "lÃ :");
				System.out.println("email:" + arrayACC1[r].email);
				System.out.println("phong ban: " + arrayACC13[r].department.name);
				System.out.println("fullname:" + arrayACC13[r].fullName);
				System.out.println("possition:" + arrayACC13[r].pos.name);
				r++;
			}
		}

}
}
