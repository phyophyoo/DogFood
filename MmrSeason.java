package JpProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MmrWeather
 */
@WebServlet("/MmrWeather")
public class MmrSeason extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MmrSeason() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] Season = {"夏","雨季","寒"};
		int index = (int)(Math.random()*3);
		String weather = Season[index]+ "";
		if(index==0)
		{
			weather+= "は3月から5月です。";
		}
		else if(index==1)
		{
			weather+= "は6月から9月です。";
		}
		else
		{
			weather+="は10月から2月です。";
		}


		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ミャンマーの季節</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + weather + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
