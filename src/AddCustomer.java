import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.beans.Customizer;
import java.io.IOException;

@WebServlet(name = "AddCustomer", urlPatterns = "/add")
public class AddCustomer extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("address");
        DB.add(new Customer(firstName,lastName,phoneNumber,address));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/display");
        dispatcher.forward(request,response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
