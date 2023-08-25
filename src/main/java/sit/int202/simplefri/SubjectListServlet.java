package sit.int202.simplefri;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.simplefri.entities.Subject;
import sit.int202.simplefri.repositories.SubjectRepository;

@WebServlet(name = "SubjectListServlet", value = "/subject-list")
public class SubjectListServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        SubjectRepository sr = new SubjectRepository();
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>subject list::</h1>");
        for (Subject sub : sr.findAll()){
            out.println(sub.getId());
            out.println(" ");
            out.println(sub.getTitle());
            out.println(" ");
            out.println("<br>");
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}