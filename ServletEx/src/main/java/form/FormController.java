package form;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form.do")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("./form.do [GET]");
		
		// 요청에 대한 처리를 다른 자원으로 넘겨줄 수 있는 객체
		RequestDispatcher rd;
		
		// 첫번째 매개변수인 request에 WEB Container가 동적자원 처리하기 위해 요청에 대한 정보들을 매개변수로 넘겨준다
		// 해당 request에 getDispatcher객체를 준비하여,
		// doGet()으로 전달된 요청 정보를 다른 자원으로 넘길 수 있더록 rd에 담아 준비.
		// 매개변수로 webapp에 있는 jsp파일의 경로를 문자열로 넣어 준다
		rd = request.getRequestDispatcher("/WEB-INF/views/inputForm.jsp");
		
		// 지정된 JSP파일로 요청 처리 맡기기
		// forward()에 WAS가 넘겨준 request와 response를 넘겨준다.
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("./form.do [POST]");
		//--------------------------------------------------
		// 1. 요청 데이터의 한글인코딩 방식 지정하기 : UTF-8
		request.setCharacterEncoding("UTF-8");
		// 2. 응답 데이터의 형식 지정하기 : HTML문서, 한글인코딩 UTF-8적용
		response.setContentType("text/html; charset=UTF-8");
		//--------------------------------------------------
		// 3. form.do의 input태그에 입력받은 getParameter는,
		//	  name속성의 값인 userid / userpw를 읽어온다  
		String uid = request.getParameter("userid");
		String upw = request.getParameter("userpw");
		System.out.println("uid: " + uid);
		System.out.println("upw: " + upw);
		//--------------------------------------------------
		// 4. 서블릿으로 클아이언트에 직접 응답하는 방법
		
		// 방법1) response.getWriter();
		// 방법2) response.getOutputStream();

		// => 데이터를 입력하는 방법1,2 의 차이가 있지만 Writer가 편하다.
		
		// ex) 아래와 같이 .append로 이어서 작성 가능 
		response.getWriter()
		.append("<h1>전달받은 데이터</h1>")
		.append("<hr>")
		.append("")
		.append("<h3>아이디 : " + uid + "</h3>")
		.append("<h3>비밀번호 : " + upw + "</h3>");
		
		response.getWriter()
		.append("<br>")
		.append("<a href='./form.do'><button>입력 폼으로</button></a>");
		
	}

}
