package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bo.BaiRaoBanBO;
import model.bo.BannerBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.TrangChuForm;

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

public class TrangChuAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		System.out.println("TrangChuAction");
		
		HttpSession session = request.getSession();
		TrangChuForm trangChuForm = (TrangChuForm) form;

		BannerBO bannerBO = new BannerBO();
		BaiRaoBanBO baiRaoBanBO = new BaiRaoBanBO();
		
		// Lay danh sach banner
		trangChuForm.setDsBanner(bannerBO.layDSBanner());
		
		// Lay danh sach moi nhat
		trangChuForm.setDsMoiNhat(baiRaoBanBO.layDanhSachMoiNhat());
		
		// lay danh sach ngau nhien
		trangChuForm.setDsNgauNhien(baiRaoBanBO.layDanhSachNgauNhien());
		
		// lay ds hot
		trangChuForm.setDsDanhMucBanNhieu(baiRaoBanBO
				.layDanhSachDanhMucBanNhieuNhat());
		
		if (session.getAttribute("userID") == null) {
			
			return mapping.findForward("index"); // neu chua dang nhap dua ve trang chu
		}
		
		// Bat Dau xu li
		int userType = (Integer) session.getAttribute("type");
		String userID = (String) session.getAttribute("userID");

		// lay DS goi y
		trangChuForm.setDsGoiY(baiRaoBanBO.layDanhSachGoiY(userID));

		return mapping.findForward("home");
	}
}
