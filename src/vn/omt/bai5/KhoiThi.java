package vn.omt.bai5;

import java.util.ArrayList;

public class KhoiThi {
	String tenKhoiThi;
	String mon1;
	String mon2;
	String mon3;
	public KhoiThi() {
		
		// TODO Auto-generated constructor stub
	}
	public KhoiThi(String tenKhoiThi, String mon1, String mon2, String mon3) {
		this.tenKhoiThi = tenKhoiThi;
		this.mon1 = mon1;
		this.mon2 = mon2;
		this.mon3 = mon3;
	}
	public String getTenKhoiThi() {
		return tenKhoiThi;
	}
	public void setTenKhoiThi(String tenKhoiThi) {
		this.tenKhoiThi = tenKhoiThi;
	}
	public String getMon1() {
		return mon1;
	}
	public void setMon1(String mon1) {
		this.mon1 = mon1;
	}
	public String getMon2() {
		return mon2;
	}
	public void setMon2(String mon2) {
		this.mon2 = mon2;
	}
	public String getMon3() {
		return mon3;
	}
	public void setMon3(String mon3) {
		this.mon3 = mon3;
	}

}
