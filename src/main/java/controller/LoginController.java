package controller;

import model.NguoiDung;
import untils.SessionUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

@WebServlet(urlPatterns = {"/login", "/logout"})
public class LoginController extends HttpServlet {

    Locale localeVi = new Locale("vi");
    ResourceBundle resourceBundle = ResourceBundle.getBundle("message", localeVi);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action != null && action.equals("login")){
            String alert = req.getParameter("alert");
            String message = req.getParameter("message");
            if (message != null && alert != null) {
                req.setAttribute("message", resourceBundle.getString(message));
                req.setAttribute("alert", alert);
            }
            RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
            rd.forward(req, resp);
        }
        else if(action != null && action.equals("logout")){
            SessionUtil.getInstance().removeValue(req, "nguoi-dung");
            resp.sendRedirect(req.getContextPath()+"/login");
        }
        else {
            RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
            rd.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action != null && action.equals("login")) {
            String user = req.getParameter("username");
            String pass = req.getParameter("password");
            NguoiDung sv = new NguoiDung();
            sv.setTenDangNhap(user);
            sv.setMatKhau(pass);

//            sv = sinhVienService.checkLogin(sv);
            if (sv != null) {
                SessionUtil.getInstance().putValue(req,"sinhvien", sv);
                resp.sendRedirect(req.getContextPath() + "/trang-chu");
            } else {
                resp.sendRedirect(req.getContextPath()+"/dang-nhap?action=login&message=username_password_invalid&alert=danger");
            }
        }
    }
}
