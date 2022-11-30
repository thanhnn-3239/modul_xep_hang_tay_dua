package controller;

import dao.MuaGiaiDAO;
import dao.XepHangTayDuaDAO;
import model.MuaGiai;
import model.XepHangTayDua;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/xep-hang-tay-dua")
public class RankRacersController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<MuaGiai> dsMuaGiai = new MuaGiaiDAO().getListMuaGiai();
        MuaGiai mg = null;
        ArrayList<XepHangTayDua> dsXepHangTayDua = new XepHangTayDuaDAO().getListRankRacers(mg);
        req.setAttribute("dsXepHangTayDua", dsXepHangTayDua);
        RequestDispatcher rd = req.getRequestDispatcher("rankracers.jsp");
        rd.forward(req, resp);
    }
}
