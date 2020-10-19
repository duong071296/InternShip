package vn.omt.quanlythuvien;

public class PhieuMuon {
	String maPhieuMuon;
	int ngayMuon;
	int hanTra;
	String soHieuSach;
	public PhieuMuon() {
		
		// TODO Auto-generated constructor stub
	}
	public PhieuMuon(String maPhieuMuon, int ngayMuon, int hanTra, String soHieuSach) {
		
		this.maPhieuMuon = maPhieuMuon;
		this.ngayMuon = ngayMuon;
		this.hanTra = hanTra;
		this.soHieuSach = soHieuSach;
	}
	public String getMaPhieuMuon() {
		return maPhieuMuon;
	}
	public void setMaPhieuMuon(String maPhieuMuon) {
		this.maPhieuMuon = maPhieuMuon;
	}
	public int getNgayMuon() {
		return ngayMuon;
	}
	public void setNgayMuon(int ngayMuon) {
		this.ngayMuon = ngayMuon;
	}
	public int getHanTra() {
		return hanTra;
	}
	public void setHanTra(int hanTra) {
		this.hanTra = hanTra;
	}
	public String getSoHieuSach() {
		return soHieuSach;
	}
	public void setSoHieuSach(String soHieuSach) {
		this.soHieuSach = soHieuSach;
	}
	
	public void nhapPhieu() {
		System.out.println("\t Nhập mã phiếu mượn ");
		maPhieuMuon = Helper.scan.nextLine();
		if (maPhieuMuon == null) {
			System.out.println("Nhập không hợp lệ");
			return;
		}
		

		System.out.println("\t Nhập ngày mượn: ");
		try {
			
			ngayMuon = Integer.parseInt(Helper.scan.nextLine());
			
		} catch (NumberFormatException ex) {
			System.out.println("Lỗi: Bạn nhập không hợp lệ!!");
			setNgayMuon(0);
			return;
		} catch (Exception ex) {
			System.out.println("Lỗi: " + ex.getMessage());

		}


		System.out.println("\t Nhập hạn trả: ");
		try {
			hanTra = Integer.parseInt(Helper.scan.nextLine());
			
		} catch (NumberFormatException ex) {
			System.out.println("Lỗi: Bạn nhập không hợp lệ!!");
			setHanTra(0);
			return;
		} catch (Exception ex) {
			System.out.println("Lỗi: " + ex.getMessage());
		}

		
		System.out.println("\t Số hiệu sách");
		soHieuSach = Helper.scan.nextLine();
		
	}
	
	public void hienThiPhieu() {
		System.out.println("------------------------------------------------------");
		System.out.println("\t Mã phiếu mượn: " + maPhieuMuon);
		System.out.println("\t Ngày mượn: " + ngayMuon);
		System.out.println("\t Hạn trả: " + hanTra);
		System.out.println("\t Số hiệu sách: " + soHieuSach);
		System.out.println();
	}
}
