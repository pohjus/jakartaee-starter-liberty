package fi.company;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/helloworld")
public class MyServlet extends HttpServlet {
  public void doGet (HttpServletRequest req,
                     HttpServletResponse res)
    throws ServletException, IOException {

    try(PrintWriter out = res.getWriter()) {
        out.println("Hello World!");
    }

  }
}