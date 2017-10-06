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

import a00983709.lab04.tools.InputValidator;

/**
 * Servlet implementation class Lab04Servlet
 */
@WebServlet("/Lab04Servlet")
public class Lab04Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
//	private static String instruction;
	private boolean validOrNot = true;
	private String regexInput;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(){		
		ServletConfig config = getServletConfig();
		regexInput = config.getInitParameter("input");	
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("static-access")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String input = request.getParameter("input");
		validOrNot = InputValidator.isValidInput(input, regexInput);
		if(validOrNot) {
			if(request.getParameter("temp").equals("celsius")) {
				request.setAttribute("temp", request.getParameter("temp"));
				request.setAttribute("input", request.getParameter("input"));
				request.setAttribute("convertedTemp", TempConverter.fahrenheitToCelsius(Double.parseDouble(request.getParameter("input"))));
			}
			else {
				request.setAttribute("temp", request.getParameter("temp"));
				request.setAttribute("input", request.getParameter("input"));
				request.setAttribute("convertedTemp", TempConverter.celsiusToFahrenheit(Double.parseDouble(request.getParameter("input"))));
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
			dispatcher.forward(request, response);
			
		}
		else {
			response.sendError(response.SC_BAD_REQUEST, "Invalid input, " + request.getParameter(input) + ". Enter ##.#");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
