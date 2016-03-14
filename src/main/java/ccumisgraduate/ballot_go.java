package ccumisgraduate;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ballot_go
 */
public class ballot_go extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ballot_go() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RandomGo app = new RandomGo();
		app.initialize();
		student boss = app.getBoss();
		student editer = app.getEditer();
		request.setAttribute("boss", boss);
		request.setAttribute("editer", editer);
		RequestDispatcher view = request.getRequestDispatcher("/pages/result.jsp");
		view.forward(request, response);
	}

}
