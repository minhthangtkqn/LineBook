package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TrangCaNhanAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();

		System.out.println("TrangCaNhanAction");
		
		if (session.getAttribute("userID") == null)
			return mapping.findForward("trangchu"); // neu chua dang nhap dua ve
		// trang chu

		/**
		 * Neu da dang nhap
		 */
		
		int userType = (Integer) session.getAttribute("type");
		String userID = (String) session.getAttribute("userID");

		// Lay thong tin ca nhan cua user
		System.out.println("Phan luong` trang ca nhan");
		if (userType == 1)
			return mapping.findForward("nguoiDung");
		if (userType == 2)
			return mapping.findForward("nguoiDung");
		if (userType == 0) {
			// Bat Dau xu li

			// Lay thong tin ho so

			// Lay danh sach cho duyet
			// Lay danh sach dang ban
			// lay danh sach da ban

			return mapping.findForward("manager");
		}
		return mapping.findForward("trangchu");

	}
}
