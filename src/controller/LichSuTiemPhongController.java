package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.*;
import bo.*;

/**
 * Servlet implementation class LichSuTiemPhongController
 */
@WebServlet("/LichSuTiemPhongController")
public class LichSuTiemPhongController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LichSuTiemPhongBo lsTiemPhongBo;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LichSuTiemPhongController() {
        super();
        // TODO Auto-generated constructor stub
        lsTiemPhongBo = new LichSuTiemPhongBo();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			ArrayList<KH_LS_VC> listLS = lsTiemPhongBo.danhSachKhachHangVacxin();
			request.setAttribute("listLS", listLS);
			request.getRequestDispatcher("DanhSachLichSu.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		if(request.getParameter("delete") != null) {
			int maKhachHang = Integer.parseInt(request.getParameter("makhachhang"));
			int maVacxin = Integer.parseInt(request.getParameter("mavacxin"));
			int sttMui = Integer.parseInt(request.getParameter("sttmui"));
			
			try {
				lsTiemPhongBo.xoaLichSu(maKhachHang, maVacxin, sttMui);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			doGet(request, response);
		}
	}

}
