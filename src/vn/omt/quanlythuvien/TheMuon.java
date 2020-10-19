package vn.omt.quanlythuvien;

import java.util.ArrayList;

public class TheMuon {
	SinhVien sinhVien;
	ArrayList<PhieuMuon> listPhieuMuon = new ArrayList<PhieuMuon>();

	public TheMuon() {
		
		// TODO Auto-generated constructor stub
	}

	public TheMuon(SinhVien sinhVien, PhieuMuon phieuMuon, ArrayList<PhieuMuon> listPhieuMuon) {
		
		this.sinhVien = sinhVien;
		this.listPhieuMuon = listPhieuMuon;
	}

	public SinhVien getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}

	public ArrayList<PhieuMuon> getListPhieuMuon() {
		return listPhieuMuon;
	}

	public void setListPhieuMuon(ArrayList<PhieuMuon> listPhieuMuon) {
		this.listPhieuMuon = listPhieuMuon;
	}

	public void nhapThe() {
		sinhVien = new SinhVien();
		sinhVien.nhapSv();
		if (sinhVien.getHoTen() == null || sinhVien.getTuoi() == 0 || sinhVien.getLop() == null)
			return;

//		System.out.println("\t Nhập mã phiếu mượn ");
//		String maPhieuMuon = Helper.scan.nextLine();
//		phieuMuon.setMaPhieuMuon(maPhieuMuon);
//		if (phieuMuon.getMaPhieuMuon() == null) {
//			System.out.println("Nhập không hợp lệ");
//			return;
//		}
//		
//
//		System.out.println("\t Nhập ngày mượn: ");
//		try {
//			
//			int nhapNgay = Integer.parseInt(Helper.scan.nextLine());
//			phieuMuon.setNgayMuon(nhapNgay);
//		} catch (NumberFormatException ex) {
//			System.out.println("Lỗi: Bạn nhập không hợp lệ!!");
//			phieuMuon.setNgayMuon(0);
//			return;
//		} catch (Exception ex) {
//			System.out.println("Lỗi: " + ex.getMessage());
//
//		}
//
//
//		System.out.println("\t Nhập hạn trả: ");
//		try {
//			int nhapHan = Integer.parseInt(Helper.scan.nextLine());
//			phieuMuon.setHanTra(nhapHan);
//		} catch (NumberFormatException ex) {
//			System.out.println("Lỗi: Bạn nhập không hợp lệ!!");
//			phieuMuon.setHanTra(0);
//			return;
//		} catch (Exception ex) {
//			System.out.println("Lỗi: " + ex.getMessage());
//		}
//
//		
//		System.out.println("\t Số hiệu sách");
//		String nhapSoHieu = Helper.scan.nextLine();
//		phieuMuon.setSoHieuSach(nhapSoHieu);
//		

	}



//	public void hienThiThe() {
//		sinhVien.hienThiSv();
//		
//	}

//	public void hienThiPhieu() {
//		System.out.println("\t Mã phiếu mượn: " + phieuMuon.getMaPhieuMuon());
//		System.out.println("\t Ngày mượn: " + phieuMuon.getNgayMuon());
//		System.out.println("\t Hạn trả: " + phieuMuon.getHanTra());
//		System.out.println("\t Số hiệu sách: " + phieuMuon.getSoHieuSach());
//		System.out.println("-----------------------------------------------------");
//		System.out.println();
//	}
}
