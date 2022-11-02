/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.ArrayList;
import java.util.Date;  
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.homepagemodel1;

/**
 *
 * @author Lenovo
 */
public class day extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet day</title>");            
            out.println("</head>");
            out.println("<body>");
             String date= request.getParameter("date");
            String doc= request.getParameter("docid");
            
           
           
            request.setAttribute("doc",doc);
            
           Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date); 
           SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
           String strdate=formatter.format(date1);
           
           out.println(strdate);
           
           Calendar c = Calendar.getInstance();
        c.setTime(date1);
        int dayOfWeek = (c.get(Calendar.DAY_OF_WEEK))-1;
        System.out.println("Day of week in number:"+dayOfWeek);
        String dayWeekText = new SimpleDateFormat("EEEE").format(date1);
        System.out.println("Day of week in text:"+dayWeekText);
        request.setAttribute("dayWeekText",dayWeekText);
        
        homepagemodel1 m1=new homepagemodel1();
        ArrayList<String> arrayList =m1.connectionjdbc(dayWeekText);
        request.setAttribute("list",arrayList);
        request.setAttribute("date",strdate);
       RequestDispatcher dispatcher = request.getRequestDispatcher("pappointment.jsp");
            dispatcher.forward(request,response);
            out.println("<h1>Servlet day at " + date1+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(day.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(day.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
