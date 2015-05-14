package exam.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=UTF-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		String[] hobby = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head></head>");
		out.print("<body>");
		
		
		out.println("<table border='1'>");
		out.println("<tr><th>아이디 : </th><td>" + id + "</td></tr>");
		out.println("<tr><th>비밀번호 : </th><td>" + pwd + "</td></tr>");
		
		out.println("<tr><th>좋아하는 색 : </th><td bgcolor='" + color + "'>" + color + "</td>");
		out.println("<tr><th>취미 : </th><td>");
		
		if(hobby != null) {
			/* for(int i=0; i<hobby.length; i++) {
				out.println(hobby[i]);
			} */
			
			for(String item : hobby) {
				out.println(item + "<br>");
			}
		}
		
		else
			out.println("취미를 선택하세요.");
		
		out.println("</td></tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
