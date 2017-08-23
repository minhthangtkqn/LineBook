package form;

import java.util.ArrayList;

import model.bean.BaiRaoBan;

import org.apache.struts.action.ActionForm;

public class TrangCaNhanNguoiDungForm extends ActionForm {

	private String tenTaiKhoan;
	private String hoTen;
	private String email;
	private String soDienThoai;

	private ArrayList<BaiRaoBan> dsChoDuyet;
	private ArrayList<BaiRaoBan> dsDangBan;
	private ArrayList<BaiRaoBan> dsDaBan;
	private ArrayList<BaiRaoBan> dsGoiY;

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public ArrayList<BaiRaoBan> getDsChoDuyet() {
		return dsChoDuyet;
	}

	public void setDsChoDuyet(ArrayList<BaiRaoBan> dsChoDuyet) {
		this.dsChoDuyet = dsChoDuyet;
	}

	public ArrayList<BaiRaoBan> getDsDangBan() {
		return dsDangBan;
	}

	public void setDsDangBan(ArrayList<BaiRaoBan> dsDangBan) {
		this.dsDangBan = dsDangBan;
	}

	public ArrayList<BaiRaoBan> getDsDaBan() {
		return dsDaBan;
	}

	public void setDsDaBan(ArrayList<BaiRaoBan> dsDaBan) {
		this.dsDaBan = dsDaBan;
	}

	public ArrayList<BaiRaoBan> getDsGoiY() {
		return dsGoiY;
	}

	public void setDsGoiY(ArrayList<BaiRaoBan> dsGoiY) {
		this.dsGoiY = dsGoiY;
	}

}
