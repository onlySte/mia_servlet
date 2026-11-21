package it.exolab.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import it.exolab.dao.AutomobileDao;
import it.exolab.model.Automobile;

/**
 * Servlet implementation class AutomobiliServlet
 */
@WebServlet("/registrazione")
public class AutomobiliServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutomobiliServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String marcaAuto = request.getParameter("marca");
		String modelloAuto = request.getParameter("modello");
//		request.setAttribute("marca", marcaAuto);
//		request.setAttribute("modello", modelloAuto);
		Automobile auto = new Automobile();
		auto.setMarca(marcaAuto);
		auto.setModello(modelloAuto);
		
		AutomobileDao dao = new AutomobileDao();
		dao.insert(auto);
		
		request.setAttribute("car", auto);
		request.getRequestDispatcher("risultato.jsp").forward(request, response);
		
	}

}
