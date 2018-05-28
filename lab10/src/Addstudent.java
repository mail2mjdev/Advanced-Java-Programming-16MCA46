

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Addstudent")
public class Addstudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String url = "jdbc:mysql://localhost:3306/studentdb";
	String user ="root";
	public String pass ="";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String usn = request.getParameter("usn");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root",""); 
			Statement stmt=con.createStatement();
			String query="insert into student values(\""+usn+"\",\""+name+"\")";
			stmt.executeUpdate(query);
			String query2= "select * from student";
			ResultSet rs = stmt.executeQuery(query2);
			
				while(rs.next()) {
					out.println(rs.getString(1));
					out.println(rs.getString(2));
				}
			con.close();
		} catch(Exception e) {
			out.println(e);
		}
		
		
	}

}
