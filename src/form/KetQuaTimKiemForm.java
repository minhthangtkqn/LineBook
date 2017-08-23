package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.BaiRaoBan;
import model.bean.RaoBan;

public class KetQuaTimKiemForm extends ActionForm {
	private String tuKhoa;
	private String page;
	private ArrayList<BaiRaoBan> listRaoBan;
	private int soLuongKetQua;

	public int getSoLuongKetQua() {
		return soLuongKetQua;
	}

	public void setSoLuongKetQua(int soLuongKetQua) {
		this.soLuongKetQua = soLuongKetQua;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getTuKhoa() {
		return tuKhoa;
	}

	public void setTuKhoa(String tuKhoa) {
		this.tuKhoa = tuKhoa;
	}

	public ArrayList<BaiRaoBan> getListRaoBan() {
		return listRaoBan;
	}

	public void setListRaoBan(ArrayList<BaiRaoBan> listRaoBan) {
		this.listRaoBan = listRaoBan;
	}

}
