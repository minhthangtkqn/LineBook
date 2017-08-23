package form;

import java.util.ArrayList;
import java.util.Date;

import model.bean.BaiRaoBan;
import model.bean.NguoiDung;
import model.bean.RaoBan;

import org.apache.struts.action.ActionForm;

public class TrangNguoiDungForm extends ActionForm {
	// private String maNguoiDung;
	// private int loaiNguoiDung;
	// private String taiKhoan;
	// private String hoTen;
	// private String tenTinh;
	// private String dienThoai;
	// private String email;
	// private int gioiTinh;
	// private int namSinh;
	// private String anh;

	private NguoiDung nguoiDung;

	private ArrayList<RaoBan> dsChoDuyet;
	private ArrayList<RaoBan> dsDangBan;
	private ArrayList<RaoBan> dsDaBan;
	private ArrayList<RaoBan> dsDaMua;

	private ArrayList<RaoBan> dsGoiY;

	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}

	public ArrayList<RaoBan> getDsChoDuyet() {
		return dsChoDuyet;
	}

	public void setDsChoDuyet(ArrayList<RaoBan> dsChoDuyet) {
		this.dsChoDuyet = dsChoDuyet;
	}

	public ArrayList<RaoBan> getDsDangBan() {
		return dsDangBan;
	}

	public void setDsDangBan(ArrayList<RaoBan> dsDangBan) {
		this.dsDangBan = dsDangBan;
	}

	public ArrayList<RaoBan> getDsDaBan() {
		return dsDaBan;
	}

	public void setDsDaBan(ArrayList<RaoBan> dsDaBan) {
		this.dsDaBan = dsDaBan;
	}

	public ArrayList<RaoBan> getDsGoiY() {
		return dsGoiY;
	}

	public void setDsGoiY(ArrayList<RaoBan> dsGoiY) {
		this.dsGoiY = dsGoiY;
	}

	public ArrayList<RaoBan> getDsDaMua() {
		return dsDaMua;
	}

	public void setDsDaMua(ArrayList<RaoBan> dsDaMua) {
		this.dsDaMua = dsDaMua;
	}

}
