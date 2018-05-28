import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet4")
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		Cookie ck=new Cookie("name", uname); 
		response.addCookie(ck); 
		
		PrintWriter out = response.getWriter();
		out.println("Name: "+uname);
		out.println("<form action='Servlet41'>");
		out.println("<input type='submit'");
		out.println("</form>");

	}

}
