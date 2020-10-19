package vn.omt.quanlythuvien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class QuanLyThuVien {
	// AnhTT
	// Hiểu chưa đủ yêu cầu đề bài
	// Đề bài yêu cầu "Với mỗi thẻ sẽ lưu các thông tin sau: Mã phiếu mượn, ngày
	// mượn, hạn trả, số hiệu sách, và các thông tin cá nhân của sinh viên mượn
	// sách. Các thông tin của sinh viên mượn sách bao gồm: Họ tên, tuổi, lớp."
	// Nghĩa là mỗi thẻ có thể mượn được nhiều sách.
	// Hiện tại trong bài, một thẻ chỉ có thể mượn một sách, không tra cứu được một
	// sinh viên đang mượn bao nhiêu sách
	// Chưa có check trùng khi nhập trùng mã thẻ
	// Yêu cầu thêm, xóa theo mã phiếu mượn chứ không phải mã thẻ
	// Gợi ý:
	// - Danh sách tính năng: 1. Thêm thẻ mượn, 2. Xóa thẻ mượn, 3. Hiển thị danh
	// sách thẻ mượn, 4. Mượn sách, 5. Trả sách
	// - Một thẻ mượn có nhiều phiếu mượn, khi mượn sách -> chọn sinh viên cần mượn
	// sách, thêm phiếu mượn vào thẻ
	// - Khi trả sách, nhập mã phiếu mượn -> tìm thẻ mượn có chứa phiếu mượn -> xóa
	// phiếu mượn ra khỏi thẻ mượn
	public static ArrayList<TheMuon> list = new ArrayList<TheMuon>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("=================QUẢN LÝ THƯ VIỆN==================");
			System.out.println("1. Thêm thẻ mượn : ");
			System.out.println("2. Xóa thẻ mượn: ");
			System.out.println("3. Hiển thị danh sách thẻ mượn: ");
			System.out.println("4. Mượn sách: ");
			System.out.println("5. Trả sách: ");
			System.out.println("6. Thoát");
			int chon = Integer.parseInt(Helper.scan.nextLine());
			switch (chon) {
			case 1:
				themThe();
				break;
			case 2:
				xoaThe();
				break;
			case 3:
				hienThi();
				break;
			case 4:
				muonSach();
				break;
			case 5:
				traSach();
				break;
			case 6:
				System.out.println("Đã đóng chương trình");
				return;
			default:
				System.out.println("Lựa chọn của bạn không hợp lê");
			}
		} while (true);
	}

	private static void traSach() {
		System.out.println("Nhập tên sinh viên: ");
		String ten = Helper.scan.nextLine();

		for (TheMuon theMuon : list) {
			if (theMuon.getSinhVien().getHoTen().compareTo(ten) != 0) {
				System.out.println("Không tồn tại sinh viên!!");
				return;
			}
				System.out.println("Nhập mã phiếu mượn cần xóa: ");
				String maPhieu = Helper.scan.nextLine();
				for (int i = 0; i < theMuon.getListPhieuMuon().size(); i++) {
					if (theMuon.getListPhieuMuon().get(i).getMaPhieuMuon().equalsIgnoreCase(maPhieu)) {
						theMuon.getListPhieuMuon().remove(theMuon.getListPhieuMuon().get(i));
						System.out.println("Đã xóa!!");
						return;
					}
				}
				
			}
		System.out.println("Không tồn tại mã phiếu mượn!!");

		}

	private static void muonSach() {
		PhieuMuon phieuMuon = new PhieuMuon();
		System.out.println("\t Nhập tên sinh viên cần mượn: ");
		String muonS = Helper.scan.nextLine();
		for (TheMuon theMuon : list) {

			if (theMuon.getSinhVien().getHoTen().equalsIgnoreCase(muonS)) {
				phieuMuon.nhapPhieu();
				for(int i = 0;i<theMuon.getListPhieuMuon().size();i++) {
					if(theMuon.getListPhieuMuon().get(i).getMaPhieuMuon().equalsIgnoreCase(phieuMuon.getMaPhieuMuon())) {
						System.out.println("Mã phiếu đã tồn tại");
						return;
					}
				}
				theMuon.getListPhieuMuon().add(phieuMuon);
				return;
			}
		}
		System.out.println("Sinh viên không tồn tại");
	}

	private static void themThe() {
		// TODO Auto-generated method stub
		SinhVien sV = new SinhVien();
		TheMuon theMuon = new TheMuon();
		theMuon.nhapThe();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSinhVien().getHoTen() == theMuon.getSinhVien().getHoTen()) {
				System.out.println("Sinh viên đã tồn tại!!");
				return;
			}
		}
		if (theMuon.getSinhVien().getHoTen() == null || theMuon.getSinhVien().getLop() == null
				|| theMuon.getSinhVien().getTuoi() == 0)
			return;

		list.add(theMuon);
		System.out.println("Thêm thành công!!");
		System.out.println();
	}

	private static void xoaThe() {
		// TODO Auto-generated method stub
		// AnhTT: Tại sao lại nhập mã phiếu mượn trong vòng for?
		// Thử chạy chương trình với danh sách nhiều thẻ sẽ hiểu vì sao có câu hỏi đó

		System.out.println("Nhập tên sinh viên: ");
		String ten = Helper.scan.nextLine();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSinhVien().getHoTen().equalsIgnoreCase(ten)) {
				list.remove(list.get(i));
				System.out.println("Đã xóa!!");
				return;
			}	
		}
		System.out.println("Không tồn tại sinh viên");
	}

	private static void hienThi() {
		for (TheMuon theMuon : list) {
			System.out.println();
			theMuon.getSinhVien().hienThiSv();
			for (int i = 0; i < theMuon.getListPhieuMuon().size(); i++) {
				theMuon.getListPhieuMuon().get(i).hienThiPhieu();
			}

			System.out.println();
		}
	}

}
