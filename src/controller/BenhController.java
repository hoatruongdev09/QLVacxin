package controller;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bean.*;
import dao.*;
import bo.*;

/**
 * Servlet implementation class BenhController
 */
@WebServlet("/BenhController")
public class BenhController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BenhBo benhBo;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BenhController() {
        super();
        // TODO Auto-generated constructor stub
        benhBo = new BenhBo();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			ArrayList<BenhBean> dsBenh = benhBo.danhSachBenh();
			request.setAttribute("dsBenh", dsBenh);
			request.getRequestDispatcher("DanhSachBenh.jsp").forward(request, response);
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
		if(request.getParameter("add") != null) {
			String tenBenh = request.getParameter("tenbenh");
			String moTa = request.getParameter("mota");
			try {
				benhBo.themBenh(tenBenh, moTa);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			doGet(request, response);
		}
		if(request.getParameter("edit") != null) {
			int maBenh = Integer.parseInt(request.getParameter("mabenh"));
			try {
				BenhBean benh = benhBo.layThongTinBenh(maBenh);
				request.setAttribute("benh", benh);
				request.getRequestDispatcher("SuaBenh.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(request.getParameter("submit-change") != null) {
			int maBenh = Integer.parseInt(request.getParameter("mabenh"));
			String tenBenh = request.getParameter("tenbenh");
			String moTa = request.getParameter("mota");
			
			try {
				benhBo.suaThongTinBenh(maBenh, tenBenh, moTa);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			doGet(request, response);
		}
	}
	
	
	
	

}





































