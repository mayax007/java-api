import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    protected void processRequest(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        PrintWriter out = response.getWriter();
        String action = request.getParameter("ACTION");

        if (action != null) {
            String arrayAction[] = action.split("\\.");

            out.print("ACTION");
        } else {
            out.print("ACTION parameter is missing or null");
        }
        /*
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String action = request.getParameter("ACTION");
        String[] arrayAction = action.split("\\.");

        switch (arrayAction[0]) {
            case "USUARIO":
                UsuarioAction usuarioAction = new UsuarioAction();
                String respUser = usuarioAction.execute(request, response);
                out.print(respUser);
                break;
            case "PELICULA":
                String resp = new PeliculaAction().execute(request, response);
                System.out.println(resp);
                out.print(resp);

                break;

        * */
    }
}
