import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")


public class Counter extends HttpServlet {
    public int count = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        count++;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1> Count: "+ count +" </h1>");



    }

}
