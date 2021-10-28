package org.example.http.servlet;

import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.annotation.Inherited;

@WebServlet("/servlet")
public class HttpSessionServlet extends HttpServlet {
    private static final String NAME = "name";

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        HttpSession httpSession = req.getSession();
        if(httpSession == null){
            resp.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return;
        }

        String name = req.getParameter(NAME);
        if(!StringUtils.isEmpty(name)){
            httpSession.setAttribute(NAME, name);
            resp.getWriter().println("New name have been received - " + name);
            return;
        }

        Object nameAttribute = httpSession.getAttribute(NAME);
        if(!(nameAttribute instanceof String)){
            resp.getWriter().println("There is no saved name");
            return;
        }

        String currentName = (String) nameAttribute;
        resp.getWriter().println("Current name: " + currentName);
    }
}
