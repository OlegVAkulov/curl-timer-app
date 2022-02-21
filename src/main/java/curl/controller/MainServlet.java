package curl.controller;

import curl.StartCurlConnectionTimer;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;

@WebServlet(name = "MainServlet", value = "/MainServlet")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        StartCurlConnectionTimer startCurlConnectionTimer = new StartCurlConnectionTimer();
        startCurlConnectionTimer.runTimer();
        pw.println("Timer run");
        pw.println(startCurlConnectionTimer.getClass());
        pw.println(startCurlConnectionTimer.getInfo());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
