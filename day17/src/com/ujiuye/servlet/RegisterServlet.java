package com.ujiuye.servlet;

import com.ujiuye.entity.User;
import com.ujiuye.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    UserService service = new UserService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        User user = service.testUserName(username);
        if(user==null){
            resp.getWriter().print(0);
        }else{
            resp.getWriter().print(1);
        }
    }
}
