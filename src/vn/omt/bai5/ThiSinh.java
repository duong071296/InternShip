package vn.omt.bai5;

import java.util.ArrayList;

public class ThiSinh {
	String soBaoDanh;
	String hoTen;
	String diaChi;
	String uuTien;
	KhoiThi khoiThi;
	ArrayList<KhoiThi> listK = new ArrayList<KhoiThi>();
	public ThiSinh() {
		
		// TODO Auto-generated constructor stub
	}
	public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String uuTien, KhoiThi khoiThi) {
		
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.uuTien = uuTien;
		this.khoiThi = khoiThi;
	}
	public KhoiThi getKhoiThi() {
		return khoiThi;
	}
	public void setKhoiThi(KhoiThi khoiThi) {
		this.khoiThi = khoiThi;
	}
	public String getSoBaoDanh() {
		return soBaoDanh;
	}
	public void setSoBaoDanh(String soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getUuTien() {
		return uuTien;
	}
	public void setUuTien(String uuTien) {
		this.uuTien = uuTien;
	}
	
	
	public void nhapThiSinh() {
		khoiThi = new KhoiThi();
		System.out.println("\t Nhập vào số báo danh: ");
		soBaoDanh = Helper.scan.nextLine();
		if (soBaoDanh.length() == 0) {
			System.out.println("\t Số báo danh không được để trống");
			return;
		}
		
		System.out.println("\t Nhập vào tên thí sinh: ");
		hoTen = Helper.scan.nextLine();
		if (hoTen.length() == 0) {
			System.out.println("\t Họ tên không được để trống");
			return;
		}
		
		System.out.println("\t Nhập vào địa chỉ: ");
		diaChi = Helper.scan.nextLine();
		if (diaChi.length() == 0) {
			System.out.println("\t Địa chỉ không được để trống");
			return;
		}
		
		System.out.println("\t Nhập vào ưu tiên: ");
		uuTien = Helper.scan.nextLine();
		if (uuTien.length() == 0) {
			System.out.println("\t Ưu tiên không được để trống");
			return;
		}
		
		System.out.println("\t Nhập Khối Thi A hoặc B hoặc C");
		String kT = Helper.scan.nextLine();
		khoiThi.setTenKhoiThi(kT);
		if(!khoiThi.getTenKhoiThi().equalsIgnoreCase("A") 
				&& !khoiThi.getTenKhoiThi().equalsIgnoreCase("B") && !khoiThi.getTenKhoiThi().equalsIgnoreCase("C")) {
			khoiThi.setTenKhoiThi(null);
			System.out.println("Không hợp lệ");
			
		}
//		listK.add(new KhoiThi("toán","lý","hóa"));
//		listK.add(new KhoiThi("toán","hóa","sinh"));
//		listK.add(new KhoiThi("văn","sử","địa"));

		

	}
	
	public void hienThi() {

		System.out.println("\t Số báo danh: " + soBaoDanh);
		System.out.println("\t Họ tên: " + hoTen);
		System.out.println("\t Địa chỉ: " + diaChi);
		System.out.println("\t Ưu tiên: " + uuTien);
		System.out.println("\t Khối Thi: " + khoiThi.getTenKhoiThi());
		System.out.println("----------------------------------");
		System.out.println();
	}
}
