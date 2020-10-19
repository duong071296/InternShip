package vn.omt.bai5;

import java.util.ArrayList;

public class QuanLy {
	public static ArrayList<ThiSinh> listThiSinh = new ArrayList<ThiSinh>();
//	public static ArrayList<KhoiThi> listKhoiThi = new ArrayList<KhoiThi>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("1. Đăng ký: ");
			System.out.println("2. Hiển thị: ");
			System.out.println("3. Tìm thí sinh theo sbd: ");
			System.out.println("4. Tìm thí sinh theo khối: ");
			System.out.println("5. Thoát: ");
			int chon = Integer.parseInt(Helper.scan.nextLine());
			switch (chon) {
			case 1:
				dangKy();
				break;
			case 2:
				hienThi();
				break;
			case 3:
				timKiemSbd();
				break;
			case 4:
				timKiemTheoKhoi();
				break;
			case 5:
				System.out.println("Đã thoát!!");
				return;
			default:
				System.out.println("Không hơp lệ!!");
			}
		} while (true);
	}

	private static void timKiemTheoKhoi() {
		// TODO Auto-generated method stub
		System.out.println("Nhập khối thi: ");
		String kT = Helper.scan.nextLine();
		for (ThiSinh thiSinh : listThiSinh) {
			System.out.println("============DANH SÁCH THÍ SINH KHỐI " + kT + "=============");
			if (!thiSinh.getKhoiThi().getTenKhoiThi().equalsIgnoreCase(kT)) {
				System.out.println("Không có thí sinh nào");
				return;	
			}
			
			thiSinh.hienThi();
		}
		

	}

	private static void timKiemSbd() {
		// TODO Auto-generated method stub
		System.out.println("Nhập số báo danh: ");
		String sbd = Helper.scan.nextLine();
		for (int i=0;i<listThiSinh.size();i++) {
			if (!listThiSinh.get(i).getSoBaoDanh().equalsIgnoreCase(sbd)) {
				System.out.println("Không có thí sinh nào");
				return;
			} 
			listThiSinh.get(i).hienThi();
		}
		
	}

	private static void hienThi() {
		// TODO Auto-generated method stub
		System.out.println("============DANH SÁCH THÍ SINH=============");
		for (ThiSinh tS : listThiSinh) {
			System.out.println();
			tS.hienThi();
		}
	}

	private static void dangKy() {
		// TODO Auto-generated method stub
		ThiSinh tS = new ThiSinh();
		tS.nhapThiSinh();
		String sbd = tS.getSoBaoDanh();
		for(int i=0;i<listThiSinh.size();i++) {
			if(listThiSinh.get(i).getSoBaoDanh().equalsIgnoreCase(sbd)) {
				System.out.println("Thí sinh đã tồn tại");
				return;
			}
		}
		if (tS.getHoTen() == null || tS.getSoBaoDanh() == null || tS.getDiaChi() == null || tS.getUuTien() == null
				|| tS.getKhoiThi().getTenKhoiThi() == null)
			return;
		listThiSinh.add(tS);
	}

}
