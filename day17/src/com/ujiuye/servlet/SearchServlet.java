package com.ujiuye.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.entity.User;
import com.ujiuye.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SearchServlet extends HttpServlet {
    UserService service = new UserService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String search = req.getParameter("search");
        List<User> list = service.search(search);
        ObjectMapper mapper = new ObjectMapper();
        String jsonlist = mapper.writeValueAsString(list);
        resp.getWriter().print(jsonlist);
    }
}
