/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dappointmentmodel;

/**
 *
 * @author Lenovo
 */
public class dappointments extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet</title>");            
            out.println("</head>");
            out.println("<style>");
            out.println("body{");
            out.println("background-image: url(https://img.freepik.com/free-vector/clean-medical-background_53876-116875.jpg?w=1380&t=st=1665636311~exp=1665636911~hmac=8c8ebe58817b1878696487cf35cb9dee7d091dbf42a1971ed10a6219650ef45a);\n" +
"                background-repeat: no-repeat;\n" +
"                background-size: 100%;");
            out.println("}");
            out.println("table{margin-left: 35%; margin-top: 12%;}");
            out.println("#first{");
            out.println("float:left");
            out.println("padding: 20px");
            out.println("}");
            out.println("</style>");
            out.println("<body>");
            
            dappointmentmodel mod1=new dappointmentmodel();
                
            mod1.connectionjdbc();
            ArrayList<String> pid=mod1.getPid();
            
            ArrayList<String> name=mod1.getName();
            ArrayList<String> age=mod1.getAge();
            ArrayList<String> phno=mod1.getPhno();
            ArrayList<String> gender=mod1.getGender();
            ArrayList<String> symptom=mod1.getSymptom();
            ArrayList<String> date=mod1.getDate();
            int i=0;
           
            out.println("<table border='2'>");
            out.println("<th>USERNAME</th>");
             out.println("<th>GENDER</th>");
             out.println("<th>DATE</th>");
             
            while(i<name.size()){
                out.println("<tr>");
                out.println("<td>"+name.get(i)+"</td>");
                out.println("<td>"+gender.get(i)+"</td>");
                out.println("<td>"+date.get(i)+"</td>");
                out.println("</tr>");
                i=i+1;
            }
            out.println("</table>");
            out.println("</div>");
            i=0;
           
            while(i<name.size()){
                
                i=i+1;
            }
           
            
          
     

            
            request.setAttribute("pid",pid);
            request.setAttribute("name",name);
            request.setAttribute("age",age);
            request.setAttribute("phno",phno);
            request.setAttribute("gender",gender);
            request.setAttribute("symptom",symptom);
            request.setAttribute("date",date);  
         
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
        processRequest(request, response);
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
        processRequest(request, response);
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
