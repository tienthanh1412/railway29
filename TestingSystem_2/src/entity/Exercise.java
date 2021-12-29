package entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {

//	Exercise 2 (Optional): System out printf
//	Question 1:
//	Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//	nguyên đó
		System.out.println("Exercise 2=================================Question 1");
		int i = 5;
		System.out.printf("%d%n", i);

//	Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//			ra số nguyên đó thành định dạng như sau: 100,000,000
		System.out.println("Exercise 2=================================Question 2");
		int i2 = 100000000;
		System.out.printf("%,d%n", i2);

//		Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//				thực đó chỉ bao gồm 4 số đằng sau
		System.out.println("Exercise 2=================================Question 3");
		float i3 = 5.567098f;
		System.out.printf("%5.4f%n", i3);

//		Question 4:
//			Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//			dạng như sau:
//			Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//			Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
		System.out.println("Exercise 2=================================Question 4");
		String s = "Nguyễn Văn A";
		System.out.println("Tên tôi là \"" + s + "\" và tôi đang độc thân\n");

		System.out.println("Exercise 2=================================Question 5");
//		Question 5:
//			Lấy thời gian bây giờ và in ra theo định dạng sau:
//			24/04/2020 11h:16p:20s
		System.out.println("-------------Question 5:-------------");
		String pattern = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);

//			Exercise 4 (Optional): Random Number
//			lay ra ngau nhien 1 so nguyen
		System.out.println("Exercise 4=====================question1");
		Random random = new Random();
		int q = random.nextInt();
		System.out.println("So ngau nhien :" + q);

		System.out.println("Question 2: In ngẫu nhiên ra 1 số thực");

		float f = random.nextFloat();
		System.out.println("Số ngẫu nhiên: " + f);

	}
}
