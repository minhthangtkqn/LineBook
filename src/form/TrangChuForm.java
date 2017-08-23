package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.BaiRaoBan;
import model.bean.Banner;

public class TrangChuForm extends ActionForm {
	private ArrayList<BaiRaoBan> dsMoiNhat;
	private ArrayList<BaiRaoBan> dsNgauNhien;
	private ArrayList<BaiRaoBan> dsDanhMucBanNhieu;
	private ArrayList<BaiRaoBan> dsGoiY;
	private ArrayList<Banner> dsBanner;

	public ArrayList<Banner> getDsBanner() {
		return dsBanner;
	}

	public void setDsBanner(ArrayList<Banner> dsBanner) {
		this.dsBanner = dsBanner;
	}

	public ArrayList<BaiRaoBan> getDsMoiNhat() {
		return dsMoiNhat;
	}

	public void setDsMoiNhat(ArrayList<BaiRaoBan> dsMoiNhat) {
		this.dsMoiNhat = dsMoiNhat;
	}

	public ArrayList<BaiRaoBan> getDsNgauNhien() {
		return dsNgauNhien;
	}

	public void setDsNgauNhien(ArrayList<BaiRaoBan> dsNgauNhien) {
		this.dsNgauNhien = dsNgauNhien;
	}

	public ArrayList<BaiRaoBan> getDsDanhMucBanNhieu() {
		return dsDanhMucBanNhieu;
	}

	public void setDsDanhMucBanNhieu(ArrayList<BaiRaoBan> dsDanhMucBanNhieu) {
		this.dsDanhMucBanNhieu = dsDanhMucBanNhieu;
	}

	public ArrayList<BaiRaoBan> getDsGoiY() {
		return dsGoiY;
	}

	public void setDsGoiY(ArrayList<BaiRaoBan> dsGoiY) {
		this.dsGoiY = dsGoiY;
	}
}
