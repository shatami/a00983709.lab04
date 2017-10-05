package a00983709.lab04;

import java.io.IOException;
import a00983709.lab04.tools.TempConverter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lab04Servlet
 */
@WebServlet("/Lab04Servlet")
public class Lab04Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
    private static String instruction;
    private static String title;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
//	public void init() throws ServletException {
//		// TODO Auto-generated method stub
//		ServletConfig config = getServletConfig();
//		instruction = config.getInitParameter("instruction");
//		title = config.getInitParameter("title");
//	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("temp").equals("celsius")) {
			TempConverter.celsiusToFahrenheit(Double.parseDouble(request.getParameter("input")));
		}
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
//		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
