package hello;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public login() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String nome = request.getParameter("usuario");
        String senha = request.getParameter("senha");

        if(nome.equals("servlet@gmail.com") && senha.equals("12345")){
            response.sendRedirect("paginaPrincipal.html");
        } else {
            response.sendRedirect("index.html");
        }
    }
}