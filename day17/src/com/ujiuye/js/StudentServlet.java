package com.ujiuye.js;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.entity.Student;
import com.ujiuye.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/dragonball")
public class StudentServlet extends HttpServlet {
    StudentService service = new StudentService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String search = req.getParameter("search");
        List<Student> stuMation = service.findStuMation(search);
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(stuMation);
        resp.getWriter().print(s);

    }
}
