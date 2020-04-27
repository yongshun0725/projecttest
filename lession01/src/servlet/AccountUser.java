package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.impl.AccountDaoImpl;
@WebServlet(urlPatterns="/ResistCount")
public class AccountUser extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String age = req.getParameter("age");
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		user.setAge(Integer.parseInt(age));
		int i = new AccountDaoImpl().regist(user);
		if(i > 0) {
			System.out.println("×¢²á³É¹¦");
		}else{
			System.out.println("×¢²áÊ§°Ü");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
     
}
