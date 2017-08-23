package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.RaoBan;
import model.bo.RaoBanBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ChiTietBaiDangForm;

/**
 * SinhVienAction.java
 * 
 * Version 1.0
 * 
 * Date: Jan 21, 2015
 * 
 * Copyright
 * 
 * Modification Logs: DATE AUTHOR DESCRIPTION
 * ----------------------------------------------------------------------- Jan
 * 21, 2015 DaiLV2 Create
 */

public class ChiTietBaiDangAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		System.out.println("ChiTietBaiDangAction");
		
		HttpSession session = request.getSession();

		System.out.println("Ma rao ban: " + request.getParameter("maRaoBan"));
		
		// lay du lieu hien thi
		RaoBanBO raoBanBO = new RaoBanBO();
		ChiTietBaiDangForm chiTietBaiDangForm = (ChiTietBaiDangForm)form;
		
		RaoBan raoBan= raoBanBO.layThongTinBaiDang(request.getParameter("maRaoBan"));
		
		chiTietBaiDangForm.setMaRaoBan(raoBan.getMaRaoBan());
		chiTietBaiDangForm.setMaSach(raoBan.getMaSach());
		chiTietBaiDangForm.setMaNguoiRaoBan(raoBan.getMaNguoiRaoBan());
		chiTietBaiDangForm.setMaTinhBan(raoBan.getMaTinhBan());
		chiTietBaiDangForm.setTenTinhBan(raoBan.getTenTinhBan());
		chiTietBaiDangForm.setGia(raoBan.getGia());
		chiTietBaiDangForm.setMoTa(raoBan.getMoTa());
		chiTietBaiDangForm.setLinkAnh1(raoBan.getLinkAnh1());
		chiTietBaiDangForm.setLinkAnh2(raoBan.getLinkAnh2());
		chiTietBaiDangForm.setLinkAnh3(raoBan.getLinkAnh3());
		chiTietBaiDangForm.setLinkAnh4(raoBan.getLinkAnh4());
		chiTietBaiDangForm.setLinkAnh5(raoBan.getLinkAnh5());		
		chiTietBaiDangForm.setNgayBan(raoBan.getNgayBan());
		chiTietBaiDangForm.setHoTenNguoiBan(raoBan.getHoTenNguoiBan());
		chiTietBaiDangForm.setTaiKhoanNguoiBan(raoBan.getTaiKhoanNguoiBan());
		chiTietBaiDangForm.setAnhNguoiBan(raoBan.getAnhNguoiBan());
		if(raoBan.getGioiTinh()==0)
		chiTietBaiDangForm.setGioiTinh("Nữ");
		else
			if(raoBan.getGioiTinh()==1)
				chiTietBaiDangForm.setGioiTinh("Nam");
			else
				chiTietBaiDangForm.setGioiTinh("Chưa Xác Định");

		chiTietBaiDangForm.setNamSinhNguoiBan(raoBan.getNamSinhNguoiBan());
		chiTietBaiDangForm.setTenSach(raoBan.getTenSach());
		chiTietBaiDangForm.setMaDanhMuc(raoBan.getMaDanhMuc());
		chiTietBaiDangForm.setTenDanhMuc(raoBan.getTenDanhMuc());
		chiTietBaiDangForm.setNamxb(raoBan.getNamxb());
		chiTietBaiDangForm.setNxb(raoBan.getNxb());
		chiTietBaiDangForm.setTacGia(raoBan.getTacGia());
		
		
		
		
		
		
		
		
		
		
		
		// kiem tra nguoi dung de phan luong hien thi
		if (session.getAttribute("userID") == null)
			return mapping.findForward("xemCheDoKhach"); // neu chua dang nhap xem che do khach

		// Neu da dang nhap
		int userType = (Integer) session.getAttribute("type");
		String userID = (String) session.getAttribute("userID");

		if (userType == 2)
			return mapping.findForward("trangbichan");
		// Lay thong tin bai dang
		//
		//
		//
		if (userType == 1) {
			// Kiem tra chua mua
			return mapping.findForward("xemchedonguoidung");
			// Kiem tra da mua
//			return mapping.findForward("xemchedodamua");

		}

		if (userType == 0)
			return mapping.findForward("xemchedoquanli");
		return null;

	}
}
