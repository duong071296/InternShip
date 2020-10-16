package vn.omt.bai4;

import java.util.ArrayList;
import java.util.Scanner;

import vn.omt.quanlythuvien.Helper;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static String[] arr;
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t Nhập vào số phần tử trong mảng");
		try {
			n = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException ex) {
			System.out.println("Lỗi: Bạn nhập không hợp lệ!!");
			return;
		} catch (Exception ex) {
			System.out.println("Lỗi: " + ex.getMessage());
		}
		arr = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("nhập phần tử thứ %d: ", i);
			arr[i] = scan.nextLine();
		}

		do {
			System.out.println();
			System.out.println("1. In ra tất cả các chữ, cách nhau bởi khoảng trắng");
			System.out.println("2. Thêm một chữ vào 1 khoảng bất kì trong mảng");
			System.out.println("3. Tìm vị trí chữ được nhập vào");
			System.out.println("4. Thoát");
			System.out.println("Mời bạn chọn");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				in();
				break;
			case 2:
				them();
				break;
			case 3:
				tim();
				break;
			case 4:
				System.out.println("Đã thoát!!");
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ");
			}

		} while (true);
	}

	private static void in() {
		// TODO Auto-generated method stub
		System.out.println("Mảng vừa nhập là: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		System.out.println("----------------------------------");

	}

	private static void them() {
		// TODO Auto-generated method stub
		System.out.println("Nhập vị trí mà bạn muốn thêm: ");
		int viTri = Integer.parseInt(scan.nextLine());
		if (viTri > n) {
			System.out.println("Bạn nhập vượt quá số phần tử");
			return;
		}
		String[] arr2 = new String[n + 1];
		System.arraycopy(arr, 0, arr2, 0, viTri);
		String a;
		System.out.println("Nhập vào phần tử bạn muốn thêm: ");
		a = scan.nextLine();
		arr2[viTri] = a;
		System.arraycopy(arr, viTri, arr2, viTri + 1, n - viTri);
		System.out.println("Mảng sau khi thêm là: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

	private static void tim() {
		// TODO Auto-generated method stub
		System.out.println("Nhập vào phần tử mà bạn muốn tìm vị trí: ");
		String a = scan.nextLine();
		int b = 0;
		for (int i = 0; i < n; i++) {
			if (a.equalsIgnoreCase(arr[i])) {
				System.out.println("Vị trí của phần tử là: " + i);
			} else {
				b++;
			}
			if (b == n) {
				System.out.println("Không có phần tử cần tìm");
			}
		}

	}

}
