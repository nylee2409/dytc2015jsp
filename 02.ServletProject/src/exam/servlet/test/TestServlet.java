package exam.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * GET 방식 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 요청처리 한글
		//request.setCharacterEncoding("UTF-8");
		
		// 응답처리 한글화 
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("==========GET================<br>");
		
		
		String name = request.getParameter("name");
		
		out.print("이름 : " + name + "<br>");
		
		
		String[] hobby = request.getParameterValues("hobby");
		
		for(int i=0; i<hobby.length; i++)
			out.print("취미 : " + hobby[i]);
		
		
		String gender = request.getParameter("gender");
		
		out.print("<br>성별 : " + gender);
		
		
	}

	/**
	 * POST 방식
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 요청처리 한글
		//request.setCharacterEncoding("UTF-8");

		// 응답처리 한글 
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("==========POST================<br>");
		
		String name = request.getParameter("name");
		
		out.print(name);
	}

}
