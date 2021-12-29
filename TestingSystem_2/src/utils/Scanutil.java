package utils;

import java.util.Scanner;

public class Scanutil {
	public static void main(String[] args) {
		// nhan so nguyen tu ban phim
		//Exercise 5: Input from console
		//Question 1:
//			Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Mời bạn nhập vào 3 số nguyên");
//		System.out.println("Nhập vào số 1: ");
//		int a = sc.nextInt();
//		System.out.println("Nhập vào số 2: ");
//		int b = sc.nextInt();
//		System.out.println("Nhập vào số 3: ");
//		int c = sc.nextInt();

		System.out.println("Input from console==============Question1");
		Scanner scaner=new Scanner(System.in);
		
		System.out.println("Moi ban nhap vao so thu nhat:");
		int e=scaner.nextInt();
		System.out.println("Moi ban nhap vao so thu 2:");
		int e1=scaner.nextInt();
		System.out.println("Moi ban nhap vao so thu 3:");
		int e2=scaner.nextInt();
		
		System.out.println("Ban da nhap vao 3 so do la :" +e+","+e1+"," +e2+",");
		
	}



	
}


